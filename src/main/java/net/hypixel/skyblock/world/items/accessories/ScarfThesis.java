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
 * An {@link Accessory} that increases dungeon class experience by 4%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Scarf%27s_Thesis">Scarf's
 * Thesis</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class ScarfThesis extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.scarf", "4%");

	public ScarfThesis() {
		super(ItemProperties.dungeon_1, ModItemRarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}