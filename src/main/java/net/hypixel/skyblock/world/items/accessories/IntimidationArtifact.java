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
 * An {@link Accessory} that ensures that Monsters below level 25 will no longer
 * target the player.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Intimidation_Artifact">Intimidation
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 27 July 2020
 */
public class IntimidationArtifact extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.intimidation", 25);

	public IntimidationArtifact() {
		super(ItemProperties.combat_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}