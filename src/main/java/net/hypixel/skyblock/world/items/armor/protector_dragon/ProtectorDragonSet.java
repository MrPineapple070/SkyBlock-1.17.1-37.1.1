package net.hypixel.skyblock.world.items.armor.protector_dragon;

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
 * Holds {@link EquipmentSlot} specific information for the <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Protector_Dragon_Armor">Protector
 * Dragon Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 01 July 2020
 * @since 02 August 2019
 */
public class ProtectorDragonSet implements FullSetInformation {
	public static final ProtectorDragonSet instance = new ProtectorDragonSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.protector.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.protector.fsb.disc", StatString.defense, StatString.health));

	public double boots_hp = 12;
	public double chestplate_hp = 24;
	public double helmet_hp = 14;
	public double leggings_hp = 20;

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 60d);
		temp.put(BuffBuilder.defense(), 115d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 120d);
		temp.put(BuffBuilder.defense(), 185d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 70d);
		temp.put(BuffBuilder.defense(), 135d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 165d);
		temp.put(BuffBuilder.defense(), 165d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Protector;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}