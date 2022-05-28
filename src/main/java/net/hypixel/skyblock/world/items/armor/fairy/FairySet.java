package net.hypixel.skyblock.world.items.armor.fairy;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Fairy_Armor">Fairy Set</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class FairySet implements FullSetInformation {
	public static final FairySet instance = new FairySet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.fairy.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.fairy.fsb.disc.0", StatString.speed),
			new TranslatableComponent("armor.fairy.fsb.disc.1", StatString.health));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 10d);
		temp.put(BuffBuilder.defense(), 1d);
		temp.put(BuffBuilder.intelligence(), -1d);
		temp.put(BuffBuilder.health(), 1d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 10d);
		temp.put(BuffBuilder.defense(), 1d);
		temp.put(BuffBuilder.intelligence(), -1d);
		temp.put(BuffBuilder.health(), 1d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 10d);
		temp.put(BuffBuilder.defense(), 1d);
		temp.put(BuffBuilder.intelligence(), -1d);
		temp.put(BuffBuilder.health(), 1d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 10d);
		temp.put(BuffBuilder.defense(), 1d);
		temp.put(BuffBuilder.intelligence(), -1d);
		temp.put(BuffBuilder.health(), 1d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Fairy;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}