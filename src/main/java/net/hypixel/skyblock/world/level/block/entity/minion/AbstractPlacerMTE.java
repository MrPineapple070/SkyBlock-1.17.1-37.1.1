package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.Objects;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableSet;

import net.hypixel.skyblock.world.items.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

/**
 * Place and Break {@link Block}.
 * 
 * @author MrPineapple070
 * @version 17 January 2021
 * @since 11 July 2019
 */
public abstract class AbstractPlacerMTE extends AbstractMinionTileEntity {
	/**
	 * Differentials from the center {@link BlockPos} when {@link #countItem(Item)}
	 * using {@link ItemInit#minion_expander} is 0
	 */
	@Nonnull
	protected static final int[] default_size = { -2, -1, 0, 1, 2 };

	/**
	 * Differentials from the center {@link BlockPos} when {@link #countItem(Item)}
	 * using {@link ItemInit#minion_expander} is 2
	 */
	@Nonnull
	protected static final int[] expanded_2_size = { -4, -3, -2, -1, 0, 1, 2, 3, 4 };

	/**
	 * Differentials from the center {@link BlockPos} when {@link #countItem(Item)}
	 * using {@link ItemInit#minion_expander} is 1
	 */
	@Nonnull
	protected static final int[] expanded_size = { -3, -2, -1, 0, 1, 2, 3 };

	public AbstractPlacerMTE(BlockEntityType<? extends AbstractMinionTileEntity> typeIn, BlockPos pos, BlockState state, MinionTier tier) {
		super(typeIn, pos, state, tier);
	}

	/**
	 * Determines {@link SoundEvent} when {@link #interact(BlockPos)} results in
	 * placing {@link Block}
	 * 
	 * @return {@link SoundEvent} to play when placing a {@link Block}.
	 */
	protected abstract SoundEvent getSoundEventPlacing();

	/**
	 * Determines {@link SoundEvent} when {@link #interact(BlockPos)} results in
	 * breaking {@link Block}
	 * 
	 * @return {@link SoundEvent} to play when breaking a {@link Block}
	 */
	protected abstract SoundEvent getSoundEventBreaking();

	/**
	 * Determines {@link BlockState} when {@link #interact(BlockPos)} results in
	 * placing {@link Block}
	 * 
	 * @return {@link BlockState} to place when interacting.
	 */
	protected abstract BlockState getState();

	/**
	 * Determines all {@link Block} that this can place.
	 * 
	 * @return an {@link ImmutableSet} of {@link Block}.
	 */
	protected abstract ImmutableSet<Block> getValidBlocks();

	@Override
	protected boolean interact(BlockPos pos) {
		if (pos == null)
			return false;
		LOGGER.info("Interacting with " + pos.toString());
		final BlockState state = this.level.getBlockState(pos);
		if (state.getMaterial() == Material.AIR) {
			this.level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), this.getSoundEventPlacing(),
					SoundSource.BLOCKS, 1f, 1f, true);
			this.level.setBlockAndUpdate(pos, this.getState());
		} else {
			this.addItemStacks(Block.getDrops(state, (ServerLevel) this.level, pos, this));
			this.level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), this.getSoundEventBreaking(),
					SoundSource.BLOCKS, 1f, 1f, true);
			this.level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
		}
		return true;
	}

	/**
	 * Determine if {@link Block} can be added to {@link #validSurround}.<br>
	 * Help {@link #setValidSurround()} in adding.<br>
	 * {@code AbstractMinionTileEntity} can interact with {@code Block} in 3
	 * dimensions
	 *
	 * @param block The {@code Block} to check.
	 * @return {@code true} if {@code Block} is valid.<br>
	 *         {@code false} otherwise.
	 */
	protected final boolean isBlockValid(Block block) {
		ImmutableSet<Block> blocks = this.getValidBlocks();
		Objects.requireNonNull(block, "Inputed block cannot be null");
		if (blocks.size() < 1)
			throw new IllegalArgumentException("validBlocks must have at least one element");
		return blocks.contains(block);
	}

	/**
	 * Picks a random {@link BlockPos} to interact with using {@link #rand}.
	 * 
	 * @return a random {@link BlockPos}
	 */
	protected BlockPos pickBlockPos() {
		LOGGER.info("Picking a BlockPos");
		this.setValidSurround();
		this.setAirSurround();
		if (!this.airSurround.isEmpty())
			return this.airSurround.get(rand.nextInt(this.airSurround.size()));
		if (!this.validSurround.isEmpty())
			return this.validSurround.get(rand.nextInt(this.validSurround.size()));
		return null;
	}

	@Override
	public final void tick() {
		if (this.level.isClientSide)
			return;
		if (!this.isTicking)
			this.init();
		if (this.isCompletlyFull())
			return;
		this.tick = ++this.tick % (int) (this.getSpeed(this.tier) * this.getFuelSpeed());
		if (this.tick == 0)
			this.interact(this.pickBlockPos());
	}
}