package net.hypixel.skyblock.world.inventory;

import net.hypixel.skyblock.world.inventory.init.ModMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;

public class TimeSaverMenu extends AbstractContainerMenu {
	protected TimeSaverMenu(int id) {
		super(ModMenuTypes.time_saver.get(), id);
	}
	
	public TimeSaverMenu(int id, Inventory inventory, FriendlyByteBuf buffer) {
		this(id);
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}
}