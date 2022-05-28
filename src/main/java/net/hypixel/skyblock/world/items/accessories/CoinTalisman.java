package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.init.ItemInit;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that will occasionally spawn Coins.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Talisman_of_Coins">Talisman
 * of Coins</a>
 *
 * @author MrPineapple070
 * @version 18 May 2020
 */
public class CoinTalisman extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.coin_talisman");
	private int tick;

	public CoinTalisman() {
		super(ItemProperties.miscellaneous_1, ModItemRarity.Common);
		this.tick = 0;
	}
	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof Player))
			return;
		this.tick = ++this.tick % 6000;
		if (this.tick == 0)
			level.addFreshEntity(new ItemEntity(level, entity.getX() + level.getRandom().nextInt(32) - 16,
					entity.getY(), entity.getZ() + level.getRandom().nextInt(32) - 16,
					new ItemStack(ItemInit.enchanted_diamond_block.get())));
	}
}