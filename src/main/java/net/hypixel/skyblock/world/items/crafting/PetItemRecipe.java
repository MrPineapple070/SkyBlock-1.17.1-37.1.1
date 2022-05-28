package net.hypixel.skyblock.world.items.crafting;

import java.util.Objects;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;

import net.hypixel.skyblock.util.JSONUtils;
import net.hypixel.skyblock.util.ListUtil;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistryEntry;

/**
 * @author MrPineapple070
 * @version 11 October 2020
 * @since 11 October 2020
 */
public class PetItemRecipe implements IPetRecipe {
	/**
	 * Serializer for this recipe.
	 * 
	 * {@link ForgeRegistryEntry} of {@link RecipeSerializer} implementing
	 * {@link RecipeSerializer} of {@link EnchantmentRecipe} for
	 * {@link PetItemRecipe}
	 */
	public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>>
			implements RecipeSerializer<PetItemRecipe> {
		@Override
		public PetItemRecipe fromJson(ResourceLocation recipeId, JsonObject json) {
			final String group = JSONUtils.getAsString(json, "group", "");
			final NonNullList<Ingredient> ingredients = ListUtil
					.readIngredients(JSONUtils.getAsJsonArray(json, "ingredients"));
			if (ingredients.isEmpty())
				throw new JsonParseException("No ingredients for recipe");
			else if (ingredients.size() > 9)
				throw new JsonParseException("Too many ingredients for recipe the max is " + 9);
			else
				return new PetItemRecipe(recipeId, group, ingredients,
						itemFromJson(JSONUtils.getAsJsonObject(json, "result")));
		}

		@Override
		public PetItemRecipe fromNetwork(ResourceLocation recipeId, FriendlyByteBuf buffer) {
			final NonNullList<Ingredient> ingredients = NonNullList.withSize(buffer.readVarInt(), Ingredient.EMPTY);
			for (int j = 0; j < ingredients.size(); ++j)
				ingredients.set(j, Ingredient.fromNetwork(buffer));
			return new PetItemRecipe(recipeId, buffer.readUtf(0x7FFF), ingredients, buffer.readItem());
		}

		@Override
		public void toNetwork(FriendlyByteBuf buffer, PetItemRecipe recipe) {
			buffer.writeUtf(recipe.group);
			buffer.writeVarInt(recipe.inputs.size());
			for (final Ingredient ingredient : recipe.inputs)
				ingredient.toNetwork(buffer);
			buffer.writeItem(recipe.output);
		}
	}
	
	/**
	 * {@link Logger}
	 */
	@Nonnull
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * Gets an {@link ItemStack} from a {@link JsonObject}.
	 * 
	 * @param obj {@link JsonObject} to read from
	 * @return {@link ItemStack} read
	 */
	@SuppressWarnings("deprecation")
	protected static final ItemStack itemFromJson(JsonObject obj) {
		String s = GsonHelper.getAsString(obj, "item");
		int count = GsonHelper.getAsInt(obj, "count");
		Item item = Registry.ITEM.getOptional(new ResourceLocation(s)).orElseThrow(() -> {
			return new JsonSyntaxException("Unknown item '" + s + "'");
		});

		if (item == Items.AIR)
			throw new JsonSyntaxException("Invalid item: " + s);
		if (count <= 0)
			count = 1;

		return new ItemStack(item, count);
	}

	/**
	 * {@link String} that is the name of the group.
	 */
	@Nonnull
	private final String group;

	/**
	 * {@link ResourceLocation} for the id.
	 */
	@Nonnull
	private final ResourceLocation id;

	/**
	 * Input {@link Ingredient} for this {@link PetItemRecipe}.
	 */
	@Nonnull
	private final NonNullList<Ingredient> inputs;

	/**
	 * Output {@link Item} for this {@link IEnchantedItemRecipe}
	 */
	@Nonnull
	private final ItemStack output;

	public PetItemRecipe(ResourceLocation id, String group, NonNullList<Ingredient> inputs, ItemStack output) {
		this.id = Objects.requireNonNull(id, "id cannot be null");
		this.group = Objects.requireNonNull(group, "group cannot be null");
		this.inputs = Objects.requireNonNull(inputs, "inputs cannot be null");
		this.output = Objects.requireNonNull(output, "output cannot be null");
		LOGGER.debug("Input:\t" + this.inputs.toString());
		LOGGER.debug("Output:\t" + this.output.toString());
	}

	@Override
	public ItemStack assemble(CraftingContainer inv) {
		return this.output;
	}

	@Override
	public ResourceLocation getId() {
		return this.id;
	}

	@Override
	public NonNullList<Ingredient> getIngredients() {
		return this.inputs;
	}

	@Override
	public ItemStack getResultItem() {
		return this.output;
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return RecipeSerializerInit.enchanted_item_serializer.get();
	}

	@Override
	public boolean matches(CraftingContainer inv, Level level) {
		return true;
	}
}