package net.hypixel.skyblock.world.items.armor.sponge;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Sponge_Armor">Sponge
 * Armor</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class SpongeSet implements FullSetInformation {
	public static final SpongeSet instance = new SpongeSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.sponge.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.sponge.fsb.disc", StatString.defense));

	@Override
	public Map<String, Double> getBootsBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 60d);
		temp.put(BuffBuilder.scc(), 1.8d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 145d);
		temp.put(BuffBuilder.scc(), 1.8d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 80d);
		temp.put(BuffBuilder.scc(), 1.8d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 100d);
		temp.put(BuffBuilder.scc(), 1.8d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Sponge;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}