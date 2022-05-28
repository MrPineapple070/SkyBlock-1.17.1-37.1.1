package net.hypixel.skyblock.world.items.armor.emerald;

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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class EmeraldSet implements FullSetInformation {
	public static final EmeraldSet instance = new EmeraldSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.emerald.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.emerald.fsb.disc.0", StatString.health, StatString.defense,
					Items.EMERALD.getName(ItemStack.EMPTY)),
			new TranslatableComponent("armor.emerald.fsb.disc.1"));

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 0d);
		temp.put(BuffBuilder.defense(), 0d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 0d);
		temp.put(BuffBuilder.defense(), 0d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 0d);
		temp.put(BuffBuilder.defense(), 0d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 0d);
		temp.put(BuffBuilder.defense(), 0d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Emerald;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}