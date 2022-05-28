package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that reduces damage taken from {@link Zombie}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Zombie_Artifact">Zombie
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class ZombieArtifact extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.zombie", 15);

	public ZombieArtifact() {
		super(ItemProperties.combat_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}