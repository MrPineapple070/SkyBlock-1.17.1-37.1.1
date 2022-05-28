package net.hypixel.skyblock.world.items.crafting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.hypixel.skyblock.util.JSONUtils;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class ForgeRecipe implements IForgeRecipe {
	public static final class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>>
			implements RecipeSerializer<ForgeRecipe> {

		@Override
		public ForgeRecipe fromJson(ResourceLocation id, JsonObject json) {
			JsonArray array = json.getAsJsonArray("input");
			ItemStack[] temp = new ItemStack[array.size()];
			for (int i = 0; i < array.size(); i++) {
				JsonObject obj = array.get(i).getAsJsonObject();
				temp[i] = new ItemStack(JSONUtils.getAsItem(obj, "item"), JSONUtils.getAsInt(obj, "count"));
			}
			return new ForgeRecipe(id, NonNullList.of(ItemStack.EMPTY, temp),
					CraftingHelper.getItemStack(JSONUtils.getAsJsonObject(json, "output"), true),
					JSONUtils.getAsInt(json, "time", 0));
		}

		@Override
		public ForgeRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf data) {
			List<ItemStack> temp = new ArrayList<>();
			ItemStack stack = data.readItem();
			while (!stack.isEmpty()) {
				temp.add(stack);
				stack = data.readItem();
			}
			List<ItemStack> input = temp.subList(0, temp.size() - 2);
			return new ForgeRecipe(id, NonNullList.of(ItemStack.EMPTY, input.toArray(new ItemStack[input.size()])),
					temp.get(temp.size() - 1), data.readInt());
		}

		@Override
		public void toNetwork(FriendlyByteBuf data, ForgeRecipe recipe) {
			for (ItemStack stack : recipe.input)
				data.writeItem(stack);
			data.writeItem(recipe.output);
			data.writeInt(recipe.time);
		}
	}

	/**
	 * {@link Logger}
	 */
	@Nonnull
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * {@link ResourceLocation} for the id.
	 */
	@Nonnull
	public final ResourceLocation id;

	/**
	 * Array of {@link ItemStack} as the input
	 */
	@Nonnull
	public final NonNullList<ItemStack> input;

	/**
	 * Output {@link ItemStack} for this {@link IForgeRecipe}
	 */
	@Nonnull
	public final ItemStack output;

	/**
	 * The amount of ticks it will take to forge.
	 */
	public final int time;

	public ForgeRecipe(ResourceLocation id, NonNullList<ItemStack> input, ItemStack output, int time) {
		this.id = Objects.requireNonNull(id, "ID cannot be null");
		this.input = Objects.requireNonNull(input, "input cannot be null");
		this.output = Objects.requireNonNull(output, "output cannot be null");
		this.time = time;
		LOGGER.debug("Intput:\t" + this.input.toString());
		LOGGER.debug("Output:\t" + this.output.toString());
		LOGGER.debug("Time:\t" + String.valueOf(this.time));
	}

	@Override
	public boolean matches(CraftingContainer inv, Level world) {
		return false;
	}

	@Override
	public ItemStack assemble(CraftingContainer inv) {
		return ItemStack.EMPTY;
	}

	@Override
	public ItemStack getResultItem() {
		return this.output.copy();
	}

	@Override
	public ResourceLocation getId() {
		return recipe_type_id;
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return RecipeSerializerInit.forge_serializer.get();
	}
}