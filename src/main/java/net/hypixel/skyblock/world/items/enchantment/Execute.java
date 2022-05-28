package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class Execute extends ModEnchantment {
	public Execute() {
		super(Rarity.COMMON, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}
	
	@Override
	public void doPostAttack(LivingEntity attacker, Entity attacked, int lvl) {
		if (!(attacked instanceof Mob))
			return;
		attacked.hurt(DamageSource.mobAttack(attacker), 1 - attacker.getHealth()/attacker.getMaxHealth());
	}
	
	@Override
	public float getDamageBonus(int lvl, MobType attribute) {
		return .2f * lvl;
	}
	
	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return ench != EnchantmentInit.prosecute.get();
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}