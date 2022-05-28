package net.hypixel.skyblock.world.items.crafting;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.SkyBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

public interface IForgeRecipe extends Recipe<CraftingContainer> {
	/**
	 * {@link ResourceLocation} that is the ID for this {@link Recipe}.
	 */
	@Nonnull
	public static final ResourceLocation recipe_type_id = new ResourceLocation(SkyBlock.MOD_ID, "forge");

	@Override
	default boolean canCraftInDimensions(int width, int height) {
		return true;
	}
	
	@Override
	default RecipeType<?> getType() {
		return RecipeType.register("forge");
	}
}