package net.hypixel.skyblock.world.items.armor.unstable_dragon;

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
 * @version 10 August 2020
 * @since 10 August 2020
 */
public class UnstableDragonSet implements FullSetInformation {
	public static final UnstableDragonSet instance = new UnstableDragonSet();
	private static final List<Component> fsb = Arrays.asList(full_set_bonus.copy()
			.append(new TranslatableComponent("armor.unstable.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.unstable.fsb.disc"));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.crit_chance(), 5d);
		temp.put(BuffBuilder.defense(), 90d);
		temp.put(BuffBuilder.crit_damage(), 15d);
		temp.put(BuffBuilder.health(), 60d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.crit_chance(), 5d);
		temp.put(BuffBuilder.defense(), 160d);
		temp.put(BuffBuilder.crit_damage(), 15d);
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
		
		temp.put(BuffBuilder.crit_chance(), 5d);
		temp.put(BuffBuilder.defense(), 110d);
		temp.put(BuffBuilder.crit_damage(), 15d);
		temp.put(BuffBuilder.intelligence(), 25d);
		temp.put(BuffBuilder.health(), 70d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.crit_chance(), 5d);
		temp.put(BuffBuilder.defense(), 140d);
		temp.put(BuffBuilder.crit_damage(), 15d);
		temp.put(BuffBuilder.health(), 100d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Unstable;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}