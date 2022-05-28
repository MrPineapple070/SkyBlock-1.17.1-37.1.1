package net.hypixel.skyblock.world.items.crafting;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.items.enchanted_items.EnchantedItem;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.items.wrapper.RecipeWrapper;

/**
 * An {@link Recipe} of {@link RecipeWrapper} that handles the custom recipe
 * for {@link EnchantedItem}.
 *
 * @author MrPineapple070
 * @version 11 October 2020
 * @since 11 October 2020
 */
public interface IPetRecipe extends CraftingRecipe {
	/**
	 * {@link ResourceLocation} that is the ID for this {@link Recipe}.
	 */
	public static final ResourceLocation recipe_type_id = new ResourceLocation(SkyBlock.MOD_ID, "pet_item");

	@Override
	default boolean canCraftInDimensions(int width, int height) {
		return false;
	}

	@Override
	NonNullList<Ingredient> getIngredients();

	@Nonnull
	@Override
	default RecipeType<?> getType() {
		return Registry.RECIPE_TYPE.get(recipe_type_id);
	}
}