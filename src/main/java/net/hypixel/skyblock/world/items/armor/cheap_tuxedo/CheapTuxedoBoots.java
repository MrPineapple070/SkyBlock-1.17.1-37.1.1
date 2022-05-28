package net.hypixel.skyblock.world.items.armor.cheap_tuxedo;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class CheapTuxedoBoots extends ModArmorItem {

	public CheapTuxedoBoots() {
		super(CheapTuxedoSet.instance.getMaterial(), EquipmentSlot.FEET, ItemProperties.miscellaneous_1,
				CheapTuxedoSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(CheapTuxedoSet.instance.getDescription(this.slot));
		} catch (final IllegalAccessException e) {
			LOGGER.error(e.getMessage());
		}
	}
}