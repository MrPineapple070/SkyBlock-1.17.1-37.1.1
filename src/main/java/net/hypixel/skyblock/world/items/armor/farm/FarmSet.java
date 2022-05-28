package net.hypixel.skyblock.world.items.armor.farm;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Farm_Armor">Farm Armor
 * Set</a>
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class FarmSet implements FullSetInformation {
	public static final FarmSet instance = new FarmSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.farm.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.farm.fsb.disc", StatString.speed));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 35d);
		temp.put(BuffBuilder.health(), 20d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 75d);
		temp.put(BuffBuilder.health(), 20d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 40d);
		temp.put(BuffBuilder.health(), 20d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 50d);
		temp.put(BuffBuilder.health(), 20d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Farm;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}