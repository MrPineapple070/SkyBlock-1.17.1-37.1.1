package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that adds buffs.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Bat_Artifact">Bat
 * Artifact</a>.<br>
 * <a href=
 * "http://textures.minecraft.net/texture/382fc3f71b41769376a9e92fe3adbaac3772b999b219c9d6b4680ba9983e527">Texture</a>.
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class BatArtifact extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.bat_artifact", StatString.health,
			StatString.speed, StatString.intelligence);

	public BatArtifact() {
		super(ItemProperties.miscellaneous_1, ModItemRarity.Legendary);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}