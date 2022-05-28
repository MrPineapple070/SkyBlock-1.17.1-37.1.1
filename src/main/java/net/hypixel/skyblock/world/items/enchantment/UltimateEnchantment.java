package net.hypixel.skyblock.world.items.enchantment;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public abstract class UltimateEnchantment extends ModEnchantment {
	public UltimateEnchantment(EnchantmentCategory type, EquipmentSlot... equipmentSlot) {
		super(Rarity.VERY_RARE, type, equipmentSlot);
	}

	@Override
	protected final boolean checkCompatibility(Enchantment ench) {
		return !(ench instanceof UltimateEnchantment);
	}
	
	@Override
	public Component getFullname(int level) {
		MutableComponent name = new TranslatableComponent(this.getDescriptionId()).withStyle(ChatFormatting.LIGHT_PURPLE);

		if (level != 1 || this.getMaxLevel() != 1)
			name.append(" ").append(new TranslatableComponent("enchantment.level." + level));

		return name;
	}
}