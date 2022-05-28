package net.hypixel.skyblock.world.level.block.minion;

import net.hypixel.skyblock.world.level.block.entity.ModBlockEntityTypes;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity.MinionTier;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public final class BlazeMinion extends AbstractMinionBlock {
	public BlazeMinion(MinionTier tier) {
		super(Properties.of(Material.WOOD).sound(SoundType.WOOD), tier);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		switch (this.tier) {
		case I:
			return ModBlockEntityTypes.blaze_minion_1.get().create(pos, state);
		case II:
			return ModBlockEntityTypes.blaze_minion_2.get().create(pos, state);
		case III:
			return ModBlockEntityTypes.blaze_minion_3.get().create(pos, state);
		case IV:
			return ModBlockEntityTypes.blaze_minion_4.get().create(pos, state);
		case IX:
			return ModBlockEntityTypes.blaze_minion_5.get().create(pos, state);
		case V:
			return ModBlockEntityTypes.blaze_minion_6.get().create(pos, state);
		case VI:
			return ModBlockEntityTypes.blaze_minion_7.get().create(pos, state);
		case VII:
			return ModBlockEntityTypes.blaze_minion_8.get().create(pos, state);
		case VIII:
			return ModBlockEntityTypes.blaze_minion_9.get().create(pos, state);
		case X:
			return ModBlockEntityTypes.blaze_minion_a.get().create(pos, state);
		case XI:
			return ModBlockEntityTypes.blaze_minion_b.get().create(pos, state);
		default:
			throw new IllegalStateException("Illegal MinionTier:\t" + this.tier.name());
		}
	}
}