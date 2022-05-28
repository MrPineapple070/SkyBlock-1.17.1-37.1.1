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
 * An {@link Accessory} that decreases damage taken from Sea Creatures by
 * 10%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Sea_Creature_Ring">Sea
 * Creature Ring</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SeaCreatureRing extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.sea_creature", "10%");

	public SeaCreatureRing() {
		super(ItemProperties.fish_1, ModItemRarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

}