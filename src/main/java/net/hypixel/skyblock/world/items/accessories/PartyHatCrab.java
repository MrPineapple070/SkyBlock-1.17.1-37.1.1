package net.hypixel.skyblock.world.items.accessories;

import java.util.List;
import java.util.Objects;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that grants +1
 * <font style="color:#55FFFF">Intelligence</font> per in-game year played.<Br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Crab_Hat_of_Celebration">Crab Hat
 * of Celebration</a>
 *
 * @author MrPineapple070
 * @version 27 July 2020
 */
public class PartyHatCrab extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.party_hat",
			StatString.intelligence);

	/**
	 * The {@link DyeColor} of this.
	 */
	private final DyeColor color;

	/**
	 * @param color {@link DyeColor} for this.
	 */
	public PartyHatCrab(DyeColor color) {
		super(ItemProperties.miscellaneous_1, ModItemRarity.Common);
		switch (Objects.requireNonNull(color, "Must have a color.")) {
		case RED:
		case ORANGE:
		case YELLOW:
		case LIME:
		case GREEN:
		case LIGHT_BLUE:
		case PURPLE:
		case PINK:
		case BLACK:
			this.color = color;
			break;
		default:
			throw new IllegalArgumentException("Illegal color: " + color);
		}
	}
	
	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	/**
	 * @return {@link #color}
	 */
	public DyeColor getColor() {
		return this.color;
	}
}