package net.hypixel.skyblock.world.items.bait;

import java.util.List;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * A {@link Bait} that increases Sea Creature spawn rate by 6%.
 *
 * @author MrPineapple070
 * @version 2 June 2020
 * @since 2 July 2019
 */
public class SpikedBait extends Bait {
	private static final Component info = new TranslatableComponent("bait.spiked");

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}