package net.hypixel.skyblock.world.items.init;

import net.hypixel.skyblock.SkyBlock;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PetItemInit {
	public static final DeferredRegister<Item> pets = DeferredRegister.create(ForgeRegistries.ITEMS, SkyBlock.MOD_ID);

	//public static final RegistryObject<Item> bat_pet = pets.register("bat_pet", BatPetItem::new);
}