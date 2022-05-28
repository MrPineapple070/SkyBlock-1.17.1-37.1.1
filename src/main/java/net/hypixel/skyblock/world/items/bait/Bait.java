package net.hypixel.skyblock.world.items.bait;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * The base for Fishing Baits.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Fishing_Bait">Click
 * here</a> for more information.
 *
 * @author MrPineapple070
 * @version 2 June 2019
 * @since 2 July 2019
 */
public abstract class Bait extends Item {
	protected Bait() {
		super(ItemProperties.fish_64);
	}

	@Override
	public abstract void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag);
}