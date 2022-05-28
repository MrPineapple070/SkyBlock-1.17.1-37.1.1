package net.hypixel.skyblock.world.items.armor.spooky;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.armor.FullSetInformation;
import net.hypixel.skyblock.world.items.armor.ModArmorMaterial;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;

/**
 * Holds {@link EquipmentSlot} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Spooky_Armor">Spooky Armor
 * Set</a>.
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class SpookySet implements FullSetInformation {
	public static final SpookySet instance = new SpookySet();
	private static final List<Component> fsb = Arrays.asList(full_set_bonus.copy()
			.append(new TranslatableComponent("armor.spooky.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.spooky.fsb.disc"));

	@Override
	public Map<String, Double> getBootsBuffs() {
		return new HashMap<>();
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		return new HashMap<>();
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		return new HashMap<>();
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		return new HashMap<>();
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Spooky;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}