package net.hypixel.skyblock.world.items.armor.revenant;

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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Revenant_Armor">Revenant
 * Armor Set</a>
 *
 * @author MrPineapple070
 * @version 15 October 2019
 * @since 11 October 2019
 */
public class RevenantSet implements FullSetInformation {
	public static final RevenantSet instance = new RevenantSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.revenant.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.revenant.fsb.disc.0"),
			new TranslatableComponent("armor.revenant.fsb.disc.1", StatString.defense));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 30d);
		temp.put(BuffBuilder.health(), 100d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 30d);
		temp.put(BuffBuilder.health(), 180d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		throw new IllegalAccessException("Helmet does not exist for the Revenant Set.");
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 50d);
		temp.put(BuffBuilder.health(), 130d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Revenant;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}