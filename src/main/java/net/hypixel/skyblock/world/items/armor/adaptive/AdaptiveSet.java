package net.hypixel.skyblock.world.items.armor.adaptive;

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
 * Holds {@link EquipmentSlot} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Adaptive_Armor">Adaptive
 * Set</a>
 *
 * @author MrPineapple070
 * @version 7 July 2020
 * @since 7 July 2020
 */
public class AdaptiveSet implements FullSetInformation{
	private static final List<Component> fsb = Arrays.asList(full_set_bonus.copy()
			.append(new TranslatableComponent("armor.adaptive.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.adaptive.fsb.disc"));

	public static final AdaptiveSet instance = new AdaptiveSet();

	@Override
	public Map<String, Double> getBootsBuffs() throws IllegalAccessException {
		Map<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.health(), 90d);
		temp.put(BuffBuilder.defense(), 45d);
		temp.put(BuffBuilder.strength(), 15d);
		temp.put(BuffBuilder.intelligence(), 15d);

		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() throws IllegalAccessException {
		Map<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.health(), 170d);
		temp.put(BuffBuilder.defense(), 85d);
		temp.put(BuffBuilder.strength(), 15d);
		temp.put(BuffBuilder.intelligence(), 15d);

		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		Map<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.health(), 110d);
		temp.put(BuffBuilder.defense(), 50d);
		temp.put(BuffBuilder.strength(), 15d);
		temp.put(BuffBuilder.intelligence(), 15d);

		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() throws IllegalAccessException {
		Map<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.health(), 145d);
		temp.put(BuffBuilder.defense(), 65d);
		temp.put(BuffBuilder.strength(), 15d);
		temp.put(BuffBuilder.intelligence(), 15d);

		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Adaptive;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}