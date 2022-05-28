package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class Bank extends UltimateEnchantment {
	public Bank() {
		super(EnchantmentCategory.ARMOR, armor);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}