package net.hypixel.skyblock.world.level.block.entity.minion;

import javax.annotation.Nonnull;

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
import net.hypixel.skyblock.world.items.init.ItemInit;
import net.hypixel.skyblock.world.level.block.entity.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class BlazeMinionTileEntity extends AbstractSummonerMTE {
	public static class BlazeMTE1 extends BlazeMinionTileEntity {
		public BlazeMTE1(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_1.get(), pos, state, MinionTier.I);
		}
	}

	public static class BlazeMTE2 extends BlazeMinionTileEntity {
		public BlazeMTE2(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_2.get(), pos, state, MinionTier.II);
		}
	}

	public static class BlazeMTE3 extends BlazeMinionTileEntity {
		public BlazeMTE3(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_3.get(), pos, state, MinionTier.III);
		}
	}

	public static class BlazeMTE4 extends BlazeMinionTileEntity {
		public BlazeMTE4(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_4.get(), pos, state, MinionTier.IV);
		}
	}

	public static class BlazeMTE5 extends BlazeMinionTileEntity {
		public BlazeMTE5(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_5.get(), pos, state, MinionTier.V);
		}
	}

	public static class BlazeMTE6 extends BlazeMinionTileEntity {
		public BlazeMTE6(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_6.get(), pos, state, MinionTier.VI);
		}
	}

	public static class BlazeMTE7 extends BlazeMinionTileEntity {
		public BlazeMTE7(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_7.get(), pos, state, MinionTier.VII);
		}
	}

	public static class BlazeMTE8 extends BlazeMinionTileEntity {
		public BlazeMTE8(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_8.get(), pos, state, MinionTier.VIII);
		}
	}

	public static class BlazeMTE9 extends BlazeMinionTileEntity {
		public BlazeMTE9(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_9.get(), pos, state, MinionTier.IX);
		}
	}

	public static class BlazeMTEa extends BlazeMinionTileEntity {
		public BlazeMTEa(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_a.get(), pos, state, MinionTier.X);
		}
	}

	public static class BlazeMTEb extends BlazeMinionTileEntity {
		public BlazeMTEb(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.blaze_minion_b.get(), pos, state, MinionTier.XI);
		}
	}
	
	/**
	 * Holds how frequently to interact
	 */
	@Nonnull
	protected static final int[] speed = { 660, 660, 620, 620, 570, 570, 500, 500, 420, 420, 330 };
	
	/**
	 * Holds {@link ItemStack} to {@link #add(int, ItemStack)}
	 */
	@Nonnull
	protected static final ItemStack drop = new ItemStack(Items.BLAZE_ROD);
	
	public BlazeMinionTileEntity(BlockEntityType<? extends AbstractSummonerMTE> type, BlockPos pos, BlockState state, MinionTier tier) {
		super(type, pos, state, tier, EntityType.BLAZE);
	}

	@Override
	protected AbstractContainerMenu createMenu(int id, Inventory inventory) {
		switch (this.tier) {
		case I:
			return new BlazeMC1(id, inventory, this);
		case II:
			return new BlazeMC2(id, inventory, this);
		case III:
			return new BlazeMC3(id, inventory, this);
		case IV:
			return new BlazeMC4(id, inventory, this);
		case V:
			return new BlazeMC5(id, inventory, this);
		case VI:
			return new BlazeMC6(id, inventory, this);
		case VII:
			return new BlazeMC7(id, inventory, this);
		case VIII:
			return new BlazeMC8(id, inventory, this);
		case IX:
			return new BlazeMC9(id, inventory, this);
		case X:
			return new BlazeMCa(id, inventory, this);
		case XI:
			return new BlazeMCb(id, inventory, this);
		default:
			throw new IllegalStateException("Illegal MinionTier:\t" + this.tier.name());
		}
	}

	@Override
	protected Item[] getSuperCompactor() {
		return new Item[] { Items.DIAMOND, Items.DIAMOND_BLOCK, ItemInit.enchanted_diamond.get(), Items.BLAZE_ROD, ItemInit.enchanted_blaze_powder.get() };
	}

	@Override
	protected Component initDisplayName() {
		return new TranslatableComponent("minion.blaze", this.tier.name());
	}

	@Override
	protected int getSpeed(MinionTier tier) {
		return speed[tier.asInt];
	}

	@Override
	protected void removeEntity() {
		this.summoned.poll().remove(RemovalReason.KILLED);
		this.addItemStacks(drop.copy());
	}
}