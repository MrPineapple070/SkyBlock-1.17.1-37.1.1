package net.hypixel.skyblock.world.inventory;

import net.hypixel.skyblock.world.items.init.MenuItemInit;
import net.minecraft.client.Minecraft;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;

public class CloseSlot extends GUISlot {

	public CloseSlot(Container inventory, int slot, int x, int y) {
		super(inventory, slot, x, y, MenuItemInit.close.get());
	}

	@Override
	public boolean mayPickup(Player player) {
		LOGGER.debug("Closing");
		final Minecraft minecraft = Minecraft.getInstance();
		minecraft.player.closeContainer();
		return false;
	}
}