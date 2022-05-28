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
 * An {@link Accessory} that makes heals 5% more effective.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Survivor_Cube">Survivor
 * Cube</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SurvivorCube extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.healing", 5);

	public SurvivorCube() {
		super(ItemProperties.combat_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}