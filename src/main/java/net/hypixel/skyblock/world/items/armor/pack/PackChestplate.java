package net.hypixel.skyblock.world.items.armor.pack;

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
 * "https://hypixel-skyblock.fandom.com/wiki/Armor_of_the_Pack#Helmet">PackSet
 * Helmet</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 October 2019
 */
public class PackChestplate extends ModArmorItem {
	public PackChestplate() {
		super(PackSet.instance.getMaterial(), EquipmentSlot.CHEST, ItemProperties.combat_1,
				PackSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(PackSet.instance.getDescription(this.slot));
		} catch (IllegalAccessException e) {
			LOGGER.info(e.getLocalizedMessage());
		}
	}
}