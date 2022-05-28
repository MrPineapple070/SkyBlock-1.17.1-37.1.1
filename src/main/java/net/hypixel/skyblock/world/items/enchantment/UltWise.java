package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class UltWise extends UltimateEnchantment {
	public UltWise() {
		super(EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}