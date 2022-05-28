package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

/**
 * @author MrPineapple070
 * @version 13 October 2020
 * @since 13 October 2020
 */
public class Critical extends ModEnchantment {
	protected Critical() {
		super(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return true;
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public void doPostAttack(LivingEntity user, Entity target, int damage) {
		target.hurt(DamageSource.mobAttack(user), 1.1f * damage);
	}
}