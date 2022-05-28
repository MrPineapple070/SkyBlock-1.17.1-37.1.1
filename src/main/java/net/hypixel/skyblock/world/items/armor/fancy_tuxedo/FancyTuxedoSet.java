package net.hypixel.skyblock.world.items.armor.fancy_tuxedo;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Fancy_Tuxedo">Fancy Tuxedo
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class FancyTuxedoSet implements FullSetInformation {
	public static final FancyTuxedoSet instance = new FancyTuxedoSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.tux.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.tux.fsb.disc", "150", "100"));

	public static final int boots_cr_dmg = 35;
	public static final int boots_int = 74;

	public static final int chestplate_cr_dmg = 80;
	public static final int chestplate_int = 150;

	public static final int leggings_cr_dmg = 35;
	public static final int leggings_int = 75;

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.crit_damage(), 35d);
		temp.put(BuffBuilder.intelligence(), 75d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.crit_damage(), 80d);
		temp.put(BuffBuilder.intelligence(), 150d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		throw new IllegalAccessException("Helmet does not exist for the Fancy Tuxedo Set.");
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.crit_damage(), 35d);
		temp.put(BuffBuilder.intelligence(), 75d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Fancy_Tuxedo;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}