package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class GiantKiller extends ModEnchantment {

	public GiantKiller() {
		super(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return ench != EnchantmentInit.titan_killer.get();
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}