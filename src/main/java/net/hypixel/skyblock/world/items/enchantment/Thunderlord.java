package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class Thunderlord extends ModEnchantment {

	public Thunderlord() {
		super(Rarity.RARE, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return ench != EnchantmentInit.thunderbolt.get();
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}