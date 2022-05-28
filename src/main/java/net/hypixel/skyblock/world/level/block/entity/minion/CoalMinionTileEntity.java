package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.Arrays;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableSet;

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

/**
 * The base for Coal Minion TileEntity
 *
 * @author MrPineapple070
 * @version 23 July 2020
 */
public class CoalMinionTileEntity extends AbstractMiningMTE {
	public static class CoalMTE1 extends CoalMinionTileEntity {
		public CoalMTE1(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_1.get(), pos, state, MinionTier.I);
		}
	}

	public static class CoalMTE2 extends CoalMinionTileEntity {
		public CoalMTE2(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_2.get(), pos, state, MinionTier.II);
		}
	}

	public static class CoalMTE3 extends CoalMinionTileEntity {
		public CoalMTE3(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_3.get(), pos, state, MinionTier.III);
		}
	}

	public static class CoalMTE4 extends CoalMinionTileEntity {
		public CoalMTE4(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_4.get(), pos, state, MinionTier.IV);
		}
	}

	public static class CoalMTE5 extends CoalMinionTileEntity {
		public CoalMTE5(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_5.get(), pos, state, MinionTier.V);
		}
	}

	public static class CoalMTE6 extends CoalMinionTileEntity {
		public CoalMTE6(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_6.get(), pos, state, MinionTier.VI);
		}
	}

	public static class CoalMTE7 extends CoalMinionTileEntity {
		public CoalMTE7(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_7.get(), pos, state, MinionTier.VII);
		}
	}

	public static class CoalMTE8 extends CoalMinionTileEntity {
		public CoalMTE8(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_8.get(), pos, state, MinionTier.VIII);
		}
	}

	public static class CoalMTE9 extends CoalMinionTileEntity {
		public CoalMTE9(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_9.get(), pos, state, MinionTier.IX);
		}
	}

	public static class CoalMTEa extends CoalMinionTileEntity {
		public CoalMTEa(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_a.get(), pos, state, MinionTier.X);
		}
	}

	public static class CoalMTEb extends CoalMinionTileEntity {
		public CoalMTEb(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.coal_minion_b.get(), pos, state, MinionTier.XI);
		}
	}
	
	/**
	 * Holds {@link Item} to compact using {@link #compactor()}
	 */
	@Nonnull
	private static final Item[] comp = new Item[] { Items.COAL, Items.DIAMOND };
	
	/**
	 * Holds how frequently to interact.
	 */
	@Nonnull
	private static final int[] speed = { 300, 300, 260, 260, 240, 240, 200, 200, 180, 180, 140, 120 };
	
	/**
	 * Holds {@link Item} to super compact using {@link #superCompactor()}
	 */
	@Nonnull
	private static final Item[] sup = new Item[] { Items.COAL, Items.COAL_BLOCK, Items.DIAMOND, Items.DIAMOND_BLOCK,
			ItemInit.enchanted_coal.get(), ItemInit.enchanted_diamond.get() };
	
	/**
	 * {@link ImmutableSet} of {@link Block} holding valid {@link Block} to interact.
	 */
	@Nonnull
	private static final ImmutableSet<Block> valid = ImmutableSet.copyOf(Arrays.asList(Blocks.AIR, Blocks.COAL_ORE));

	public CoalMinionTileEntity(BlockEntityType<? extends AbstractMinionTileEntity> type, BlockPos pos, BlockState state, MinionTier tier) {
		super(type, pos, state, tier);
	}

	@Override
	protected AbstractContainerMenu createMenu(int id, Inventory player) {
		switch (this.tier) {
		case I:
			return new CoalMC1(id, player, this);
		case II:
			return new CoalMC2(id, player, this);
		case III:
			return new CoalMC3(id, player, this);
		case IV:
			return new CoalMC4(id, player, this);
		case V:
			return new CoalMC5(id, player, this);
		case VI:
			return new CoalMC6(id, player, this);
		case VII:
			return new CoalMC7(id, player, this);
		case VIII:
			return new CoalMC8(id, player, this);
		case IX:
			return new CoalMC9(id, player, this);
		case X:
			return new CoalMCa(id, player, this);
		case XI:
			return new CoalMCb(id, player, this);
		default:
			throw new IllegalStateException("Illegal MinionTier:\t" + this.tier.name());
		}
	}

	@Override
	protected Item[] getCompactor() {
		return comp;
	}

	@Override
	protected int getSpeed(MinionTier tier) {
		return speed[tier.asInt];
	}

	@Override
	protected BlockState getState() {
		return Blocks.COAL_ORE.defaultBlockState();
	}

	@Override
	protected Item[] getSuperCompactor() {
		return sup;
	}

	@Override
	protected ImmutableSet<Block> getValidBlocks() {
		return valid;
	}

	@Override
	protected Component initDisplayName() {
		return new TranslatableComponent("minion.coal", this.tier.name());
	}
}