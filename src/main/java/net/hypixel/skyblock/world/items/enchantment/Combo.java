package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class Combo extends UltimateEnchantment {
	public Combo() {
		super(EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}