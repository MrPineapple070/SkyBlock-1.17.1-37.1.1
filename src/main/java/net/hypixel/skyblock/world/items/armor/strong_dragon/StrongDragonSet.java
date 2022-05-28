package net.hypixel.skyblock.world.items.armor.strong_dragon;

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

/**
 * @author MrPineapple070
 * @version 01 July 2020
 * @since 02 August 2019
 */
public class StrongDragonSet implements FullSetInformation {
	public static final StrongDragonSet instance = new StrongDragonSet();
	private static final List<Component> fsb = Arrays.asList(full_set_bonus.copy()
			.append(new TranslatableComponent("armor.strong.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.strong.fsb.disc"));

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.health(), 70d);
		temp.put(BuffBuilder.strength(), 25d);

		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.health(), 120d);
		temp.put(BuffBuilder.strength(), 25d);

		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.health(), 100d);
		temp.put(BuffBuilder.strength(), 25d);

		return temp;
	}
	
	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.health(), 60d);
		temp.put(BuffBuilder.strength(), 25d);

		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Strong;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}