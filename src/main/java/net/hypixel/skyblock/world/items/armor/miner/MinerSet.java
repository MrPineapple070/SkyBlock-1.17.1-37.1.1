package net.hypixel.skyblock.world.items.armor.miner;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Miner_Armor">Miner Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class MinerSet implements FullSetInformation {
	public static final MinerSet instance = new MinerSet();
	private static final List<Component> fsb = Arrays.asList(full_set_bonus.copy()
			.append(new TranslatableComponent("armor.miner.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.miner.fsb.disc"));

	@Override
	public Map<String, Double> getBootsBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 5d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 5d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 5d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 5d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Miner;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}