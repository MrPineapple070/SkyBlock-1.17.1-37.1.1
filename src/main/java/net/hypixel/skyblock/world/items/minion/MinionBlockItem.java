package net.hypixel.skyblock.world.items.minion;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;

public class MinionBlockItem extends BlockItem {
	public MinionBlockItem(Block blockIn, Properties builder) {
		super(blockIn, builder);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return false;
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack stack) {
		return false;
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return false;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}