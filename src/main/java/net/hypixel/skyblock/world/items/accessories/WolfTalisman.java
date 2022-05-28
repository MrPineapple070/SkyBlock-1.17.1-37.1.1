package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that reduces damage taken from {@link Wolf} by
 * 5%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Wolf_Talisman">Wolf
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class WolfTalisman extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.wolf", 5);

	public WolfTalisman() {
		super(ItemProperties.combat_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}