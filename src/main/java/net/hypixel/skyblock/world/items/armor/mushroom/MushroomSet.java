package net.hypixel.skyblock.world.items.armor.mushroom;

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
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;

/**
 * Holds {@link EquipmentSlot} specific information for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Mushroom_Armor">Mushroom
 * Armor Set</a>
 *
 * @author MrPineapple070
 * @version 09 August 2020
 * @since 09 August 2020
 */
public class MushroomSet implements FullSetInformation {
	public static final MushroomSet instance = new MushroomSet();
	private static final List<Component> fsb = Arrays.asList(
			full_set_bonus.copy().append(new TranslatableComponent("armor.mushroom.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.mushroom.fsb.disc.0",
					((MutableComponent) MobEffects.NIGHT_VISION.getDisplayName())
							.withStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.NIGHT_VISION.getColor())))),
			new TranslatableComponent("armor.mushroom.fsb.disc.1"));

	public int boots_hp = 3;
	public int chestplate_hp = 2;
	public int helmet_hp = 4;
	public int leggings_hp = 1;

	@Override
	public Map<String, Double> getBootsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 15d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getChestplateBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 10d);
		temp.put(BuffBuilder.defense(), 10d);
		
		return temp;
	}

	@Override
	public List<Component> getFullSetBonus() {
		return fsb;
	}

	@Override
	public Map<String, Double> getHelmetBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 20d);
		
		return temp;
	}

	@Override
	public Map<String, Double> getLeggingsBuffs() {
		HashMap<String, Double> temp = new HashMap<>();
		
		temp.put(BuffBuilder.health(), 10d);
		temp.put(BuffBuilder.defense(), 5d);
		
		return temp;
	}

	@Override
	public ModArmorMaterial getMaterial() {
		return ModArmorMaterial.Mushroom;
	}

	@Override
	public ModItemRarity getRarity() {
		return ModItemRarity.Common;
	}
}