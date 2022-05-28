package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class Growth extends ModEnchantment {
	public Growth() {
		super(Rarity.COMMON, EnchantmentCategory.ARMOR, new EquipmentSlot[] { EquipmentSlot.HEAD,
				EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET });
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return true;
	}

	@Override
	public int getMaxLevel() {
		return 4;
	}
}