package net.hypixel.skyblock.world.items.armor.lapis;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.armor.FullSetInformation;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.hypixel.skyblock.world.items.armor.ModArmorMaterial;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * A class for all Lapis Armor pieces.
 *
 * @author MrPineapple070
 * @version 18 May 2020
 */
public class LapisSet extends ModArmorItem {
	private static final List<Component> fsb = Arrays.asList(
			new TranslatableComponent("armor.lapis.disc"),
			FullSetInformation.full_set_bonus.copy().append(new TranslatableComponent("armor.lapis.fsb"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.lapis.fsb.disc", StatString.health));

	public LapisSet(EquipmentSlot slot) {
		super(ModArmorMaterial.Lapis, slot, ItemProperties.mine_1, ModItemRarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(fsb);
	}
}
