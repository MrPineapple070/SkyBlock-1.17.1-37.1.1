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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Flaming_Sword">Flaming
 * Sword</a>.
 *
 * @author MrPineapple070
 * @version 14 August 2020
 * @since 14 August 2020
 */
public class FlamingSword extends ModSwordItem {
	public FlamingSword() {
		super(ModSwordTier.Flaming_Sword, ItemProperties.combat_1, ModItemRarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return InteractionResultHolder.pass(player.getItemInHand(hand));
	}
}