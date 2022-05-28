package net.hypixel.skyblock.world.level.block.entity;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.level.block.entity.TimeSaverTileEntity.DaySaverTileEntity;
import net.hypixel.skyblock.world.level.block.entity.TimeSaverTileEntity.NightSaverTileEntity;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionChestBlockEntity.LargeMCTE;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionChestBlockEntity.MediumMCTE;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionChestBlockEntity.SmallMCTE;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTE1;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTE2;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTE3;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTE4;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTE5;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTE6;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTE7;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTE8;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTE9;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTEa;
import net.hypixel.skyblock.world.level.block.entity.minion.AcaciaMinionTileEntity.AcaciaMTEb;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTE1;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTE2;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTE3;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTE4;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTE5;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTE6;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTE7;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTE8;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTE9;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTEa;
import net.hypixel.skyblock.world.level.block.entity.minion.BirchMinionTileEntity.BirchMTEb;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTE1;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTE2;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTE3;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTE4;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTE5;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTE6;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTE7;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTE8;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTE9;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTEa;
import net.hypixel.skyblock.world.level.block.entity.minion.BlazeMinionTileEntity.BlazeMTEb;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTE1;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTE2;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTE3;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTE4;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTE5;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTE6;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTE7;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTE8;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTE9;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTEa;
import net.hypixel.skyblock.world.level.block.entity.minion.CoalMinionTileEntity.CoalMTEb;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTE1;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTE2;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTE3;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTE4;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTE5;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTE6;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTE7;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTE8;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTE9;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTEa;
import net.hypixel.skyblock.world.level.block.entity.minion.CobblestoneMinionTileEntity.CobbleMTEb;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTE1;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTE2;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTE3;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTE4;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTE5;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTE6;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTE7;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTE8;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTE9;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTEa;
import net.hypixel.skyblock.world.level.block.entity.minion.IronMinionTileEntity.IronMTEb;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTE1;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTE2;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTE3;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTE4;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTE5;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTE6;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTE7;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTE8;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTE9;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTEa;
import net.hypixel.skyblock.world.level.block.entity.minion.WheatMinionTileEntity.WheatMTEb;
import net.hypixel.skyblock.world.level.block.init.BlockInit;
import net.hypixel.skyblock.world.level.block.init.MinionBlockInit;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType.Builder;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link BlockEntityType} for this mod.
 *
 * @author MrPineapple070
 * @version 5 June 2020
 * @since 11 June 2019
 */
public class ModBlockEntityTypes {
	public static final DeferredRegister<BlockEntityType<?>> be_types = DeferredRegister
			.create(ForgeRegistries.BLOCK_ENTITIES, SkyBlock.MOD_ID);

	public static final RegistryObject<BlockEntityType<AcaciaMTE1>> acacia_minion_1 = be_types.register(
			"acacia_minion_1", () -> Builder.of(AcaciaMTE1::new, MinionBlockInit.acacia_minion_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<AcaciaMTE2>> acacia_minion_2 = be_types.register(
			"acacia_minion_2", () -> Builder.of(AcaciaMTE2::new, MinionBlockInit.acacia_minion_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<AcaciaMTE3>> acacia_minion_3 = be_types.register(
			"acacia_minion_3", () -> Builder.of(AcaciaMTE3::new, MinionBlockInit.acacia_minion_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<AcaciaMTE4>> acacia_minion_4 = be_types.register(
			"acacia_minion_4", () -> Builder.of(AcaciaMTE4::new, MinionBlockInit.acacia_minion_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<AcaciaMTE5>> acacia_minion_5 = be_types.register(
			"acacia_minion_5", () -> Builder.of(AcaciaMTE5::new, MinionBlockInit.acacia_minion_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<AcaciaMTE6>> acacia_minion_6 = be_types.register(
			"acacia_minion_6", () -> Builder.of(AcaciaMTE6::new, MinionBlockInit.acacia_minion_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<AcaciaMTE7>> acacia_minion_7 = be_types.register(
			"acacia_minion_7", () -> Builder.of(AcaciaMTE7::new, MinionBlockInit.acacia_minion_7.get()).build(null));
	public static final RegistryObject<BlockEntityType<AcaciaMTE8>> acacia_minion_8 = be_types.register(
			"acacia_minion_8", () -> Builder.of(AcaciaMTE8::new, MinionBlockInit.acacia_minion_8.get()).build(null));
	public static final RegistryObject<BlockEntityType<AcaciaMTE9>> acacia_minion_9 = be_types.register(
			"acacia_minion_9", () -> Builder.of(AcaciaMTE9::new, MinionBlockInit.acacia_minion_9.get()).build(null));
	public static final RegistryObject<BlockEntityType<AcaciaMTEa>> acacia_minion_a = be_types.register(
			"acacia_minion_a", () -> Builder.of(AcaciaMTEa::new, MinionBlockInit.acacia_minion_a.get()).build(null));
	public static final RegistryObject<BlockEntityType<AcaciaMTEb>> acacia_minion_b = be_types.register(
			"acacia_minion_b", () -> Builder.of(AcaciaMTEb::new, MinionBlockInit.acacia_minion_b.get()).build(null));

	public static final RegistryObject<BlockEntityType<BirchMTE1>> birch_minion_1 = be_types.register("birch_minion_1",
			() -> Builder.of(BirchMTE1::new, MinionBlockInit.birch_minion_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<BirchMTE2>> birch_minion_2 = be_types.register("birch_minion_2",
			() -> Builder.of(BirchMTE2::new, MinionBlockInit.birch_minion_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<BirchMTE3>> birch_minion_3 = be_types.register("birch_minion_3",
			() -> Builder.of(BirchMTE3::new, MinionBlockInit.birch_minion_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<BirchMTE4>> birch_minion_4 = be_types.register("birch_minion_4",
			() -> Builder.of(BirchMTE4::new, MinionBlockInit.birch_minion_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<BirchMTE5>> birch_minion_5 = be_types.register("birch_minion_5",
			() -> Builder.of(BirchMTE5::new, MinionBlockInit.birch_minion_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<BirchMTE6>> birch_minion_6 = be_types.register("birch_minion_6",
			() -> Builder.of(BirchMTE6::new, MinionBlockInit.birch_minion_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<BirchMTE7>> birch_minion_7 = be_types.register("birch_minion_7",
			() -> Builder.of(BirchMTE7::new, MinionBlockInit.birch_minion_7.get()).build(null));
	public static final RegistryObject<BlockEntityType<BirchMTE8>> birch_minion_8 = be_types.register("birch_minion_8",
			() -> Builder.of(BirchMTE8::new, MinionBlockInit.birch_minion_8.get()).build(null));
	public static final RegistryObject<BlockEntityType<BirchMTE9>> birch_minion_9 = be_types.register("birch_minion_9",
			() -> Builder.of(BirchMTE9::new, MinionBlockInit.birch_minion_9.get()).build(null));
	public static final RegistryObject<BlockEntityType<BirchMTEa>> birch_minion_a = be_types.register("birch_minion_a",
			() -> Builder.of(BirchMTEa::new, MinionBlockInit.birch_minion_a.get()).build(null));
	public static final RegistryObject<BlockEntityType<BirchMTEb>> birch_minion_b = be_types.register("birch_minion_b",
			() -> Builder.of(BirchMTEb::new, MinionBlockInit.birch_minion_b.get()).build(null));

	public static final RegistryObject<BlockEntityType<BlazeMTE1>> blaze_minion_1 = be_types.register("blaze_minion_1",
			() -> Builder.of(BlazeMTE1::new, MinionBlockInit.blaze_minion_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlazeMTE2>> blaze_minion_2 = be_types.register("blaze_minion_2",
			() -> Builder.of(BlazeMTE2::new, MinionBlockInit.blaze_minion_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlazeMTE3>> blaze_minion_3 = be_types.register("blaze_minion_3",
			() -> Builder.of(BlazeMTE3::new, MinionBlockInit.blaze_minion_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlazeMTE4>> blaze_minion_4 = be_types.register("blaze_minion_4",
			() -> Builder.of(BlazeMTE4::new, MinionBlockInit.blaze_minion_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlazeMTE5>> blaze_minion_5 = be_types.register("blaze_minion_5",
			() -> Builder.of(BlazeMTE5::new, MinionBlockInit.blaze_minion_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlazeMTE6>> blaze_minion_6 = be_types.register("blaze_minion_6",
			() -> Builder.of(BlazeMTE6::new, MinionBlockInit.blaze_minion_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlazeMTE7>> blaze_minion_7 = be_types.register("blaze_minion_7",
			() -> Builder.of(BlazeMTE7::new, MinionBlockInit.blaze_minion_7.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlazeMTE8>> blaze_minion_8 = be_types.register("blaze_minion_8",
			() -> Builder.of(BlazeMTE8::new, MinionBlockInit.blaze_minion_8.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlazeMTE9>> blaze_minion_9 = be_types.register("blaze_minion_9",
			() -> Builder.of(BlazeMTE9::new, MinionBlockInit.blaze_minion_9.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlazeMTEa>> blaze_minion_a = be_types.register("blaze_minion_a",
			() -> Builder.of(BlazeMTEa::new, MinionBlockInit.blaze_minion_a.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlazeMTEb>> blaze_minion_b = be_types.register("blaze_minion_b",
			() -> Builder.of(BlazeMTEb::new, MinionBlockInit.blaze_minion_b.get()).build(null));

	public static final RegistryObject<BlockEntityType<CoalMTE1>> coal_minion_1 = be_types.register("coal_minion_1",
			() -> Builder.of(CoalMTE1::new, MinionBlockInit.coal_minion_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoalMTE2>> coal_minion_2 = be_types.register("coal_minion_2",
			() -> Builder.of(CoalMTE2::new, MinionBlockInit.coal_minion_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoalMTE3>> coal_minion_3 = be_types.register("coal_minion_3",
			() -> Builder.of(CoalMTE3::new, MinionBlockInit.coal_minion_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoalMTE4>> coal_minion_4 = be_types.register("coal_minion_4",
			() -> Builder.of(CoalMTE4::new, MinionBlockInit.coal_minion_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoalMTE5>> coal_minion_5 = be_types.register("coal_minion_5",
			() -> Builder.of(CoalMTE5::new, MinionBlockInit.coal_minion_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoalMTE6>> coal_minion_6 = be_types.register("coal_minion_6",
			() -> Builder.of(CoalMTE6::new, MinionBlockInit.coal_minion_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoalMTE7>> coal_minion_7 = be_types.register("coal_minion_7",
			() -> Builder.of(CoalMTE7::new, MinionBlockInit.coal_minion_7.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoalMTE8>> coal_minion_8 = be_types.register("coal_minion_8",
			() -> Builder.of(CoalMTE8::new, MinionBlockInit.coal_minion_8.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoalMTE9>> coal_minion_9 = be_types.register("coal_minion_9",
			() -> Builder.of(CoalMTE9::new, MinionBlockInit.coal_minion_9.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoalMTEa>> coal_minion_a = be_types.register("coal_minion_a",
			() -> Builder.of(CoalMTEa::new, MinionBlockInit.coal_minion_a.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoalMTEb>> coal_minion_b = be_types.register("coal_minion_b",
			() -> Builder.of(CoalMTEb::new, MinionBlockInit.coal_minion_b.get()).build(null));

	public static final RegistryObject<BlockEntityType<CobbleMTE1>> cobble_minion_1 = be_types.register(
			"cobble_minion_1", () -> Builder.of(CobbleMTE1::new, MinionBlockInit.cobble_minion_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<CobbleMTE2>> cobble_minion_2 = be_types.register(
			"cobble_minion_2", () -> Builder.of(CobbleMTE2::new, MinionBlockInit.cobble_minion_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<CobbleMTE3>> cobble_minion_3 = be_types.register(
			"cobble_minion_3", () -> Builder.of(CobbleMTE3::new, MinionBlockInit.cobble_minion_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<CobbleMTE4>> cobble_minion_4 = be_types.register(
			"cobble_minion_4", () -> Builder.of(CobbleMTE4::new, MinionBlockInit.cobble_minion_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<CobbleMTE5>> cobble_minion_5 = be_types.register(
			"cobble_minion_5", () -> Builder.of(CobbleMTE5::new, MinionBlockInit.cobble_minion_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<CobbleMTE6>> cobble_minion_6 = be_types.register(
			"cobble_minion_6", () -> Builder.of(CobbleMTE6::new, MinionBlockInit.cobble_minion_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<CobbleMTE7>> cobble_minion_7 = be_types.register(
			"cobble_minion_7", () -> Builder.of(CobbleMTE7::new, MinionBlockInit.cobble_minion_7.get()).build(null));
	public static final RegistryObject<BlockEntityType<CobbleMTE8>> cobble_minion_8 = be_types.register(
			"cobble_minion_8", () -> Builder.of(CobbleMTE8::new, MinionBlockInit.cobble_minion_8.get()).build(null));
	public static final RegistryObject<BlockEntityType<CobbleMTE9>> cobble_minion_9 = be_types.register(
			"cobble_minion_9", () -> Builder.of(CobbleMTE9::new, MinionBlockInit.cobble_minion_9.get()).build(null));
	public static final RegistryObject<BlockEntityType<CobbleMTEa>> cobble_minion_a = be_types.register(
			"cobble_minion_a", () -> Builder.of(CobbleMTEa::new, MinionBlockInit.cobble_minion_a.get()).build(null));
	public static final RegistryObject<BlockEntityType<CobbleMTEb>> cobble_minion_b = be_types.register(
			"cobble_minion_b", () -> Builder.of(CobbleMTEb::new, MinionBlockInit.cobble_minion_b.get()).build(null));

	public static final RegistryObject<BlockEntityType<IronMTE1>> iron_minion_1 = be_types.register("iron_minion_1",
			() -> Builder.of(IronMTE1::new, MinionBlockInit.iron_minion_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronMTE2>> iron_minion_2 = be_types.register("iron_minion_2",
			() -> Builder.of(IronMTE2::new, MinionBlockInit.iron_minion_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronMTE3>> iron_minion_3 = be_types.register("iron_minion_3",
			() -> Builder.of(IronMTE3::new, MinionBlockInit.iron_minion_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronMTE4>> iron_minion_4 = be_types.register("iron_minion_4",
			() -> Builder.of(IronMTE4::new, MinionBlockInit.iron_minion_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronMTE5>> iron_minion_5 = be_types.register("iron_minion_5",
			() -> Builder.of(IronMTE5::new, MinionBlockInit.iron_minion_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronMTE6>> iron_minion_6 = be_types.register("iron_minion_6",
			() -> Builder.of(IronMTE6::new, MinionBlockInit.iron_minion_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronMTE7>> iron_minion_7 = be_types.register("iron_minion_7",
			() -> Builder.of(IronMTE7::new, MinionBlockInit.iron_minion_7.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronMTE8>> iron_minion_8 = be_types.register("iron_minion_8",
			() -> Builder.of(IronMTE8::new, MinionBlockInit.iron_minion_8.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronMTE9>> iron_minion_9 = be_types.register("iron_minion_9",
			() -> Builder.of(IronMTE9::new, MinionBlockInit.iron_minion_9.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronMTEa>> iron_minion_a = be_types.register("iron_minion_a",
			() -> Builder.of(IronMTEa::new, MinionBlockInit.iron_minion_a.get()).build(null));
	public static final RegistryObject<BlockEntityType<IronMTEb>> iron_minion_b = be_types.register("iron_minion_b",
			() -> Builder.of(IronMTEb::new, MinionBlockInit.iron_minion_b.get()).build(null));

	public static final RegistryObject<BlockEntityType<WheatMTE1>> wheat_minion_1 = be_types.register("wheat_minion_1",
			() -> Builder.of(WheatMTE1::new, MinionBlockInit.wheat_minion_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<WheatMTE2>> wheat_minion_2 = be_types.register("wheat_minion_2",
			() -> Builder.of(WheatMTE2::new, MinionBlockInit.wheat_minion_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<WheatMTE3>> wheat_minion_3 = be_types.register("wheat_minion_3",
			() -> Builder.of(WheatMTE3::new, MinionBlockInit.wheat_minion_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<WheatMTE4>> wheat_minion_4 = be_types.register("wheat_minion_4",
			() -> Builder.of(WheatMTE4::new, MinionBlockInit.wheat_minion_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<WheatMTE5>> wheat_minion_5 = be_types.register("wheat_minion_5",
			() -> Builder.of(WheatMTE5::new, MinionBlockInit.wheat_minion_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<WheatMTE6>> wheat_minion_6 = be_types.register("wheat_minion_6",
			() -> Builder.of(WheatMTE6::new, MinionBlockInit.wheat_minion_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<WheatMTE7>> wheat_minion_7 = be_types.register("wheat_minion_7",
			() -> Builder.of(WheatMTE7::new, MinionBlockInit.wheat_minion_7.get()).build(null));
	public static final RegistryObject<BlockEntityType<WheatMTE8>> wheat_minion_8 = be_types.register("wheat_minion_8",
			() -> Builder.of(WheatMTE8::new, MinionBlockInit.wheat_minion_8.get()).build(null));
	public static final RegistryObject<BlockEntityType<WheatMTE9>> wheat_minion_9 = be_types.register("wheat_minion_9",
			() -> Builder.of(WheatMTE9::new, MinionBlockInit.wheat_minion_9.get()).build(null));
	public static final RegistryObject<BlockEntityType<WheatMTEa>> wheat_minion_a = be_types.register("wheat_minion_a",
			() -> Builder.of(WheatMTEa::new, MinionBlockInit.wheat_minion_a.get()).build(null));
	public static final RegistryObject<BlockEntityType<WheatMTEb>> wheat_minion_b = be_types.register("wheat_minion_b",
			() -> Builder.of(WheatMTEb::new, MinionBlockInit.wheat_minion_b.get()).build(null));

	public static final RegistryObject<BlockEntityType<DaySaverTileEntity>> day_saver = be_types.register("day_saver",
			() -> Builder.of(DaySaverTileEntity::new, BlockInit.day_saver.get()).build(null));
	public static final RegistryObject<BlockEntityType<NightSaverTileEntity>> night_saver = be_types.register(
			"night_saver", () -> Builder.of(NightSaverTileEntity::new, BlockInit.night_saver.get()).build(null));

	public static final RegistryObject<BlockEntityType<SmallMCTE>> small_mcte = be_types.register("small_mcte",
			() -> Builder.of(SmallMCTE::new, BlockInit.small_mcb.get()).build(null));
	public static final RegistryObject<BlockEntityType<MediumMCTE>> medium_mcte = be_types.register("medium_mcte",
			() -> Builder.of(MediumMCTE::new, BlockInit.medium_mcb.get()).build(null));
	public static final RegistryObject<BlockEntityType<LargeMCTE>> large_mcte = be_types.register("large_mcte",
			() -> Builder.of(LargeMCTE::new, BlockInit.large_mcb.get()).build(null));
}