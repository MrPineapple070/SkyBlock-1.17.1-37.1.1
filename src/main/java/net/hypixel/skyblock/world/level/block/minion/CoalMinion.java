package net.hypixel.skyblock.world.level.block.minion;

import java.util.Arrays;

import com.google.common.collect.ImmutableList;

import net.hypixel.skyblock.world.level.block.entity.ModBlockEntityTypes;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity.MinionTier;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

/**
 * The base for all Coal Minion
 *
 * @author MrPineapple070
 * @version 23 July 2020
 */
public class CoalMinion extends AbstractMinionBlock {
	/**
	 * An {@code Array} of {@code int} that determine the number of ticks between
	 * actions.
	 */
	public static final ImmutableList<Integer> speed = ImmutableList
			.copyOf(Arrays.asList(300, 300, 260, 260, 240, 240, 200, 200, 180, 180, 140));

	public CoalMinion(MinionTier tier) {
		super(Properties.of(Material.STONE).sound(SoundType.STONE), tier);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		switch (this.tier) {
		case I:
			return ModBlockEntityTypes.coal_minion_1.get().create(pos, state);
		case II:
			return ModBlockEntityTypes.coal_minion_2.get().create(pos, state);
		case III:
			return ModBlockEntityTypes.coal_minion_3.get().create(pos, state);
		case IV:
			return ModBlockEntityTypes.coal_minion_4.get().create(pos, state);
		case V:
			return ModBlockEntityTypes.coal_minion_5.get().create(pos, state);
		case VI:
			return ModBlockEntityTypes.coal_minion_6.get().create(pos, state);
		case VII:
			return ModBlockEntityTypes.coal_minion_7.get().create(pos, state);
		case VIII:
			return ModBlockEntityTypes.coal_minion_8.get().create(pos, state);
		case IX:
			return ModBlockEntityTypes.coal_minion_9.get().create(pos, state);
		case X:
			return ModBlockEntityTypes.coal_minion_a.get().create(pos, state);
		case XI:
			return ModBlockEntityTypes.coal_minion_b.get().create(pos, state);
		default:
			throw new IllegalStateException("Illegal MinionTier:\t" + this.tier.name());
		}
	}
}