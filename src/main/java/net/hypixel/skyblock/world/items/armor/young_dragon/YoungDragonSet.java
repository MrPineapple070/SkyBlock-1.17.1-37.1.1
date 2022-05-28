package net.hypixel.skyblock.world.items.armor.young_dragon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.hypixel.skyblock.util.BuffBuilder;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.armor.FullSetInformation;
import net.hypixel.skyblock.world.items.armor.ModArmorMaterial;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;

/**
 * Holds {@link EquipmentSlot} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Young_Dragon_Armor">Young
 * Dragon Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 01 July 2020
 * @since 02 August 2019
 */
public class YoungDragonSet implements FullSetInformation {
	public static final YoungDragonSet instance = new YoungDragonSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.young.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.young.fsb.disc", StatString.health));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 20d);
		temp.put(BuffBuilder.defense(), 90d);
		temp.put(BuffBuilder.health(), 60d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 20d);
		temp.put(BuffBuilder.defense(), 160d);
		temp.put(BuffBuilder.health(), 120d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 20d);
		temp.put(BuffBuilder.defense(), 110d);
		temp.put(BuffBuilder.health(), 70d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 20d);
		temp.put(BuffBuilder.defense(), 140d);
		temp.put(BuffBuilder.health(), 100d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Young;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}