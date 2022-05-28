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
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Scorpion_Foil">Scorpion
 * Foil</a>.
 *
 * @author MrPineapple070
 * @version 15 August 2020
 * @since 15 August 2020
 */
public class ScorpionFoil extends ModSwordItem {
	private static final Component before = item_ability.copy()
			.append(new TranslatableComponent("sword.scorpion")).withStyle(ChatFormatting.GOLD);
	private static final List<Component> after = Arrays
			.asList(new TranslatableComponent("sword.scorpion.0", StatString.health));

	private int tick = 0;
	private int tickers = 4;

	public ScorpionFoil() {
		super(ModSwordTier.Scorpion_Foil, ItemProperties.combat_1, ModItemRarity.Epic);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		this.tick = ++this.tick % 100;
		if (this.tick == 0)
			this.tickers = 4;
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(before);
		tooltip.add(
				new TranslatableComponent("sword.scorpion.ticker", String.format(StatString.ticker, this.tickers)));
		tooltip.addAll(after);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		final ItemStack held = player.getItemInHand(hand);
		if (this.tickers != 0) {
			--this.tickers;
			return InteractionResultHolder.success(held);
		}
		return InteractionResultHolder.pass(held);
	}
}