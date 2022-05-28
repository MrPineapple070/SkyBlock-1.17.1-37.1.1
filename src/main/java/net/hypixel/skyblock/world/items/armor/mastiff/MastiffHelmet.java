package net.hypixel.skyblock.world.items.armor.mastiff;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class MastiffHelmet extends ModArmorItem {
	public MastiffHelmet() {
		super(MastiffSet.instance.getMaterial(), EquipmentSlot.HEAD, ItemProperties.combat_1,
				MastiffSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(MastiffSet.instance.getDescription(this.slot));
		} catch (final IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}