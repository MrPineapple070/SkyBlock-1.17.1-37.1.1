package net.hypixel.skyblock.world.level.block.minion;

import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity.MinionTier;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class TempMinion extends AbstractMinionBlock {
	public TempMinion(MinionTier tier) {
		super(Properties.copy(Blocks.STONE), tier);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return null;
	}
}