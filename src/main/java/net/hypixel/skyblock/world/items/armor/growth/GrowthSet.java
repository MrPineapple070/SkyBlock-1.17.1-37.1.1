package net.hypixel.skyblock.world.items.armor.growth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.hypixel.skyblock.util.BuffBuilder;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.armor.FullSetInformation;
import net.hypixel.skyblock.world.items.armor.ModArmorMaterial;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;

/**
 * Hold {@link EquipmentSlot} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor_of_Growth">GrowthSet
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class GrowthSet implements FullSetInformation {
	public static final GrowthSet instance = new GrowthSet();

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 25d);
		temp.put(BuffBuilder.health(), 50d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 25d);
		temp.put(BuffBuilder.health(), 50d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return Arrays.asList();
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 25d);
		temp.put(BuffBuilder.health(), 50d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 25d);
		temp.put(BuffBuilder.health(), 50d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Growth;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Uncommon;
	}
}