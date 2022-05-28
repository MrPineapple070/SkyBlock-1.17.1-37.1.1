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
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Reaper_Scythe">Reaper
 * Scythe</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 October 2019
 */
public class ReaperScythe extends ModSwordItem {
	private static final List<Component> info = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("sword.reaper")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("sword.reaper.0"),
			new TranslatableComponent("sword.reaper.1", StatString.health));

	public ReaperScythe() {
		super(ModSwordTier.Reaper_Scythe, ItemProperties.combat_1, ModItemRarity.Legendary);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(ReaperScythe.info);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return InteractionResultHolder.pass(player.getItemInHand(hand));
	}
}