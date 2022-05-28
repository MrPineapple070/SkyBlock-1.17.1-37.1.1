package net.hypixel.skyblock.world.items.enchantment;

import net.hypixel.skyblock.world.entity.ModMobType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.enchantment.DamageEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;

/**
 * @author MrPineapple070
 * @version 13 October 2020
 * @since 13 October 2020
 */
public class ModDamageEnchantment extends DamageEnchantment {
	private static final int[] LEVEL_COST = { 11, 8, 8, 8 };
	private static final int[] LEVEL_COST_SPAN = { 20, 20, 20, 20 };
	private static final int[] MIN_COST = { 1, 5, 5, 5 };

	public ModDamageEnchantment(Rarity rarityIn, int damageTypeIn) {
		super(rarityIn, damageTypeIn, EquipmentSlot.MAINHAND);
	}

	/**
	 * Calculates the additional damage that will be dealt by an item with this
	 * enchantment. This alternative to calcModifierDamage is sensitive to the
	 * targets EnumCreatureAttribute.
	 */
	@Override
	public float getDamageBonus(int level, MobType creatureType) {
		switch (this.type) {
		case 3:
			if (creatureType == ModMobType.CUBE)
				return 1.1f * level;
			break;
		case 4:
			if (creatureType == ModMobType.DRAGON)
				return 1.08f * level;
			break;
		case 5:
			if (creatureType == ModMobType.ENDER)
				return 1.12f * level;
			break;
		case 6:
			if (creatureType == ModMobType.IMPAILING)
				return 1.125f * level;
			break;
		}
		return super.getDamageBonus(level, creatureType);
	}

	@Override
	public boolean checkCompatibility(Enchantment ench) {
		return true;
	}

	@Override
	public int getMaxCost(int enchantmentLevel) {
		return this.getMinCost(enchantmentLevel) + LEVEL_COST_SPAN[this.type];
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public int getMinCost(int enchantmentLevel) {
		return MIN_COST[this.type] + (enchantmentLevel - 1) * LEVEL_COST[this.type];
	}
}