package net.hypixel.skyblock.world.items.armor.diver;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Diver%27s_Armor">Diver's
 * Armor</a>.
 *
 * @author MrPineapple070
 * @version 02 July 2019
 * @since 02 June 2020
 */
public class DiverSet implements FullSetInformation {
	public static final DiverSet instance = new DiverSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.diver.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.diver.fsb.disc.0"),
			new TranslatableComponent("armor.diver.fsb.disc.1"));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 110d);
		temp.put(BuffBuilder.scc(), 2d);
		temp.put(BuffBuilder.health(), 60d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 200d);
		temp.put(BuffBuilder.scc(), 2d);
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
		
		temp.put(BuffBuilder.defense(), 65d);
		temp.put(BuffBuilder.scc(), 2d);
		temp.put(BuffBuilder.health(), 120d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 170d);
		temp.put(BuffBuilder.scc(), 2d);
		temp.put(BuffBuilder.health(), 75d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Diver;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}