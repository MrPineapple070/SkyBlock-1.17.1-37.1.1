package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

/**
 * The Life Steal {@link Enchantment}.<br>
 * This {@code Enchantment} will heal the player .1% of the damage the player
 * deals to any entity.
 *
 * @author MrPineapple070
 * @version 16 May 2020
 */
public class LifeSteal extends ModEnchantment {
	public LifeSteal() {
		super(Rarity.VERY_RARE, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return ench != EnchantmentInit.syphon.get();
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}
}