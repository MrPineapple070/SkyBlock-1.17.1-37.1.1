package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.Arrays;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableSet;

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

public class IronMinionTileEntity extends AbstractMiningMTE {
	public static class IronMTE1 extends IronMinionTileEntity {
		public IronMTE1(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_1.get(), pos, state, MinionTier.I);
		}
	}

	public static class IronMTE2 extends IronMinionTileEntity {
		public IronMTE2(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_2.get(), pos, state, MinionTier.I);
		}
	}

	public static class IronMTE3 extends IronMinionTileEntity {
		public IronMTE3(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_3.get(), pos, state, MinionTier.I);
		}
	}

	public static class IronMTE4 extends IronMinionTileEntity {
		public IronMTE4(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_4.get(), pos, state, MinionTier.I);
		}
	}

	public static class IronMTE5 extends IronMinionTileEntity {
		public IronMTE5(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_5.get(), pos, state, MinionTier.I);
		}
	}

	public static class IronMTE6 extends IronMinionTileEntity {
		public IronMTE6(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_6.get(), pos, state, MinionTier.I);
		}
	}

	public static class IronMTE7 extends IronMinionTileEntity {
		public IronMTE7(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_7.get(), pos, state, MinionTier.I);
		}
	}

	public static class IronMTE8 extends IronMinionTileEntity {
		public IronMTE8(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_8.get(), pos, state, MinionTier.I);
		}
	}

	public static class IronMTE9 extends IronMinionTileEntity {
		public IronMTE9(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_9.get(), pos, state, MinionTier.I);
		}
	}

	public static class IronMTEa extends IronMinionTileEntity {
		public IronMTEa(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_a.get(), pos, state, MinionTier.I);
		}
	}

	public static class IronMTEb extends IronMinionTileEntity {
		public IronMTEb(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.iron_minion_b.get(), pos, state, MinionTier.I);
		}
	}

	/**
	 * Primitive type array holding how frequently to interact.
	 */
	@Nonnull
	private static final int[] speed = { 340, 340, 300, 300, 280, 280, 240, 240, 200, 200, 160 };

	/**
	 * Holds {@link Item} to {@link #compactor()}
	 */
	@Nonnull
	private static final Item[] comp = new Item[] { Items.DIAMOND, Items.IRON_INGOT };

	/**
	 * {@link ImmutableSet} of {@link Block} holding valid {@link Block} to
	 * interact.
	 */
	@Nonnull
	private static final ImmutableSet<Block> valid = ImmutableSet.copyOf(Arrays.asList(Blocks.IRON_ORE));

	/**
	 * Holds {@link Item} to {@link #superCompactor()}
	 */
	@Nonnull
	private static final Item[] sup = new Item[] { Items.DIAMOND, Items.DIAMOND_BLOCK, Items.IRON_INGOT,
			Items.IRON_BLOCK, ItemInit.enchanted_diamond.get(), ItemInit.enchanted_iron_ingot.get() };

	public IronMinionTileEntity(BlockEntityType<? extends AbstractMinionTileEntity> type, BlockPos pos,
			BlockState state, MinionTier tier) {
		super(type, pos, state, tier);
	}

	@Override
	protected BlockState getState() {
		return Blocks.IRON_ORE.defaultBlockState();
	}

	@Override
	protected ImmutableSet<Block> getValidBlocks() {
		return valid;
	}

	@Override
	protected AbstractContainerMenu createMenu(int id, Inventory player) {
		switch (this.tier) {
		case I:
			return new IronMC1(id, player, this);
		case II:
			return new IronMC2(id, player, this);
		case III:
			return new IronMC3(id, player, this);
		case IV:
			return new IronMC4(id, player, this);
		case V:
			return new IronMC5(id, player, this);
		case VI:
			return new IronMC6(id, player, this);
		case VII:
			return new IronMC7(id, player, this);
		case VIII:
			return new IronMC8(id, player, this);
		case IX:
			return new IronMC9(id, player, this);
		case X:
			return new IronMCa(id, player, this);
		case XI:
			return new IronMCb(id, player, this);
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
	protected Item[] getSuperCompactor() {
		return sup;
	}

	@Override
	protected Component initDisplayName() {
		return new TranslatableComponent("minion.iron", this.tier.name());
	}
}