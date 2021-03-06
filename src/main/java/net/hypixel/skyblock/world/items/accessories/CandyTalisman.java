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
 * An {@link Accessory} that increases the chance for mobs to drop Candy by
 * 5%<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Candy_Talisman">Candy
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class CandyTalisman extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.candy_talisman");

	public CandyTalisman() {
		super(ItemProperties.miscellaneous_1, ModItemRarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(info);
	}
}