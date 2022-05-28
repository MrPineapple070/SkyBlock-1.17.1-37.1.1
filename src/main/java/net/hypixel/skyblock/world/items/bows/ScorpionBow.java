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
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class ScorpionBow extends ModBowItem {
	private static final List<Component> info = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("bow.scorpion")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("bow.scorpion.0"),
			new TranslatableComponent("bow.scorpion.1", StatString.intelligence),
			new TranslatableComponent("bow.scorpion.2"));

	public ScorpionBow() {
		super(ItemProperties.combat_1, ModItemRarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(info);
	}
}