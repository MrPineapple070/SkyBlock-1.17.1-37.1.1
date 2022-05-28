package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class NoPainNoGain extends UltimateEnchantment {
	public NoPainNoGain() {
		super(EnchantmentCategory.ARMOR, armor);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}