package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that gives Haste I for 15 seconds when breaking any
 * block.
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class HasteRing extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.haste",
			((MutableComponent) MobEffects.DIG_SPEED.getDisplayName())
					.setStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.DIG_SPEED.getColor()))));

	public HasteRing() {
		super(ItemProperties.mine_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}