package net.hypixel.skyblock.world.items.armor.hardened_diamond;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.hypixel.skyblock.world.items.armor.ModArmorMaterial;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Hardened_Diamond_Armor">Hardened
 * Diamond Armor</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 * @since 29 July 2020
 */
public class HardenedDiamondSet extends ModArmorItem {
	/**
	 * Construct this
	 *
	 * @param slot {@link EquipmentSlot}
	 */
	public HardenedDiamondSet(EquipmentSlot slot) {
		super(ModArmorMaterial.Hardened_Diamond, slot, ItemProperties.mine_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
	}
}
