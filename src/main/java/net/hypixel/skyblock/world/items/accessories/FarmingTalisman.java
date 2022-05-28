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
import net.minecraft.world.level.biome.Biome;

/**
 * Increases <font style="color:#FFFFFF">Speed</font> by 10% while in certain
 * {@link Biome}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Farming_Talisman">Farming
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class FarmingTalisman extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.farming_talisman",
			StatString.speed);

	public FarmingTalisman() {
		super(ItemProperties.farm_1, ModItemRarity.Common);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}