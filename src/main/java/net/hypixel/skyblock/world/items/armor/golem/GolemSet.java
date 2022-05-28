package net.hypixel.skyblock.world.items.armor.golem;

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
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;

/**
 * Holds {@link EquipmentSlot} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Golem_Armor">Golem Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 June 2019
 */
public class GolemSet implements FullSetInformation {
	public static final GolemSet instance = new GolemSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.golem.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.golem.fsb.disc.0",
					((MutableComponent) MobEffects.ABSORPTION.getDisplayName())
							.withStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.ABSORPTION.getColor())))),
			new TranslatableComponent("armor.golem.fsb.disc.1"));

	public static double boots_hp = 8;
	public static double chestplate_hp = 13;
	public static double helmet_hp = 9;
	public static double leggings_hp = 11;

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 40d);
		temp.put(BuffBuilder.health(), 40d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 90d);
		temp.put(BuffBuilder.health(), 65d);
		
		return temp;
		
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 45d);
		temp.put(BuffBuilder.health(), 45d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 75d);
		temp.put(BuffBuilder.health(), 55d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Golem;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Rare;
	}
}