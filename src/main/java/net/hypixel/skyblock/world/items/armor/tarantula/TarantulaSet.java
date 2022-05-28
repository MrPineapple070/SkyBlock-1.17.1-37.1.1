package net.hypixel.skyblock.world.items.armor.tarantula;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Tarantula_Armor">Tarantula
 * Armor Set</a>.
 *
 * @author MrPineapple070
 * @version 15 October 2019
 * @since 11 October 2019
 */
public class TarantulaSet implements FullSetInformation {
	public static final TarantulaSet instance = new TarantulaSet();
	private static final List<Component> fsb = Arrays.asList(full_set_bonus.copy()
			.append(new TranslatableComponent("armor.tarantula.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.tarantula.fsb.disc"));

	@Override
	public Map<String, Double> getBootsBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.speed(), 5d);
		temp.put(BuffBuilder.defense(), 100d);
		temp.put(BuffBuilder.intelligence(), 50d);
		temp.put(BuffBuilder.health(), 70d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 100d);
		temp.put(BuffBuilder.intelligence(), 100d);
		temp.put(BuffBuilder.health(), 120d);
		
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
		temp.put(BuffBuilder.intelligence(), 100d);
		temp.put(BuffBuilder.health(), 100d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 20d);
		temp.put(BuffBuilder.health(), 60d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Tarantula;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}