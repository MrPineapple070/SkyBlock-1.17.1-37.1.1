package net.hypixel.skyblock.world.items.bait;

import java.util.List;

import net.hypixel.skyblock.util.StatString;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * A {@link Bait} that grants a small chance to get double drops, higher chance
 * to catch Rare Sea Creatures, and 20% faster catch rate.
 *
 * @author MrPineapple070
 * @version 30 July 2020
 * @since 30 July 2020
 */
public class WhaleBait extends Bait {
	private static final Component info = new TranslatableComponent("bait.whale", StatString.fishing_speed);

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}