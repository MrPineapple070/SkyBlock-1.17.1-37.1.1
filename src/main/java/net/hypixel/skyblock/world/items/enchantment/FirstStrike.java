package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class FirstStrike extends ModEnchantment {
	public FirstStrike() {
		super(Rarity.COMMON, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}
	
	@Override
	public float getDamageBonus(int lvl, MobType attribute) {
		return 1.25f * lvl;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return ench != EnchantmentInit.triple_strike.get();
	}

	@Override
	public int getMaxLevel() {
		return 4;
	}
}