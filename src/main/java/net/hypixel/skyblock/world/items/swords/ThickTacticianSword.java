package net.hypixel.skyblock.world.items.swords;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * The <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Thick_Tactician%27s_Sword">Thick
 * Tactician's Sword</a>.
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 11 November 2019
 */
public class ThickTacticianSword extends ModSwordItem {
	public ThickTacticianSword() {
		super(ModSwordTier.Tactician_Sword, ItemProperties.combat_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return InteractionResultHolder.success(player.getItemInHand(hand));
	}
}