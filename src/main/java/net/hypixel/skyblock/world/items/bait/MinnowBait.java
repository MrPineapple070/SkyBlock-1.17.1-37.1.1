package net.hypixel.skyblock.world.items.bait;

import java.util.List;

import net.hypixel.skyblock.util.StatString;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * A {@link Bait} that increases catch rate by 15%.
 *
 * @author MrPineapple070
 * @version 2 June 2020
 * @since 2 July 2019
 */
public class MinnowBait extends Bait {
	private static final Component info = new TranslatableComponent("bait.minnow", StatString.fishing_speed);

	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(info);
	}
}