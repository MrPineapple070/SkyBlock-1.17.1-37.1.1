package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.Arrays;

import com.google.common.collect.ImmutableSet;

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
 * The {@link AbstractMinionTileEntity} for the
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Wheat_Minion">Wheat
 * Minion</a>.
 *
 * @author MrPineapple070
 * @version 11 July 2019
 * @since 11 July 2019
 */
public class WheatMinionTileEntity extends AbstractFarmingPlacerMTE {
	protected static final ImmutableSet<Block> valid = ImmutableSet.copyOf(Arrays.asList(Blocks.WHEAT));

	protected static final int[] speed = { 15, 15, 13, 13, 11, 11, 10, 10, 9, 9, 8 };

	public static class WheatMTE1 extends WheatMinionTileEntity {
		public WheatMTE1(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_1.get(), pos, state, MinionTier.I);
		}
	}

	public static class WheatMTE2 extends WheatMinionTileEntity {
		public WheatMTE2(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_2.get(), pos, state, MinionTier.I);
		}
	}

	public static class WheatMTE3 extends WheatMinionTileEntity {
		public WheatMTE3(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_3.get(), pos, state, MinionTier.I);
		}
	}

	public static class WheatMTE4 extends WheatMinionTileEntity {
		public WheatMTE4(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_4.get(), pos, state, MinionTier.I);
		}
	}

	public static class WheatMTE5 extends WheatMinionTileEntity {
		public WheatMTE5(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_5.get(), pos, state, MinionTier.I);
		}
	}

	public static class WheatMTE6 extends WheatMinionTileEntity {
		public WheatMTE6(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_6.get(), pos, state, MinionTier.I);
		}
	}

	public static class WheatMTE7 extends WheatMinionTileEntity {
		public WheatMTE7(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_7.get(), pos, state, MinionTier.I);
		}
	}

	public static class WheatMTE8 extends WheatMinionTileEntity {
		public WheatMTE8(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_8.get(), pos, state, MinionTier.I);
		}
	}

	public static class WheatMTE9 extends WheatMinionTileEntity {
		public WheatMTE9(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_9.get(), pos, state, MinionTier.I);
		}
	}

	public static class WheatMTEa extends WheatMinionTileEntity {
		public WheatMTEa(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_a.get(), pos, state, MinionTier.I);
		}
	}

	public static class WheatMTEb extends WheatMinionTileEntity {
		public WheatMTEb(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.wheat_minion_b.get(), pos, state, MinionTier.I);
		}
	}

	public WheatMinionTileEntity(BlockEntityType<? extends AbstractMinionTileEntity> type, BlockPos pos, BlockState state, MinionTier tier) {
		super(type, pos, state, tier, PlacingMethods.Normal);
	}

	@Override
	protected AbstractContainerMenu createMenu(int id, Inventory player) {
		switch (this.tier) {
		case I:
			return new WheatMC1(id, player, this);
		case II:
			return new WheatMC2(id, player, this);
		case III:
			return new WheatMC3(id, player, this);
		case IV:
			return new WheatMC4(id, player, this);
		case V:
			return new WheatMC5(id, player, this);
		case VI:
			return new WheatMC6(id, player, this);
		case VII:
			return new WheatMC7(id, player, this);
		case VIII:
			return new WheatMC8(id, player, this);
		case IX:
			return new WheatMC9(id, player, this);
		case X:
			return new WheatMCa(id, player, this);
		case XI:
			return new WheatMCb(id, player, this);
		default:
			throw new IllegalStateException("Illegal MinionTier:\t" + this.tier.name());
		}
	}

	@Override
	protected Item[] getCompactor() {
		return new Item[] { Items.WHEAT, Items.DIAMOND };
	}

	@Override
	protected int getSpeed(MinionTier tier) {
		return speed[tier.asInt];
	}

	@Override
	protected BlockState getState() {
		return Blocks.WHEAT.defaultBlockState();
	}

	@Override
	protected Item[] getSuperCompactor() {
		return new Item[] { Items.WHEAT, Items.HAY_BLOCK, Items.WHEAT_SEEDS, Items.DIAMOND, Items.DIAMOND_BLOCK,
				ItemInit.enchanted_diamond.get() };
	}

	@Override
	protected ImmutableSet<Block> getValidBlocks() {
		return valid;
	}

	@Override
	protected Component initDisplayName() {
		return new TranslatableComponent("minion.wheat", this.tier.name());
	}
}