package net.hypixel.skyblock.world.items.armor.frozen_blaze;

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
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;

/**
 * Holds {@link EquipmentSlot} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Frozen_Blaze_Armor">Frozen
 * Blaze Armor</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 18 December 2019
 */
public class FrozenBlazeSet implements FullSetInformation {
	public static final FrozenBlazeSet instance = new FrozenBlazeSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.frozen_blaze.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.frozen_blaze.fsb.disc.0", StatString.health,
					((MutableComponent) MobEffects.MOVEMENT_SLOWDOWN.getDisplayName())
							.withStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.MOVEMENT_SLOWDOWN.getColor())))),
			new TranslatableComponent("armor.frozen_blaze.fsb.disc.1"),
			new TranslatableComponent("armor.frozen_blaze.fsb.disc.2"));

	@Override
	public Map<String, Double> getBootsBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 95d);
		temp.put(BuffBuilder.strength(), 40d);
		temp.put(BuffBuilder.speed(), 2d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 180d);
		temp.put(BuffBuilder.strength(), 40d);
		temp.put(BuffBuilder.speed(), 2d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 105d);
		temp.put(BuffBuilder.strength(), 40d);
		temp.put(BuffBuilder.speed(), 2d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() throws IllegalAccessException {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.defense(), 140d);
		temp.put(BuffBuilder.strength(), 40d);
		temp.put(BuffBuilder.speed(), 2d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Frozen_Blaze;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Epic;
	}
}