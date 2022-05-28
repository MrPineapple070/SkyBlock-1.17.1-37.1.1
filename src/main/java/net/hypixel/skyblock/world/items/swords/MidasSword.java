package net.hypixel.skyblock.world.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Midas_Sword">Midas
 * Sword</a>.
 *
 * @author MrPineapple070
 * @version 09 July 2019
 * @since 02 July 2019
 */
public class MidasSword extends ModSwordItem {
	private static final List<Component> info = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("sword.midas")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("sword.midas.0"), new TranslatableComponent("sword.midas.1"));

	public MidasSword() {
		super(ModSwordTier.Midas_Sword, ItemProperties.combat_1, ModItemRarity.Legendary);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(info);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return InteractionResultHolder.pass(player.getItemInHand(hand));
	}
}