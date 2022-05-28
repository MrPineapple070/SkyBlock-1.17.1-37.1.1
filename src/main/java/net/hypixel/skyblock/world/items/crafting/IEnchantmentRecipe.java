package net.hypixel.skyblock.world.items.crafting;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.items.enchantment.ModEnchantment;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraftforge.items.wrapper.RecipeWrapper;

/**
 * An {@link Recipe} of {@link RecipeWrapper} that handles the custom recipe
 * for {@link ModEnchantment}
 *
 * @author MrPineapple070
 * @version 11 October 2020
 * @since 11 October 2020
 */
public interface IEnchantmentRecipe extends CraftingRecipe {
	public static final ResourceLocation recipe_type_id = new ResourceLocation(SkyBlock.MOD_ID,
			"enchantment");

	@Override
	default boolean canCraftInDimensions(int width, int height) {
		return true;
	}

	@Nonnull
	NonNullList<ItemStack> getInputs();
}