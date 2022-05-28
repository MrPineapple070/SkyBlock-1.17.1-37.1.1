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
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Silver_Fang">Silver
 * Fang</a>.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class SilverFang extends ModSwordItem {
	public SilverFang() {
		super(ModSwordTier.Silver_Fang, ItemProperties.combat_64, ModItemRarity.Uncommon);
	}

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return 64;
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return InteractionResultHolder.pass(player.getItemInHand(hand));
	}
}