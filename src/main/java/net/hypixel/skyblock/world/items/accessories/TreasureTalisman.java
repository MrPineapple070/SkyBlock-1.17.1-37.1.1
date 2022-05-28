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
 * The
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Treasure_Talisman">Treasure
 * Talisman</a>.
 *
 * @author MrPineapple070
 * @version 19 August 2020
 * @since 19 August 2020
 */
public class TreasureTalisman extends Accessory {
	public static final Component info = new TranslatableComponent("accessory.treasure", 1);

	public TreasureTalisman() {
		super(ItemProperties.dungeon_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}