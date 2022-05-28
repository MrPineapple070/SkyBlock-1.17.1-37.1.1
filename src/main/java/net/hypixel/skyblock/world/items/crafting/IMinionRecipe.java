package net.hypixel.skyblock.world.items.crafting;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.level.block.minion.AbstractMinionBlock;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeType;

/**
 * An {@link CraftingRecipe} that handles the custom recipe for
 * {@link AbstractMinionBlock}
 *
 * @author MrPineapple070
 * @version 16 October 2020
 * @since 16 October 2020
 */
public interface IMinionRecipe extends CraftingRecipe {
	/**
	 * {@link ResourceLocation} that is the ID for this {@link RecipeSerializerInit}.
	 */
	public static final ResourceLocation recipe_type_id = new ResourceLocation(SkyBlock.MOD_ID, "minion");

	@Override
	default boolean canCraftInDimensions(int width, int height) {
		return width * height < 0xA;
	}

	@Override
	public abstract NonNullList<Ingredient> getIngredients();

	@Nonnull
	@Override
	default RecipeType<?> getType() {
		return Registry.RECIPE_TYPE.get(recipe_type_id);
	}
}