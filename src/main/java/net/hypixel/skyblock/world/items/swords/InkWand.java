package net.hypixel.skyblock.world.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Ink_Wand">Ink Wand</a>.
 *
 * @author MrPineapple070
 * @version 21 February 2020
 * @since 11 June 2019
 */
public class InkWand extends ModSwordItem {
	private static final List<Component> info = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("sword.ink")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("sword.ink.0", StatString.ability_damage,
					((MutableComponent) MobEffects.BLINDNESS.getDisplayName())
							.withStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.BLINDNESS.getColor())))));

	public InkWand() {
		super(ModSwordTier.Ink_Wand, ItemProperties.fish_1, ModItemRarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(info);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		ItemStack held = player.getItemInHand(hand);
		if (level.isClientSide)
			return InteractionResultHolder.pass(held);
		player.getCooldowns().addCooldown(this, 600);
		return InteractionResultHolder.success(held);
	}
}