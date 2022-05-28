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
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Recluse_Fang">Recluse
 * Fang</a>.
 *
 * @author MrPineapple070
 * @version 14 August 2020
 * @since 14 August 2020
 */
public class RecluseFang extends ModSwordItem {
	private static final List<Component> info = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("sword.recluse")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("sword.recluse.1", StatString.strength));

	public RecluseFang() {
		super(ModSwordTier.Recluse_Fang, ItemProperties.combat_1, ModItemRarity.Rare);
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