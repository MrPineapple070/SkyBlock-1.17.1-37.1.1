package net.hypixel.skyblock.world.items.enchantment;

import net.hypixel.skyblock.world.items.swords.AspectOfTheJerry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class UltJerry extends UltimateEnchantment {
	public UltJerry() {
		super(EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND);
	}
	
	@Override
	public boolean canEnchant(ItemStack stack) {
		return stack.getItem() instanceof AspectOfTheJerry;
	}
	
	@Override
	public int getMaxLevel() {
		return 5;
	}
}