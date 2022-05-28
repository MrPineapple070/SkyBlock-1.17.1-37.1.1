package net.hypixel.skyblock.world.items.armor.mushroom;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class MushroomChestplate extends ModArmorItem {
	public MushroomChestplate() {
		super(MushroomSet.instance.getMaterial(), EquipmentSlot.CHEST, ItemProperties.farm_1,
				MushroomSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(MushroomSet.instance.getDescription(this.slot));
		} catch (final IllegalAccessException e) {
			LOGGER.error(e.getMessage());
		}
	}
}