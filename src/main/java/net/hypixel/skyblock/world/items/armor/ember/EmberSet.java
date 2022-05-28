package net.hypixel.skyblock.world.items.armor.ember;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Ember_Armor">Ember Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 09 July 2019
 * @since 09 July 2019
 */
public class EmberSet implements FullSetInformation {
	public static final EmberSet instance = new EmberSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.ember.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.ember.fsb.disc.0"),
			new TranslatableComponent("armor.ember.fsb.disc.1"),
			new TranslatableComponent("armor.ember.fsb.disc.2"));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 30d);
		temp.put(BuffBuilder.intelligence(), 5d);
		temp.put(BuffBuilder.health(), 35d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 60d);
		temp.put(BuffBuilder.intelligence(), 10d);
		temp.put(BuffBuilder.health(), 65d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 35d);
		temp.put(BuffBuilder.intelligence(), 5d);
		temp.put(BuffBuilder.health(), 40d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 55d);
		temp.put(BuffBuilder.intelligence(), 5d);
		temp.put(BuffBuilder.health(), 60d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Ember;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}