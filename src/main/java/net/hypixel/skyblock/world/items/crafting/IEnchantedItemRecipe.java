package net.hypixel.skyblock.world.items.crafting;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.items.enchanted_items.EnchantedItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Recipe;

/**
 * An {@link CraftingRecipe} that handles the custom recipe for
 * {@link EnchantedItem}.
 *
 * @author MrPineapple070
 * @version 10 October 2020
 * @since 10 October 2020
 */
public interface IEnchantedItemRecipe extends CraftingRecipe {
	/**
	 * {@link ResourceLocation} that is the ID for this {@link Recipe}.
	 */
	@Nonnull
	ResourceLocation recipe_type_id = new ResourceLocation(SkyBlock.MOD_ID, "enchanted_item");

	@Override
	default boolean canCraftInDimensions(int width, int height) {
		return width * height < 10;
	}

	@Nonnull
	ItemStack getInput();
}