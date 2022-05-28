package net.hypixel.skyblock.world.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * The <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Aspect_of_the_Dragons">Aspect of
 * the Dragons</a>.
 *
 * @author MrPineapple070
 * @version 01 July 2020
 * @since 02 August 2019
 */
public class AspectOfTheDragon extends ModSwordItem {
	private static final List<Component> info = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("sword.aotd")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("sword.aotd.0", StatString.ability_damage),
			new TranslatableComponent("sword.aotd.1"));

	public AspectOfTheDragon() {
		super(ModSwordTier.AOTD, ItemProperties.combat_1, ModItemRarity.Legendary);
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
		// TODO Determine Entities in front of the player and handle knock back
		return InteractionResultHolder.success(held);
	}
}