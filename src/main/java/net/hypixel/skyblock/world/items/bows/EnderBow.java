package net.hypixel.skyblock.world.items.bows;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * @author MrPineapple070
 * @version 24 October 2020
 * @since 24 October 2020
 */
public class EnderBow extends ModBowItem {
	private static final List<Component> tooltip = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("bow.ender")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("bow.ender.0", Items.ENDER_PEARL.getName(ItemStack.EMPTY)),
			new TranslatableComponent("bow.ender.1", StatString.health));

	public EnderBow() {
		super(ItemProperties.combat_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(EnderBow.tooltip);
	}
}