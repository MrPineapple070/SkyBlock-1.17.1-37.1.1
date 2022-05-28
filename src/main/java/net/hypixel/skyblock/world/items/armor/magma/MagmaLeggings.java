package net.hypixel.skyblock.world.items.armor.magma;

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
 * "https://hypixel-skyblock.fandom.com/wiki/Armor_of_Magma#Leggings">MagmaSet
 * Leggings</a>
 *
 * @author MrPineapple070
 * @version 31 July 2020
 * @since 31 July 2020
 */
public class MagmaLeggings extends ModArmorItem {
	public MagmaLeggings() {
		super(MagmaSet.instance.getMaterial(), EquipmentSlot.LEGS, ItemProperties.combat_1,
				MagmaSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(MagmaSet.instance.getDescription(this.slot));
		} catch (IllegalAccessException e) {
			LOGGER.error(e.getMessage());
		}
	}
}