package net.hypixel.skyblock.world.items.armor.mastiff;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Mastiff_Armor">Mastiff
 * Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 08 August 2020
 * @since 08 August 2020
 */
public class MastiffSet implements FullSetInformation {
	public static final MastiffSet instance = new MastiffSet();

	protected static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.mastiff.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.mastiff.fsb.disc.0", StatString.health, StatString.crit_damage),
			new TranslatableComponent("armor.mastiff.fsb.disc.1"),
			new TranslatableComponent("armor.mastiff.fsb.disc.2"),
			new TranslatableComponent("armor.mastiff.fsb.disc.3", StatString.crit_damage));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), -1000000d);
		temp.put(BuffBuilder.intelligence(), 25d);
		temp.put(BuffBuilder.health(), 500d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), -1000000d);
		temp.put(BuffBuilder.health(), 500d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), -1000000d);
		temp.put(BuffBuilder.intelligence(), 125d);
		temp.put(BuffBuilder.health(), 500d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), -1000000d);
		temp.put(BuffBuilder.health(), 500d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Mastiff;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}