package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.Arrays;

import net.hypixel.skyblock.world.items.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public abstract class AbstractMiningMTE extends AbstractPlacerMTE {
	public AbstractMiningMTE(BlockEntityType<? extends AbstractMinionTileEntity> typeIn, BlockPos pos, BlockState state, MinionTier tier) {
		super(typeIn, pos, state, tier);
	}

	@Override
	protected final SoundEvent getSoundEventBreaking() {
		return SoundEvents.STONE_BREAK;
	}

	@Override
	protected final SoundEvent getSoundEventPlacing() {
		return SoundEvents.STONE_PLACE;
	}

	@Override
	protected final BlockPos[][][] initSurround() {
		return new BlockPos[1][9][9];
	}

	@Override
	protected final void setSurround() {
		LOGGER.info("Gathering Surrounding BlockPos.");
		final int[] dx = expanded_2_size.clone();
		for (int x = 0; x < this.surround[0].length; x++)
			for (int y = 0; y < this.surround[0][x].length; y++)
				this.surround[0][x][y] = dx[x] == 0 && dx[y] == 0 ? null : this.worldPosition.offset(dx[y], -1, dx[x]);
		for (BlockPos[] row : this.surround[0])
			LOGGER.info(Arrays.deepToString(row));
	}

	@Override
	protected final void setValidSurround() {
		LOGGER.info("Gathering valid BlockPos");
		this.validSurround.clear();
		int xStart, xEnd, zStart, zEnd;
		switch (this.countItem(ItemInit.minion_expander.get())) {
		case 1:
			xStart = 1;
			xEnd = 8;
			zStart = 1;
			zEnd = 8;
		case 2:
			xStart = 0;
			xEnd = 9;
			zStart = 0;
			zEnd = 9;
		default:
			xStart = 2;
			xEnd = 7;
			zStart = 2;
			zEnd = 7;
		}
		for (int x = xStart; x < xEnd; ++x)
			for (int z = zStart; z < zEnd; ++z) {
				final BlockPos pos = this.surround[0][x][z];
				if (pos == null)
					continue;
				final BlockState state = this.level.getBlockState(pos);
				if (state.getMaterial() == Material.AIR)
					this.validSurround.add(pos);
				else if (this.isBlockValid(state.getBlock()))
					this.validSurround.add(pos);
				else
					continue;
			}
		LOGGER.info(this.validSurround.toString());
	}
}