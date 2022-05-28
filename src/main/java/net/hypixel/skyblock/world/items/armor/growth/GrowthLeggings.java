package net.hypixel.skyblock.world.items.armor.growth;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Armor_of_Growth#Leggings">GrowthSet
 * Leggings</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class GrowthLeggings extends ModArmorItem {
	public GrowthLeggings() {
		super(GrowthSet.instance.getMaterial(), EquipmentSlot.LEGS, ItemProperties.foraging_1,
				GrowthSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(GrowthSet.instance.getDescription(this.slot));
		} catch (IllegalAccessException iae) {
			LOGGER.error(iae.getMessage());
		}
	}
}