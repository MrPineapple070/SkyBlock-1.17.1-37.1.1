package net.hypixel.skyblock.world.items.armor.angler;

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

/**
 * Holds {@link EquipmentSlot} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Angler_Armor">Angler Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 2 July 2019
 */
public class AnglerSet implements FullSetInformation {
	public static final AnglerSet instance = new AnglerSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus
					.copy().append(new TranslatableComponent("armor.angler.fsb.0")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.angler.fsb.0.disc"),
			full_set_bonus.copy().append(new TranslatableComponent("armor.angler.fsb.1"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.angler.fsb.1.disc", StatString.health));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 15d);
		temp.put(BuffBuilder.scc(), 1d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 40d);
		temp.put(BuffBuilder.scc(), 1d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 15d);
		temp.put(BuffBuilder.scc(), 1d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 30d);
		temp.put(BuffBuilder.scc(), 1d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Angler;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}