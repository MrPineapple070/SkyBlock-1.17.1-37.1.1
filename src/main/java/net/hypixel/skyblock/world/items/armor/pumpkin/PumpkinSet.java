package net.hypixel.skyblock.world.items.armor.pumpkin;

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
 * Holds {@link EquipmentSlot} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Pumpkin_Armor">Pumpkin
 * Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class PumpkinSet implements FullSetInformation {
	public static final PumpkinSet instance = new PumpkinSet();
	private static final List<Component> fsb = Arrays.asList(full_set_bonus.copy()
			.append(new TranslatableComponent("armor.pumpkin.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.pumpkin.fsb.disc"));

	public double boots_hp = 1.6;
	public double chestplate_hp = 2.8;
	public double helmet_hp = 1.6;
	public double leggings_hp = 2;

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 8d);
		temp.put(BuffBuilder.health(), 8d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 14d);
		temp.put(BuffBuilder.health(), 14d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 8d);
		temp.put(BuffBuilder.health(), 8d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 10d);
		temp.put(BuffBuilder.health(), 10d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Pumpkin;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}