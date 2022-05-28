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
 * @author MrPineapple070
 * @version 11 July 2019
 * @since 11 July 2019
 */
public class WheatMinion extends AbstractMinionBlock {
	public static final ImmutableList<Integer> speed = ImmutableList
			.copyOf(Arrays.asList(300, 300, 260, 260, 220, 220, 200, 200, 180, 180, 180));

	public WheatMinion(MinionTier tier) {
		super(Properties.of(Material.PLANT).sound(SoundType.CROP), tier);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		switch (this.tier) {
		case I:
			return ModBlockEntityTypes.wheat_minion_1.get().create(pos, state);
		case II:
			return ModBlockEntityTypes.wheat_minion_2.get().create(pos, state);
		case III:
			return ModBlockEntityTypes.wheat_minion_3.get().create(pos, state);
		case IV:
			return ModBlockEntityTypes.wheat_minion_4.get().create(pos, state);
		case V:
			return ModBlockEntityTypes.wheat_minion_5.get().create(pos, state);
		case VI:
			return ModBlockEntityTypes.wheat_minion_6.get().create(pos, state);
		case VII:
			return ModBlockEntityTypes.wheat_minion_7.get().create(pos, state);
		case VIII:
			return ModBlockEntityTypes.wheat_minion_8.get().create(pos, state);
		case IX:
			return ModBlockEntityTypes.wheat_minion_9.get().create(pos, state);
		case X:
			return ModBlockEntityTypes.wheat_minion_a.get().create(pos, state);
		case XI:
			return ModBlockEntityTypes.wheat_minion_b.get().create(pos, state);
		default:
			throw new IllegalStateException("Illegal MinionTier:\t" + this.tier.name());
		}
	}
}