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
 * An {@link Accessory} that triples the players pickup radius.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Magnetic_Talisman">Magnetic
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class MagneticTalisman extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.magnetic");

	public MagneticTalisman() {
		super(ItemProperties.mine_1, ModItemRarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}