package net.hypixel.skyblock.world.items.armor.superior_dragon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.hypixel.skyblock.util.BuffBuilder;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.armor.FullSetInformation;
import net.hypixel.skyblock.world.items.armor.ModArmorMaterial;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;

/**
 * Holds {@link EquipmentSlot} specific information for the <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Superior_Dragon_Armor">Superior
 * Dragon Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 01 July 2020
 * @since 02 August 2019
 */
public class SuperiorDragonSet implements FullSetInformation {
	public static final SuperiorDragonSet instance = new SuperiorDragonSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.superior.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.superior.fsb.disc.0"),
			new TranslatableComponent("armor.superior.fsb.disc.1"));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 80d);
		temp.put(BuffBuilder.defense(), 110d);
		temp.put(BuffBuilder.strength(), 10d);
		temp.put(BuffBuilder.speed(), 3d);
		temp.put(BuffBuilder.crit_chance(), 2d);
		temp.put(BuffBuilder.crit_damage(), 10d);
		temp.put(BuffBuilder.intelligence(), 25d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 150d);
		temp.put(BuffBuilder.defense(), 190d);
		temp.put(BuffBuilder.strength(), 10d);
		temp.put(BuffBuilder.speed(), 3d);
		temp.put(BuffBuilder.crit_chance(), 2d);
		temp.put(BuffBuilder.crit_damage(), 10d);
		temp.put(BuffBuilder.intelligence(), 25d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 90d);
		temp.put(BuffBuilder.defense(), 130d);
		temp.put(BuffBuilder.strength(), 10d);
		temp.put(BuffBuilder.speed(), 3d);
		temp.put(BuffBuilder.crit_chance(), 2d);
		temp.put(BuffBuilder.crit_damage(), 10d);
		temp.put(BuffBuilder.intelligence(), 25d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 130d);
		temp.put(BuffBuilder.defense(), 170d);
		temp.put(BuffBuilder.strength(), 10d);
		temp.put(BuffBuilder.speed(), 3d);
		temp.put(BuffBuilder.crit_chance(), 2d);
		temp.put(BuffBuilder.crit_damage(), 10d);
		temp.put(BuffBuilder.intelligence(), 25d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Superior;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}