package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that gives +1% speed.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Speed_Talisman">Speed
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SpeedTalisman extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.speed", "1%", StatString.speed);

	public SpeedTalisman() {
		super(ItemProperties.farm_1, ModItemRarity.Common);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}