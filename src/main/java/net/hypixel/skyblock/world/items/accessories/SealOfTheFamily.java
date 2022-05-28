package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that gives a 3% discount of most shops.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Seal_of_the_Family">Seal of
 * the Family</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SealOfTheFamily extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.seal", "3%");

	public SealOfTheFamily() {
		super(ItemProperties.miscellaneous_1, ModItemRarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}