package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class TripleStrike extends ModEnchantment {

	public TripleStrike() {
		super(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return ench != EnchantmentInit.first_strike.get();
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}