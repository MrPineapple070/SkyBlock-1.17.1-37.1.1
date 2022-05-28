package net.hypixel.skyblock.world.items.armor;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.world.entity.EquipmentSlot;

/**
 * Serve as a basis for all Dungeon Armor<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor">All Armor</a>
 *
 * @author MrPineapple070
 * @version 07 July 2020
 * @since 07 July 2020
 */
public abstract class DungeonArmorItem extends ModArmorItem {
	public DungeonArmorItem(ModArmorMaterial materialIn, EquipmentSlot slot, ModItemRarity rarity) {
		super(materialIn, slot, ItemProperties.dungeon_1, rarity);
	}
}