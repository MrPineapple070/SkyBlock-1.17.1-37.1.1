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
 * An {@link Accessory} that grants +1 Health for each unique NewYearCake<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/New_Year_Cake_Bag">New Year
 * Cake Bag.</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class NewYearCakeBag extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.new", StatString.speed);

	public NewYearCakeBag() {
		super(ItemProperties.miscellaneous_1, ModItemRarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}