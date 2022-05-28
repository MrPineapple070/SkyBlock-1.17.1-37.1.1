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
 * An {@link Accessory} that increases the experience from orbs by 25% <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Experience_Artifact">Experience
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class ExperienceArtifact extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.experience_artifact");

	public ExperienceArtifact() {
		super(ItemProperties.mine_1, ModItemRarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}