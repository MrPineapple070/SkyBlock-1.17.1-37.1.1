package net.hypixel.skyblock.world.level.block.minion;

import java.util.Objects;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.util.BlockProperties;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity.MinionTier;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;

/**
 * This class serves as the base for all Minions.
 *
 * @author MrPineapple070
 * @version 28 May 2020
 */
public abstract class AbstractMinionBlock extends BaseEntityBlock {
	/**
	 * A {@link DirectionProperty} for this
	 */
	@Nonnull
	public static final DirectionProperty facing = BlockStateProperties.HORIZONTAL_FACING;

	/**
	 * The {@link MinionTier} for this
	 */
	@Nonnull
	protected final MinionTier tier;
	
	protected AbstractMinionBlock(Properties properties, MinionTier tier) {
		super(properties.strength(0f, 0x800f).noOcclusion().isValidSpawn(BlockProperties::never)
				.isRedstoneConductor(BlockProperties::never).isSuffocating(BlockProperties::never)
				.isViewBlocking(BlockProperties::never));
		this.tier = Objects.requireNonNull(tier, "Minion Block must have a Tier");
		this.registerDefaultState(this.stateDefinition.any().setValue(facing, Direction.NORTH));
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(facing);
	}
	
	@Override
	public void destroy(LevelAccessor world, BlockPos pos, BlockState state) {
		if (world.isClientSide())
			return;
		dropResources(state, world, pos, world.getBlockEntity(pos));
	}
	
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext ctx) {
		return this.defaultBlockState().setValue(facing, ctx.getHorizontalDirection().getOpposite());
	}
	
	@Override
	public abstract BlockEntity newBlockEntity(BlockPos pos, BlockState state);

	@Override
	@Deprecated
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(facing)));
	}

	@Override
	@Deprecated
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(facing, rot.rotate(state.getValue(facing)));
	}
	
	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
			InteractionHand hand, BlockHitResult result) {
		if (level.isClientSide)
			return InteractionResult.PASS;
		if (player.isSpectator())
			return InteractionResult.PASS;
		final BlockEntity entity = level.getBlockEntity(pos);
		if (entity instanceof AbstractMinionTileEntity) {
			player.openMenu((AbstractMinionTileEntity) entity);
			return InteractionResult.SUCCESS;
		}
		return InteractionResult.PASS;
	}
}