package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;

/**
 * The Smelting Touch {@link Enchantment}. <br>
 * This {@code Enchantment} will will auto smelt any block broken. <br>
 *
 * @author MrPineapple070
 * @version 16 May 2020
 */
public class SmeltingTouch extends ModEnchantment {
	public SmeltingTouch() {
		super(Rarity.UNCOMMON, EnchantmentCategory.DIGGER, new EquipmentSlot[] { EquipmentSlot.MAINHAND });
		this.descriptionId = "Smelting Touch";
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return ench != Enchantments.SILK_TOUCH;
	}

	@Override
	public int getMaxCost(int enchantmentLevel) {
		return this.getMinCost(enchantmentLevel) + 10;
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public int getMinCost(int enchantmentLevel) {
		return 11 * enchantmentLevel;
	}
}