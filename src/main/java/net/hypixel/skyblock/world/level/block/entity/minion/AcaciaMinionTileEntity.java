package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.Arrays;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableSet;

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
 * @author MrPineapple070
 * @version 31 December 2020
 * @since 11 July 2019
 */
public class AcaciaMinionTileEntity extends AbstractForagingMTE {
	public static class AcaciaMTE1 extends AcaciaMinionTileEntity {
		public AcaciaMTE1(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_1.get(), pos, state, MinionTier.I);
		}
	}

	public static class AcaciaMTE2 extends AcaciaMinionTileEntity {
		public AcaciaMTE2(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_2.get(), pos, state, MinionTier.II);
		}
	}

	public static class AcaciaMTE3 extends AcaciaMinionTileEntity {
		public AcaciaMTE3(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_3.get(), pos, state, MinionTier.III);
		}
	}

	public static class AcaciaMTE4 extends AcaciaMinionTileEntity {
		public AcaciaMTE4(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_4.get(), pos, state, MinionTier.IV);
		}
	}

	public static class AcaciaMTE5 extends AcaciaMinionTileEntity {
		public AcaciaMTE5(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_5.get(), pos, state, MinionTier.V);
		}
	}

	public static class AcaciaMTE6 extends AcaciaMinionTileEntity {
		public AcaciaMTE6(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_6.get(), pos, state, MinionTier.VI);
		}
	}

	public static class AcaciaMTE7 extends AcaciaMinionTileEntity {
		public AcaciaMTE7(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_7.get(), pos, state, MinionTier.VII);
		}
	}

	public static class AcaciaMTE8 extends AcaciaMinionTileEntity {
		public AcaciaMTE8(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_8.get(), pos, state, MinionTier.VIII);
		}
	}

	public static class AcaciaMTE9 extends AcaciaMinionTileEntity {
		public AcaciaMTE9(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_9.get(), pos, state, MinionTier.IX);
		}
	}

	public static class AcaciaMTEa extends AcaciaMinionTileEntity {
		public AcaciaMTEa(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_a.get(), pos, state, MinionTier.X);
		}
	}

	public static class AcaciaMTEb extends AcaciaMinionTileEntity {
		public AcaciaMTEb(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.acacia_minion_b.get(), pos, state, MinionTier.XI);
		}
	}

	/**
	 * Primitive type array of int holding how frequently this will interact.
	 */
	@Nonnull
	private static final int[] speed = { 960, 960, 900, 900, 840, 840, 760, 760, 660, 660, 540 };

	/**
	 * {@link ImmutableSet} of {@link Block} holding the valid {@link Block} to
	 * break.
	 */
	@Nonnull
	protected static final ImmutableSet<Block> valid = ImmutableSet.copyOf(Arrays.asList(Blocks.ACACIA_LOG));

	protected AcaciaMinionTileEntity(BlockEntityType<? extends AbstractMinionTileEntity> type, BlockPos pos,
			BlockState state, MinionTier tier) {
		super(type, pos, state, tier);
	}

	@Override
	protected AbstractContainerMenu createMenu(int id, Inventory player) {
		switch (this.tier) {
		case I:
			return new AcaciaMC1(id, player, this);
		case II:
			return new AcaciaMC2(id, player, this);
		case III:
			return new AcaciaMC3(id, player, this);
		case IV:
			return new AcaciaMC4(id, player, this);
		case V:
			return new AcaciaMC5(id, player, this);
		case VI:
			return new AcaciaMC6(id, player, this);
		case VII:
			return new AcaciaMC7(id, player, this);
		case VIII:
			return new AcaciaMC8(id, player, this);
		case IX:
			return new AcaciaMC9(id, player, this);
		case X:
			return new AcaciaMCa(id, player, this);
		case XI:
			return new AcaciaMCb(id, player, this);
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
		return Blocks.ACACIA_SAPLING.defaultBlockState();
	}

	@Override
	protected Item[] getSuperCompactor() {
		return new Item[] { Items.DIAMOND, Items.DIAMOND_BLOCK, Items.ACACIA_LOG, ItemInit.enchanted_diamond.get() };
	}

	@Override
	protected ImmutableSet<Block> getValidBlocks() {
		return valid;
	}

	@Override
	public Component initDisplayName() {
		return new TranslatableComponent("minion.acacia", this.tier.name());
	}
}