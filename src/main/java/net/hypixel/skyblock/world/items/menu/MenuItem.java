package net.hypixel.skyblock.world.items.menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.commands.arguments.item.ItemInput;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class MenuItem extends Item {
	protected static final Logger LOGGER = LogManager.getLogger();
	protected static final Properties properties = new Properties().stacksTo(1);

	public MenuItem() {
		super(properties);
	}

	public void inventoryTick(ItemStack stack, Level world, Entity entity, int slot, boolean selected) {
		if (world.isClientSide)
			return;
		LOGGER.debug("Removing " + this.getRegistryName().toString());
		if (!(entity instanceof Player))
			return;
		Player player = (Player) entity;
		player.getInventory().clearOrCountMatchingItems(new ItemInput(this, null), Integer.MAX_VALUE,
				player.inventoryMenu.getCraftSlots());
	}
}