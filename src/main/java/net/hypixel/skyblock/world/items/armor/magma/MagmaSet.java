package net.hypixel.skyblock.world.items.armor.magma;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor_of_Magma">MagmaSet
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 31 July 2020
 * @since 31 July 2020
 */
public class MagmaSet implements FullSetInformation {
	public static final MagmaSet instance = new MagmaSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.magma.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.magma.fsb.disc.0", "Magma Cube", StatString.health,
					StatString.intelligence),
			new TranslatableComponent("armor.magma.fsb.disc.1"));

	public static final int boots = 9;
	public static final int chestplate = 20;
	public static final int helmet = 3;
	public static final int leggings = 15;

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 15d);
		temp.put(BuffBuilder.health(), 45d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 30d);
		temp.put(BuffBuilder.health(), 100d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 50d);
		temp.put(BuffBuilder.health(), 15d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 25d);
		temp.put(BuffBuilder.health(), 75d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Magma;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}