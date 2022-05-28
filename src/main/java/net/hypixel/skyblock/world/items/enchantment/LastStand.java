package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class LastStand extends UltimateEnchantment {
	public LastStand() {
		super(EnchantmentCategory.ARMOR, armor);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}