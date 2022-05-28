package net.hypixel.skyblock.world.items.armor.blaze;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Blaze_Armor">Blaze
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class BlazeSet implements FullSetInformation {
	public static final BlazeSet instance = new BlazeSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.blaze.fsb"))
			.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.blaze.fsb.disc.0"),
			new TranslatableComponent("armor.blaze.fsb.disc.1"));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.speed(), 2d);
		temp.put(BuffBuilder.defense(), 70d);
		temp.put(BuffBuilder.strength(), 10d);

		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.speed(), 2d);
		temp.put(BuffBuilder.defense(), 70d);
		temp.put(BuffBuilder.strength(), 10d);

		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.speed(), 2d);
		temp.put(BuffBuilder.defense(), 70d);
		temp.put(BuffBuilder.strength(), 10d);

		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.speed(), 2d);
		temp.put(BuffBuilder.defense(), 70d);
		temp.put(BuffBuilder.strength(), 10d);

		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Blaze;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}