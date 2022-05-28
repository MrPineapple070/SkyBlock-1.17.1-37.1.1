package net.hypixel.skyblock.world.items.swords;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Material;

/**
 * The
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Aspect_of_the_End">Aspect
 * of the End</a>.
 *
 * @author MrPineapple070
 * @version 02 November 2020
 * @since 02 August 2019
 */
public class AspectOfTheEnd extends ModSwordItem {
	private static final List<Component> tooltip = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("sword.aote")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("sword.aote.0", StatString.speed));

	public AspectOfTheEnd() {
		super(ModSwordTier.AOTE, ItemProperties.combat_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(AspectOfTheEnd.tooltip);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		ItemStack held = player.getItemInHand(hand);
		if (level.isClientSide)
			return InteractionResultHolder.pass(held);
		
		double x = player.getX(), y = player.getY(), z = player.getZ();
		double yaw = (double) player.yHeadRot, pitch = (double) player.getXRot();
		yaw *= Math.PI / 180d;
		pitch *= Math.PI / 180d;
		
		for (int i = 0; i < 8; ++i) {
			if (level.getBlockState(new BlockPos(x, y, z)).getMaterial() != Material.AIR)
				break;
			x -= Math.sin(yaw) * Math.cos(pitch);
			y -= Math.sin(pitch);
			z += Math.cos(yaw) * Math.cos(pitch);
		}
		
		y = pitch > 0 ? Math.ceil(y) : Math.floor(y) - 1;
		
		player.setPos(x, y, z);
		return InteractionResultHolder.success(held);
	}
}