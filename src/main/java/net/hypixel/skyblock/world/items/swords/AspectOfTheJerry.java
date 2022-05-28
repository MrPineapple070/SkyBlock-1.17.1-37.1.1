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
 * The
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Aspect_of_the_Jerry">Aspect
 * of the Jerry</a>
 *
 * @author MrPineapple070
 * @version 14 August 2020
 * @since 14 August 2020
 */
public class AspectOfTheJerry extends ModSwordItem {
	private static final List<Component> tooltip = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("sword.aotj")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("sword.aotj.0"));

	public AspectOfTheJerry() {
		super(ModSwordTier.AOTJ, ItemProperties.combat_1, ModItemRarity.Common);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(AspectOfTheJerry.tooltip);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		player.getCooldowns().addCooldown(this, 100);
		return InteractionResultHolder.success(player.getItemInHand(hand));
	}
}