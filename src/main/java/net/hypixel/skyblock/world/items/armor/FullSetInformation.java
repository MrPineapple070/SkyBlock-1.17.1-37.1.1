package net.hypixel.skyblock.world.items.armor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;

/**
 * Serve as a base for {@link EquipmentSlot} specific information for all
 * {@link ModArmorItem}
 *
 * @author MrPineapple070
 * @version 07 July 2020
 * @since 11 June 2019
 */
public interface FullSetInformation {
	/**
	 * Directly reference a log4j {@link Logger}.
	 */
	public static final Logger LOGGER = LogManager.getLogger();

	/**
	 * A {@link Component} holding the {@link TranslatableComponent} for the full
	 * set bonus of the armor set.
	 */
	public static final Component full_set_bonus = new TranslatableComponent("armor.full_set_bonus");

	/**
	 * Retrieves the buffs that the {@link EquipmentSlot#FEET} gives.
	 *
	 * @return an array of all buffs for {@link EquipmentSlot#FEET}.
	 * @throws IllegalAccessException if the Boots do not exist.
	 */
	public Map<String, Double> getBootsBuffs() throws IllegalAccessException;

	/**
	 * Retrieves the buffs that the {@link EquipmentSlot#CHEST} gives.
	 *
	 * @return an array of all buffs for {@link EquipmentSlot#CHEST}.
	 * @throws IllegalAccessException if the Chestplate does not exist.
	 */
	public Map<String, Double> getChestplateBuffs() throws IllegalAccessException;

	/**
	 * Add a description to the Armor Pieces of each set.
	 *
	 * @param slot {@link EquipmentSlot} to add the description to.
	 * @return the description of the item.
	 * @throws IllegalAccessException if {@code slotIn} is not a valid
	 *                                {@code EquipmentSlot}
	 */
	public default List<Component> getDescription(EquipmentSlot slot) throws IllegalAccessException {
		final List<Component> description = new ArrayList<>();
		Map<String, Double> buffs;
		
		switch (slot) {
		case HEAD:
			buffs = this.getHelmetBuffs();
			break;
		case CHEST:
			buffs = this.getChestplateBuffs();
			break;
		case LEGS:
			buffs = this.getLeggingsBuffs();
			break;
		case FEET:
			buffs = this.getBootsBuffs();
			break;
		default:
			LOGGER.error("Illegal Slot: " + slot.getName());
			return Arrays.asList();
		}
		
		if (buffs == null) {
			LOGGER.error("Buffs array was null");
			return Arrays.asList();
		}
		
		
		description.addAll(this.getFullSetBonus());
		
		for (Component c: description)
			LOGGER.debug(c.getString());
		
		return description;
	}

	/**
	 * @return the description for the full set bonus of this set.
	 */
	public List<Component> getFullSetBonus();

	/**
	 * Retrieves the buffs that the {@link EquipmentSlot#HEAD} gives.
	 *
	 * @return an array of all buffs for {@link EquipmentSlot#HEAD}.
	 * @throws IllegalAccessException if the Helmet does not exist.
	 */
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException;

	/**
	 * Retrieves the buffs that the {@link EquipmentSlot#LEGS} gives.
	 *
	 * @return an array of all buffs for {@link EquipmentSlot#LEGS}.
	 * @throws IllegalAccessException if the Leggings do not exist.
	 */
	public Map<String, Double> getLeggingsBuffs() throws IllegalAccessException;

	/**
	 * @return {@link ModArmorMaterial} for this set.
	 */
	public ModArmorMaterial getMaterial();

	/**
	 * @return {@link ModItemRarity} for this.
	 */
	public ModItemRarity getRarity();
}