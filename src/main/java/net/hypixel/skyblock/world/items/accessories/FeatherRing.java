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
 * An {@link Accessory} that increases distance for fall damage by 7 blocks and
 * reduces fall damage by 10%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Feather_Ring">Feather
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class FeatherRing extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.feather_ring");

	public FeatherRing() {
		super(ItemProperties.farm_1, ModItemRarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}