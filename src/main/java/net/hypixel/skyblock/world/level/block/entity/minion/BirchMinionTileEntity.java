package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.Arrays;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableSet;

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
import net.hypixel.skyblock.world.items.init.ItemInit;
import net.hypixel.skyblock.world.level.block.entity.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class BirchMinionTileEntity extends AbstractForagingMTE {
	public static class BirchMTE1 extends BirchMinionTileEntity {
		public BirchMTE1(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_1.get(), pos, state, MinionTier.I);
		}
	}

	public static class BirchMTE2 extends BirchMinionTileEntity {
		public BirchMTE2(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_2.get(), pos, state, MinionTier.II);
		}
	}

	public static class BirchMTE3 extends BirchMinionTileEntity {
		public BirchMTE3(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_1.get(), pos, state, MinionTier.III);
		}
	}

	public static class BirchMTE4 extends BirchMinionTileEntity {
		public BirchMTE4(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_1.get(), pos, state, MinionTier.IV);
		}
	}

	public static class BirchMTE5 extends BirchMinionTileEntity {
		public BirchMTE5(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_1.get(), pos, state, MinionTier.V);
		}
	}

	public static class BirchMTE6 extends BirchMinionTileEntity {
		public BirchMTE6(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_1.get(), pos, state, MinionTier.VI);
		}
	}

	public static class BirchMTE7 extends BirchMinionTileEntity {
		public BirchMTE7(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_1.get(), pos, state, MinionTier.VII);
		}
	}

	public static class BirchMTE8 extends BirchMinionTileEntity {
		public BirchMTE8(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_1.get(), pos, state, MinionTier.VIII);
		}
	}

	public static class BirchMTE9 extends BirchMinionTileEntity {
		public BirchMTE9(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_1.get(), pos, state, MinionTier.IX);
		}
	}

	public static class BirchMTEa extends BirchMinionTileEntity {
		public BirchMTEa(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_1.get(), pos, state, MinionTier.X);
		}
	}

	public static class BirchMTEb extends BirchMinionTileEntity {
		public BirchMTEb(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.birch_minion_1.get(), pos, state, MinionTier.XI);
		}
	}
	
	/**
	 * Primitive type array of int holding how frequently to interact.
	 */
	@Nonnull
	protected static final int[] speed = { 960, 960, 900, 900, 840, 840, 760, 760, 660, 660, 540};
	
	/**
	 * {@link ImmutableSet} of {@link Block} holding valid {@link Block} to break.
	 */
	@Nonnull
	protected static final ImmutableSet<Block> valid = ImmutableSet.copyOf(Arrays.asList(Blocks.BIRCH_LOG));
	
	public BirchMinionTileEntity(BlockEntityType<? extends AbstractMinionTileEntity> type, BlockPos pos, BlockState state, MinionTier tier) {
		super(type, pos, state, tier);
	}

	@Override
	protected AbstractContainerMenu createMenu(int id, Inventory player) {
		switch (this.tier) {
		case I:
			return new BirchMC1(id, player, this);
		case II:
			return new BirchMC2(id, player, this);
		case III:
			return new BirchMC3(id, player, this);
		case IV:
			return new BirchMC4(id, player, this);
		case V:
			return new BirchMC5(id, player, this);
		case VI:
			return new BirchMC6(id, player, this);
		case VII:
			return new BirchMC7(id, player, this);
		case VIII:
			return new BirchMC8(id, player, this);
		case IX:
			return new BirchMC9(id, player, this);
		case X:
			return new BirchMCa(id, player, this);
		case XI:
			return new BirchMCb(id, player, this);
		default:
			throw new IllegalStateException("Illegal MinionTier:\t" + this.tier.name());
		}
	}

	@Override
	protected int getSpeed(MinionTier tier) {
		return speed[tier.asInt];
	}

	@Override
	protected BlockState getState() {
		return Blocks.BIRCH_LOG.defaultBlockState();
	}

	@Override
	protected Item[] getSuperCompactor() {
		return new Item[] { Items.DIAMOND, Items.BIRCH_LOG, ItemInit.enchanted_diamond.get() };
	}

	@Override
	protected ImmutableSet<Block> getValidBlocks() {
		return valid;
	}

	@Override
	protected Component initDisplayName() {
		return new TranslatableComponent("minion.birch", this.tier.name());
	}
}