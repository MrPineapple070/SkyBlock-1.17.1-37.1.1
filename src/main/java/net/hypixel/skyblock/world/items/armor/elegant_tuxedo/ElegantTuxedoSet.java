package net.hypixel.skyblock.world.items.armor.elegant_tuxedo;

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
 * Holds {@link EquipmentSlot} specific infomration for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Elegant_Tuxedo">Elegant
 * Tuxedo Set</a>
 *
 * @author MrPineapple070
 * @version 04 August 2020
 * @since 04 August 2020
 */
public class ElegantTuxedoSet implements FullSetInformation {
	public static final ElegantTuxedoSet instance = new ElegantTuxedoSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.tux.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.tux.fsb.disc", "50", "150"));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 10d);
		temp.put(BuffBuilder.crit_damage(), 50d);
		temp.put(BuffBuilder.intelligence(), 100d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.crit_damage(), 100d);
		temp.put(BuffBuilder.intelligence(), 300d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		throw new IllegalAccessException("The helmet does not exist for the Elegant Tuxedo set.");
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.crit_damage(), 50d);
		temp.put(BuffBuilder.intelligence(), 100d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Elegant_Tuxedo;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}
