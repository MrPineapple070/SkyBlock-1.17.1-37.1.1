package net.hypixel.skyblock.world.items.crafting;

import net.hypixel.skyblock.world.items.Backpack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.Tags.Items;

public class BackpackColoring extends CustomRecipe {

	public BackpackColoring(ResourceLocation id) {
		super(id);
	}

	@Override
	public boolean matches(CraftingContainer inv, Level world) {
		int num_backpack = 0;
		int num_dye = 0;

		for (int k = 0; k < inv.getContainerSize(); ++k) {
			ItemStack itemstack = inv.getItem(k);
			if (itemstack.isEmpty())
				continue;

			if (itemstack.getItem() instanceof Backpack)
				++num_backpack;
			else {
				if (!Items.DYES.contains(itemstack.getItem()))
					return false;
				++num_dye;
			}
			
			if (num_dye > 1 || num_backpack > 1)
				return false;
		}
		
		return num_backpack == 1 && num_dye == 1;
	}

	@Override
	public ItemStack assemble(CraftingContainer inv) {
		ItemStack original = ItemStack.EMPTY;
		DyeColor color = DyeColor.WHITE;
		
		for (int i = 0; i < inv.getContainerSize(); ++i) {
			ItemStack stack = inv.getItem(i);
			if (stack.isEmpty())
				continue;
			if (stack.getItem() instanceof Backpack)
				original = stack;
			else {
				DyeColor tmp = DyeColor.getColor(stack);
				if (tmp != null)
					color = tmp;
			}
		}
		
		ItemStack output = Backpack.getBackpackStack(((Backpack) original.getItem()).type, color);
		if (original.hasTag())
			output.setTag(original.getTag().copy());
		return output;
	}

	@Override
	public boolean canCraftInDimensions(int width, int height) {
		return width * height >= 2;
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return RecipeSerializerInit.backpack_color_seralizer.get();
	}
}