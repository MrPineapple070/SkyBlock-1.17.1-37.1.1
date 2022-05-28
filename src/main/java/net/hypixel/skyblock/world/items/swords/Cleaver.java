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
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Cleaver">Cleaver</a>.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class Cleaver extends ModSwordItem {
	private static final List<Component> tooltip = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("sword.cleaver")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("sword.cleaver.0"));

	public Cleaver() {
		super(ModSwordTier.Cleaver, ItemProperties.combat_1, ModItemRarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(Cleaver.tooltip);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return InteractionResultHolder.pass(player.getItemInHand(hand));
	}
}