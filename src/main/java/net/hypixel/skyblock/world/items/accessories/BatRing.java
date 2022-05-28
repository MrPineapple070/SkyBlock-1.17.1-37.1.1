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
 * An {@link Accessory} that buffs.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Bat_Ring">Bat Ring</a>.<br>
 * <a href=
 * "http://textures.minecraft.net/texture/93c8aa3fde295fa9f9c27f734bdbab11d33a2e43e855accd7465352377413b">Texture</a>.
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class BatRing extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.bat_ring", StatString.health,
			StatString.speed, StatString.intelligence);

	public BatRing() {
		super(ItemProperties.miscellaneous_1, ModItemRarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}