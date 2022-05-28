package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class Chimera extends UltimateEnchantment {
	public Chimera() {
		super(EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}