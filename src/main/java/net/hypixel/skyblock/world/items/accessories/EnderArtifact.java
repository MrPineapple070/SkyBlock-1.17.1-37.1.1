package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that reduces the amount of damage taken from
 * {@link EnderDragon}, {@link Endermite} and {@link EnderMan}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Ender_Artifact">Ender
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class EnderArtifact extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.ender_artifact");

	public EnderArtifact() {
		super(ItemProperties.combat_1, ModItemRarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(info);
	}
}