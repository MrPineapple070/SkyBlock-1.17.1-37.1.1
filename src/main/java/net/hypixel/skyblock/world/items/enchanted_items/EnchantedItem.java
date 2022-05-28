package net.hypixel.skyblock.world.items.enchanted_items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

public class EnchantedItem extends Item {
	public EnchantedItem(Properties properties) {
		super(properties);
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
		return true;
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