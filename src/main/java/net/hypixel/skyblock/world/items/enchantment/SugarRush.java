package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class SugarRush extends ModEnchantment {
	public SugarRush() {
		super(Rarity.VERY_RARE, EnchantmentCategory.ARMOR_FEET, new EquipmentSlot[] { EquipmentSlot.FEET });
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return true;
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}
}