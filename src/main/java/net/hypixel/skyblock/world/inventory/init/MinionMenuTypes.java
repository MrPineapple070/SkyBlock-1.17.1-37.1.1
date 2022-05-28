package net.hypixel.skyblock.world.inventory.init;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMC1;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMC2;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMC3;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMC4;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMC5;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMC6;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMC7;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMC8;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMC9;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMCa;
import net.hypixel.skyblock.world.inventory.minion.AcaciaMinionContainer.AcaciaMCb;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMC1;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMC2;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMC3;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMC4;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMC5;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMC6;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMC7;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMC8;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMC9;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMCa;
import net.hypixel.skyblock.world.inventory.minion.BirchMinionContainer.BirchMCb;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMC1;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMC2;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMC3;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMC4;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMC5;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMC6;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMC7;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMC8;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMC9;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMCa;
import net.hypixel.skyblock.world.inventory.minion.BlazeMinionContainer.BlazeMCb;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMC1;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMC2;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMC3;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMC4;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMC5;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMC6;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMC7;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMC8;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMC9;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMCa;
import net.hypixel.skyblock.world.inventory.minion.CoalMinionContainer.CoalMCb;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMC1;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMC2;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMC3;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMC4;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMC5;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMC6;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMC7;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMC8;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMC9;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMCa;
import net.hypixel.skyblock.world.inventory.minion.CobbleMinionContainer.CobbleMCb;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMC1;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMC2;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMC3;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMC4;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMC5;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMC6;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMC7;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMC8;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMC9;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMCa;
import net.hypixel.skyblock.world.inventory.minion.IronMinionContainer.IronMCb;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMC1;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMC2;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMC3;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMC4;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMC5;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMC6;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMC7;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMC8;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMC9;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMCa;
import net.hypixel.skyblock.world.inventory.minion.WheatMinionContainer.WheatMCb;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MinionMenuTypes {
	public static final DeferredRegister<MenuType<?>> menu = DeferredRegister
			.create(ForgeRegistries.CONTAINERS, SkyBlock.MOD_ID);

	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_1 = menu
			.register("acacia_minion_1", () -> IForgeContainerType.create(AcaciaMC1::new));
	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_2 = menu
			.register("acacia_minion_2", () -> IForgeContainerType.create(AcaciaMC2::new));
	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_3 = menu
			.register("acacia_minion_3", () -> IForgeContainerType.create(AcaciaMC3::new));
	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_4 = menu
			.register("acacia_minion_4", () -> IForgeContainerType.create(AcaciaMC4::new));
	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_5 = menu
			.register("acacia_minion_5", () -> IForgeContainerType.create(AcaciaMC5::new));
	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_6 = menu
			.register("acacia_minion_6", () -> IForgeContainerType.create(AcaciaMC6::new));
	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_7 = menu
			.register("acacia_minion_7", () -> IForgeContainerType.create(AcaciaMC7::new));
	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_8 = menu
			.register("acacia_minion_8", () -> IForgeContainerType.create(AcaciaMC8::new));
	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_9 = menu
			.register("acacia_minion_9", () -> IForgeContainerType.create(AcaciaMC9::new));
	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_a = menu
			.register("acacia_minion_a", () -> IForgeContainerType.create(AcaciaMCa::new));
	public static final RegistryObject<MenuType<AcaciaMinionContainer>> acacia_minion_b = menu
			.register("acacia_minion_b", () -> IForgeContainerType.create(AcaciaMCb::new));

	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_1 = menu
			.register("birch_minion_1", () -> IForgeContainerType.create(BirchMC1::new));
	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_2 = menu
			.register("birch_minion_2", () -> IForgeContainerType.create(BirchMC2::new));
	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_3 = menu
			.register("birch_minion_3", () -> IForgeContainerType.create(BirchMC3::new));
	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_4 = menu
			.register("birch_minion_4", () -> IForgeContainerType.create(BirchMC4::new));
	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_5 = menu
			.register("birch_minion_5", () -> IForgeContainerType.create(BirchMC5::new));
	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_6 = menu
			.register("birch_minion_6", () -> IForgeContainerType.create(BirchMC6::new));
	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_7 = menu
			.register("birch_minion_7", () -> IForgeContainerType.create(BirchMC7::new));
	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_8 = menu
			.register("birch_minion_8", () -> IForgeContainerType.create(BirchMC8::new));
	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_9 = menu
			.register("birch_minion_9", () -> IForgeContainerType.create(BirchMC9::new));
	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_a = menu
			.register("birch_minion_a", () -> IForgeContainerType.create(BirchMCa::new));
	public static final RegistryObject<MenuType<BirchMinionContainer>> birch_minion_b = menu
			.register("birch_minion_b", () -> IForgeContainerType.create(BirchMCb::new));

	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_1 = menu
			.register("blaze_minion_1", () -> IForgeContainerType.create(BlazeMC1::new));
	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_2 = menu
			.register("blaze_minion_2", () -> IForgeContainerType.create(BlazeMC2::new));
	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_3 = menu
			.register("blaze_minion_3", () -> IForgeContainerType.create(BlazeMC3::new));
	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_4 = menu
			.register("blaze_minion_4", () -> IForgeContainerType.create(BlazeMC4::new));
	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_5 = menu
			.register("blaze_minion_5", () -> IForgeContainerType.create(BlazeMC5::new));
	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_6 = menu
			.register("blaze_minion_6", () -> IForgeContainerType.create(BlazeMC6::new));
	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_7 = menu
			.register("blaze_minion_7", () -> IForgeContainerType.create(BlazeMC7::new));
	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_8 = menu
			.register("blaze_minion_8", () -> IForgeContainerType.create(BlazeMC8::new));
	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_9 = menu
			.register("blaze_minion_9", () -> IForgeContainerType.create(BlazeMC9::new));
	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_a = menu
			.register("blaze_minion_a", () -> IForgeContainerType.create(BlazeMCa::new));
	public static final RegistryObject<MenuType<BlazeMinionContainer>> blaze_minion_b = menu
			.register("blaze_minion_b", () -> IForgeContainerType.create(BlazeMCb::new));

	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_1 = menu
			.register("coal_minion_1", () -> IForgeContainerType.create(CoalMC1::new));
	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_2 = menu
			.register("coal_minion_2", () -> IForgeContainerType.create(CoalMC2::new));
	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_3 = menu
			.register("coal_minion_3", () -> IForgeContainerType.create(CoalMC3::new));
	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_4 = menu
			.register("coal_minion_4", () -> IForgeContainerType.create(CoalMC4::new));
	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_5 = menu
			.register("coal_minion_5", () -> IForgeContainerType.create(CoalMC5::new));
	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_6 = menu
			.register("coal_minion_6", () -> IForgeContainerType.create(CoalMC6::new));
	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_7 = menu
			.register("coal_minion_7", () -> IForgeContainerType.create(CoalMC7::new));
	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_8 = menu
			.register("coal_minion_8", () -> IForgeContainerType.create(CoalMC8::new));
	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_9 = menu
			.register("coal_minion_9", () -> IForgeContainerType.create(CoalMC9::new));
	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_a = menu
			.register("coal_minion_a", () -> IForgeContainerType.create(CoalMCa::new));
	public static final RegistryObject<MenuType<CoalMinionContainer>> coal_minion_b = menu
			.register("coal_minion_b", () -> IForgeContainerType.create(CoalMCb::new));

	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_1 = menu
			.register("cobble_minion_1", () -> IForgeContainerType.create(CobbleMC1::new));
	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_2 = menu
			.register("cobble_minion_2", () -> IForgeContainerType.create(CobbleMC2::new));
	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_3 = menu
			.register("cobble_minion_3", () -> IForgeContainerType.create(CobbleMC3::new));
	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_4 = menu
			.register("cobble_minion_4", () -> IForgeContainerType.create(CobbleMC4::new));
	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_5 = menu
			.register("cobble_minion_5", () -> IForgeContainerType.create(CobbleMC5::new));
	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_6 = menu
			.register("cobble_minion_6", () -> IForgeContainerType.create(CobbleMC6::new));
	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_7 = menu
			.register("cobble_minion_7", () -> IForgeContainerType.create(CobbleMC7::new));
	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_8 = menu
			.register("cobble_minion_8", () -> IForgeContainerType.create(CobbleMC8::new));
	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_9 = menu
			.register("cobble_minion_9", () -> IForgeContainerType.create(CobbleMC9::new));
	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_a = menu
			.register("cobble_minion_a", () -> IForgeContainerType.create(CobbleMCa::new));
	public static final RegistryObject<MenuType<CobbleMinionContainer>> cobblestone_minion_b = menu
			.register("cobble_minion_b", () -> IForgeContainerType.create(CobbleMCb::new));

	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_1 = menu
			.register("iron_minion_1", () -> IForgeContainerType.create(IronMC1::new));
	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_2 = menu
			.register("iron_minion_2", () -> IForgeContainerType.create(IronMC2::new));
	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_3 = menu
			.register("iron_minion_3", () -> IForgeContainerType.create(IronMC3::new));
	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_4 = menu
			.register("iron_minion_4", () -> IForgeContainerType.create(IronMC4::new));
	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_5 = menu
			.register("iron_minion_5", () -> IForgeContainerType.create(IronMC5::new));
	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_6 = menu
			.register("iron_minion_6", () -> IForgeContainerType.create(IronMC6::new));
	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_7 = menu
			.register("iron_minion_7", () -> IForgeContainerType.create(IronMC7::new));
	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_8 = menu
			.register("iron_minion_8", () -> IForgeContainerType.create(IronMC8::new));
	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_9 = menu
			.register("iron_minion_9", () -> IForgeContainerType.create(IronMC9::new));
	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_a = menu
			.register("iron_minion_a", () -> IForgeContainerType.create(IronMCa::new));
	public static final RegistryObject<MenuType<IronMinionContainer>> iron_minion_b = menu
			.register("iron_minion_b", () -> IForgeContainerType.create(IronMCb::new));

	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_1 = menu
			.register("wheat_minion_1", () -> IForgeContainerType.create(WheatMC1::new));
	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_2 = menu
			.register("wheat_minion_2", () -> IForgeContainerType.create(WheatMC2::new));
	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_3 = menu
			.register("wheat_minion_3", () -> IForgeContainerType.create(WheatMC3::new));
	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_4 = menu
			.register("wheat_minion_4", () -> IForgeContainerType.create(WheatMC4::new));
	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_5 = menu
			.register("wheat_minion_5", () -> IForgeContainerType.create(WheatMC5::new));
	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_6 = menu
			.register("wheat_minion_6", () -> IForgeContainerType.create(WheatMC6::new));
	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_7 = menu
			.register("wheat_minion_7", () -> IForgeContainerType.create(WheatMC7::new));
	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_8 = menu
			.register("wheat_minion_8", () -> IForgeContainerType.create(WheatMC8::new));
	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_9 = menu
			.register("wheat_minion_9", () -> IForgeContainerType.create(WheatMC9::new));
	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_a = menu
			.register("wheat_minion_a", () -> IForgeContainerType.create(WheatMCa::new));
	public static final RegistryObject<MenuType<WheatMinionContainer>> wheat_minion_b = menu
			.register("wheat_minion_b", () -> IForgeContainerType.create(WheatMCb::new));
}