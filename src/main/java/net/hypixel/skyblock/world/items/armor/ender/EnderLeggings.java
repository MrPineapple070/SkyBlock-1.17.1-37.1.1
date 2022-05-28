package net.hypixel.skyblock.world.items.armor.ender;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class EnderLeggings extends ModArmorItem {
	public EnderLeggings() {
		super(EnderSet.instance.getMaterial(), EquipmentSlot.LEGS, ItemProperties.combat_1,
				EnderSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(EnderSet.instance.getDescription(this.slot));
		} catch (final IllegalAccessException e) {
			LOGGER.error(e.getMessage());
		}
	}
}