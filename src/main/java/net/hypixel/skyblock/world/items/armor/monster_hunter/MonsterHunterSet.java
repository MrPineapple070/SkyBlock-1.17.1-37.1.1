package net.hypixel.skyblock.world.items.armor.monster_hunter;

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
 * Holds {@link EquipmentSlot} specific information for the <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Monster_Hunter_Armor">Monster
 * Hunter Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class MonsterHunterSet implements FullSetInformation {
	public static final MonsterHunterSet instance = new MonsterHunterSet();

	@Override
	public Map<String, Double> getBootsBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 5d);
		temp.put(BuffBuilder.defense(), 45d);
		temp.put(BuffBuilder.intelligence(), 50d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 50d);
		temp.put(BuffBuilder.health(), 20d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return Arrays.asList();
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 75d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 65d);
		temp.put(BuffBuilder.health(), 200d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Monster_Hunter;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}