package net.hypixel.skyblock.world.level.block;

import java.util.Objects;

import net.hypixel.skyblock.world.level.block.entity.ModBlockEntityTypes;
import net.hypixel.skyblock.world.level.block.entity.TimeSaverTileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * When this block exists in the world, the world will remain at the indicated
 * time.<br>
 * If both of these blocks exist in the world, both blocks have no effect.
 *
 * @author MrPineapple070
 * @version 07 October 2020
 * @since 07 October 2020
 */
public class TimeSaver extends Block implements EntityBlock {
	public static enum TimeSaverType {
		Day, Night;
	}

	/**
	 * A {@link VoxelShape}
	 */
	protected static final VoxelShape shape = Block.box(0d, 0d, 0d, 16d, 6d, 16d);

	public final TimeSaverType type;

	public TimeSaver(TimeSaverType type) {
		super(Properties.of(Material.WOOD).strength(.2f, .2f).sound(SoundType.WOOD));
		this.type = Objects.requireNonNull(type, "TimeSaverType cannot be null");
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext collision) {
		return shape;
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.MODEL;
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
			BlockHitResult result) {
		if (level.isClientSide)
			return InteractionResult.PASS;
		final BlockEntity entity = level.getBlockEntity(pos);
		if (entity instanceof TimeSaverTileEntity)
			player.openMenu((TimeSaverTileEntity) entity);
		return InteractionResult.CONSUME;
	}

	@Override
	public boolean useShapeForLightOcclusion(BlockState p_220074_1_) {
		return true;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		switch (this.type) {
		case Day:
			return ModBlockEntityTypes.day_saver.get().create(pos, state);
		case Night:
			return ModBlockEntityTypes.night_saver.get().create(pos, state);
		default:
			throw new IllegalStateException("Illegal TimeSaverType:\t" + this.type.name());
		}
	}
	
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state,
			BlockEntityType<T> type) {
		return type == ModBlockEntityTypes.day_saver.get() || type == ModBlockEntityTypes.night_saver.get() ? TimeSaverTileEntity::tick : null;
	}
}