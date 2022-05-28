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
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Edible_Mace">Edible
 * Mace</a>.
 *
 * @author MrPineapple070
 * @version 13 August 2020
 * @since 13 August 2020
 */
public class EdibleMace extends ModSwordItem {
	private static final List<Component> tooltip = Arrays.asList(
			item_ability.copy().append(new TranslatableComponent("sword.edible")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("sword.edible.0"));

	public EdibleMace() {
		super(ModSwordTier.Edible_Mace, ItemProperties.combat_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(EdibleMace.tooltip);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return InteractionResultHolder.pass(player.getItemInHand(hand));
	}
}