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
 * An {@link Accessory} that increases that chance for mobs to drop Candy by
 * 15%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Candy_Artifact">Candy
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class CandyArtifact extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.candy_artifact");

	public CandyArtifact() {
		super(ItemProperties.miscellaneous_1, ModItemRarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}