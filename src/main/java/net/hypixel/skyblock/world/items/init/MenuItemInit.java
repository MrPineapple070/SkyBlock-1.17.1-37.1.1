package net.hypixel.skyblock.world.items.init;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.items.menu.MenuItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MenuItemInit {
	public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, SkyBlock.MOD_ID);

	public static final RegistryObject<MenuItem> close = items.register("close", MenuItem::new);
}