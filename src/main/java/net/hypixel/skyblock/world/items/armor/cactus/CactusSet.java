package net.hypixel.skyblock.world.items.armor.cactus;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Cactus_Armor">Cactus
 * Armor</a>.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class CactusSet implements FullSetInformation {
	public static final CactusSet instance = new CactusSet();
	private static final List<Component> fsb = Arrays.asList(full_set_bonus.copy()
			.append(new TranslatableComponent("armor.cactus.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.cactus.fsb.disc"));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.defense(), 10d);
		temp.put(BuffBuilder.health(), 5d);

		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.defense(), 25d);
		temp.put(BuffBuilder.health(), 15d);

		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.defense(), 10d);
		temp.put(BuffBuilder.health(), 5d);

		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();

		temp.put(BuffBuilder.defense(), 20d);
		temp.put(BuffBuilder.health(), 10d);

		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Cactus;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}