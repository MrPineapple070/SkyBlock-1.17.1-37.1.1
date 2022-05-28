package net.hypixel.skyblock.world.items.armor.old_dragon;

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
import net.minecraft.world.item.enchantment.Enchantments;

/**
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class OldDragonSet implements FullSetInformation {
	public static final OldDragonSet instance = new OldDragonSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.old.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.old.fsb.disc", "Growth",
					Enchantments.ALL_DAMAGE_PROTECTION.getFullname(0), Enchantments.FALL_PROTECTION.getFullname(0)));

	public double boots_hp = 15;
	public double chestplate_hp = 32;
	public double helmet_hp = 22;
	public double leggings_hp = 26;

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 80d);
		temp.put(BuffBuilder.defense(), 90d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 150d);
		temp.put(BuffBuilder.defense(), 160d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 90d);
		temp.put(BuffBuilder.defense(), 110d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 140d);
		temp.put(BuffBuilder.defense(), 130d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Old;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Legendary;
	}
}