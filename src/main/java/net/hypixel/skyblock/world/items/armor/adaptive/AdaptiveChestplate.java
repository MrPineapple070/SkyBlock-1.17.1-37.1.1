package net.hypixel.skyblock.world.items.armor.adaptive;

import java.util.List;

import net.hypixel.skyblock.world.items.armor.DungeonArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class AdaptiveChestplate extends DungeonArmorItem {
	public AdaptiveChestplate() {
		super(AdaptiveSet.instance.getMaterial(), EquipmentSlot.CHEST, AdaptiveSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(AdaptiveSet.instance.getDescription(this.slot));
		} catch (final IllegalAccessException e) {
			LOGGER.error(e.getMessage());
		}
	}
}