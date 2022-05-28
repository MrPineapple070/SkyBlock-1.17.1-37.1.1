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
 * An {@link Accessory} that saves the players held coins when dying.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Piggy_Bank">Piggy Bank</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class PiggyBank extends Accessory {
	public static enum State {
		Broken, Cracked, Normal;
	}

	private static final Component percent0 = new TranslatableComponent("accessory.piggy.0");
	private static final Component percent1 = new TranslatableComponent("accessory.piggy.1");
	private static final Component percent2 = new TranslatableComponent("accessory.piggy.2");

	private State state;

	public PiggyBank() {
		super(ItemProperties.mine_1, ModItemRarity.Uncommon);
		this.state = State.Normal;
	}

	public void repair() {
		this.state = State.Normal;
	}

	public void use() {
		switch (this.state) {
		case Normal:
			this.state = State.Cracked;
			return;
		case Cracked:
			this.state = State.Broken;
			return;
		default:
			return;
		}
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		Component percent;
		switch (this.state) {
		case Normal:
			percent = percent0;
			break;
		case Cracked:
			percent = percent1;
			break;
		case Broken:
			percent = percent2;
			break;
		default:
			return;
		}
		tooltip.add(new TranslatableComponent("accessory.piggy", percent));
	}
}