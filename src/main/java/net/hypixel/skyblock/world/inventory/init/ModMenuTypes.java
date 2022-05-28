package net.hypixel.skyblock.world.inventory.init;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.inventory.TimeSaverMenu;
import net.hypixel.skyblock.world.inventory.minion.MinionChestContainer.LargeMCC;
import net.hypixel.skyblock.world.inventory.minion.MinionChestContainer.MediumMCC;
import net.hypixel.skyblock.world.inventory.minion.MinionChestContainer.SmallMCC;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link MenuType} for this mod.
 *
 * @author MrPineapple070
 * @version 5 June 2020
 */
public class ModMenuTypes {
	public static final DeferredRegister<MenuType<?>> container_types = DeferredRegister
			.create(ForgeRegistries.CONTAINERS, SkyBlock.MOD_ID);
	
	public static final RegistryObject<MenuType<TimeSaverMenu>> time_saver = container_types
			.register("time_saver", () -> IForgeContainerType.create(TimeSaverMenu::new));

	public static final RegistryObject<MenuType<SmallMCC>> small_mcc = container_types.register("small_mcc",
			() -> IForgeContainerType.create(SmallMCC::new));
	public static final RegistryObject<MenuType<MediumMCC>> medium_mcc = container_types.register("medium_mcc",
			() -> IForgeContainerType.create(MediumMCC::new));
	public static final RegistryObject<MenuType<LargeMCC>> large_mcc = container_types.register("large_mcc",
			() -> IForgeContainerType.create(LargeMCC::new));
}