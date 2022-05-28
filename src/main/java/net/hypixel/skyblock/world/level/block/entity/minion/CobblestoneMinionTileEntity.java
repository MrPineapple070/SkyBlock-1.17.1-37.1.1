package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.Arrays;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableSet;

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
 * {@link TileEntity} for the <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Cobblestone_Minion">Cobblestone
 * Minion</a>
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class CobblestoneMinionTileEntity extends AbstractMiningMTE {
	public static class CobbleMTE1 extends CobblestoneMinionTileEntity {
		public CobbleMTE1(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_1.get(), pos, state, MinionTier.I);
		}
	}

	public static class CobbleMTE2 extends CobblestoneMinionTileEntity {
		public CobbleMTE2(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_2.get(), pos, state, MinionTier.II);
		}
	}

	public static class CobbleMTE3 extends CobblestoneMinionTileEntity {
		public CobbleMTE3(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_3.get(), pos, state, MinionTier.III);
		}
	}

	public static class CobbleMTE4 extends CobblestoneMinionTileEntity {
		public CobbleMTE4(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_4.get(), pos, state, MinionTier.IV);
		}
	}

	public static class CobbleMTE5 extends CobblestoneMinionTileEntity {
		public CobbleMTE5(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_5.get(), pos, state, MinionTier.V);
		}
	}

	public static class CobbleMTE6 extends CobblestoneMinionTileEntity {
		public CobbleMTE6(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_6.get(), pos, state, MinionTier.VI);
		}
	}

	public static class CobbleMTE7 extends CobblestoneMinionTileEntity {
		public CobbleMTE7(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_7.get(), pos, state, MinionTier.VII);
		}
	}

	public static class CobbleMTE8 extends CobblestoneMinionTileEntity {
		public CobbleMTE8(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_8.get(), pos, state, MinionTier.VIII);
		}
	}

	public static class CobbleMTE9 extends CobblestoneMinionTileEntity {
		public CobbleMTE9(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_9.get(), pos, state, MinionTier.IX);
		}
	}

	public static class CobbleMTEa extends CobblestoneMinionTileEntity {
		public CobbleMTEa(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_a.get(), pos, state, MinionTier.X);
		}
	}

	public static class CobbleMTEb extends CobblestoneMinionTileEntity {
		public CobbleMTEb(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.cobble_minion_b.get(), pos, state, MinionTier.XI);
		}
	}
	
	/**
	 * Holds {@link Item} to super compact when {@link #superCompactor()}
	 */
	@Nonnull
	private static final Item[] sup = new Item[] { Items.COBBLESTONE, Items.DIAMOND, Items.DIAMOND_BLOCK, ItemInit.enchanted_diamond.get() };
	
	/**
	 * Holds how frequently to interact.
	 */
	@Nonnull
	private static final int[] speed = { 280, 280, 240, 240, 200, 200, 180, 180, 160, 160, 140 };
	
	/**
	 * {@link ImmutableSet} of {@link Block} holding valid {@link Block} to interact.
	 */
	@Nonnull
	protected static final ImmutableSet<Block> valid = ImmutableSet.copyOf(Arrays.asList(Blocks.COBBLESTONE));

	public CobblestoneMinionTileEntity(BlockEntityType<? extends AbstractMinionTileEntity> type, BlockPos pos, BlockState state, MinionTier tier) {
		super(type, pos, state, tier);
	}

	@Override
	protected final AbstractContainerMenu createMenu(int id, Inventory inventory) {
		switch (this.tier) {
		case I:
			return new CobbleMC1(id, inventory, this);
		case II:
			return new CobbleMC2(id, inventory, this);
		case III:
			return new CobbleMC3(id, inventory, this);
		case IV:
			return new CobbleMC4(id, inventory, this);
		case V:
			return new CobbleMC5(id, inventory, this);
		case VI:
			return new CobbleMC6(id, inventory, this);
		case VII:
			return new CobbleMC7(id, inventory, this);
		case VIII:
			return new CobbleMC8(id, inventory, this);
		case IX:
			return new CobbleMC9(id, inventory, this);
		case X:
			return new CobbleMCa(id, inventory, this);
		case XI:
			return new CobbleMCb(id, inventory, this);
		default:
			throw new IllegalStateException("Illegal MinionTier:\t" + this.tier.name());
		}
	}

	@Override
	protected final Item[] getCompactor() {
		return COMP;
	}

	@Override
	protected final Component initDisplayName() {
		return new TranslatableComponent("minion.cobblestone", this.tier.name());
	}

	@Override
	protected final BlockState getState() {
		return Blocks.COBBLESTONE.defaultBlockState();
	}

	@Override
	protected final Item[] getSuperCompactor() {
		return sup;
	}

	@Override
	protected final int getSpeed(MinionTier tier) {
		return speed[tier.asInt];
	}
	
	@Override
	public final ImmutableSet<Block> getValidBlocks() {
		return valid;
	}
}