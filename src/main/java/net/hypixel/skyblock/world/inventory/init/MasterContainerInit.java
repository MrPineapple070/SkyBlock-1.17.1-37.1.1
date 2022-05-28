package net.hypixel.skyblock.world.inventory.init;

import net.minecraftforge.eventbus.api.IEventBus;

public class MasterContainerInit {
	public static final void register(IEventBus bus) {
		MinionMenuTypes.menu.register(bus);
		ModMenuTypes.container_types.register(bus);
	}
}