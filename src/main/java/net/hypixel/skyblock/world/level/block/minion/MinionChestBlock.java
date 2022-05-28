package net.hypixel.skyblock.world.level.block.minion;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.hypixel.skyblock.world.inventory.minion.MinionChestContainer.LargeMCC;
import net.hypixel.skyblock.world.inventory.minion.MinionChestContainer.MediumMCC;
import net.hypixel.skyblock.world.inventory.minion.MinionChestContainer.SmallMCC;
import net.hypixel.skyblock.world.level.block.entity.ModBlockEntityTypes;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionChestBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractChestBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Serve as base for additional {@link AbstractMinionBlock} storage.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Minion_Chests">Click
 * here</a> for a description.
 *
 * @author MrPineapple2020
 * @version 2 June 2020
 * @since 11 June 2019
 */
public class MinionChestBlock extends AbstractChestBlock<AbstractMinionChestBlockEntity> {
	public static enum MinionChestType {
		/**
		 * Gives 15 extra slots.
		 */
		Large(15),
		/**
		 * Gives 9 extra slots.
		 */
		Medium(9),
		/**
		 * Gives 3 extra slots.
		 */
		Small(3),
		/**
		 * Gives 21 extra slots.
		 */
		XLarge(21),
		/**
		 * Gives 27 extra slots.
		 */
		XXLarge(27);

		/**
		 * The number of additional slots this will give
		 */
		public final int additional;

		private MinionChestType(int additional) {
			this.additional = additional;
		}
	}

	public static class SmallMCB extends MinionChestBlock {
		public SmallMCB() {
			super(MinionChestType.Small);
		}
	}

	public static class MediumMCB extends MinionChestBlock {
		public MediumMCB() {
			super(MinionChestType.Medium);
		}
	}

	public static class LargeMCB extends MinionChestBlock {
		public LargeMCB() {
			super(MinionChestType.Large);
		}
	}
	
	public static final Component container_name_l = new TranslatableComponent("container.large_minion_chest");
	public static final Component container_name_m = new TranslatableComponent("container.medium_minion_chest");
	public static final Component container_name_s = new TranslatableComponent("container.small_minion_chest");
	public static final Component container_name_xl = new TranslatableComponent("container.x_large_minion_chest");
	public static final Component container_name_xxl = new TranslatableComponent("container.xx_large_minion_chest");

	/**
	 * {@link DirectionProperty}
	 */
	@Nonnull
	protected static final DirectionProperty facing = BlockStateProperties.HORIZONTAL_FACING;

	/**
	 * {@link VoxelShape}
	 */
	@Nonnull
	protected static final VoxelShape shape = Block.box(1d, 0d, 1d, 15d, 14d, 15d);

	/**
	 * The {@link MinionChestType} of {@code this}
	 */
	@Nonnull
	public final MinionChestType type;

	protected MinionChestBlock(MinionChestType type) {
		super(Properties.of(Material.WOOD).strength(0f, 0f).sound(SoundType.WOOD), () -> {
			switch (type) {
			case Small:
				return ModBlockEntityTypes.small_mcte.get();
			case Medium:
				return ModBlockEntityTypes.medium_mcte.get();
			case Large:
				return ModBlockEntityTypes.large_mcte.get();
			default:
				throw new IllegalStateException("Illegal ChestType " + type.name());
			}
		});
		this.type = Objects.requireNonNull(type, "ChestType cannot be null.");
		this.registerDefaultState(this.stateDefinition.any().setValue(facing, Direction.NORTH));
	}

	@Override
	public DoubleBlockCombiner.NeighborCombineResult<? extends ChestBlockEntity> combine(BlockState p_53149_, Level p_53150_, BlockPos p_53151_, boolean p_53152_) {
		return DoubleBlockCombiner.Combiner::acceptNone;
	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return shape;
	}
	
	@Override
	public RenderShape getRenderShape(BlockState p_53169_) {
		return RenderShape.ENTITYBLOCK_ANIMATED;
	}
	
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext p_53128_) {
		return this.defaultBlockState().setValue(facing, p_53128_.getHorizontalDirection().getOpposite());
	}

	/**
	 * @return {@link MinionChestType#additional}
	 */
	public int getSize() {
		return this.type.additional;
	}
	
	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		switch (this.type) {
		case Small:
			return ModBlockEntityTypes.small_mcte.get().create(pos, state);
		case Medium:
			return ModBlockEntityTypes.medium_mcte.get().create(pos, state);
		case Large:
			return ModBlockEntityTypes.large_mcte.get().create(pos, state);
		case XLarge:
		case XXLarge:
		default:
			throw new IllegalStateException("Illegal MinionChestType:\t" + this.type.name());
		}
	}

	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level world, BlockState state, BlockEntityType<T> type) {
		BlockEntityType<? extends AbstractMinionChestBlockEntity> bet;
		switch (this.type) {
		case Small:
			bet = ModBlockEntityTypes.small_mcte.get();
			break;
		case Medium:
			bet = ModBlockEntityTypes.medium_mcte.get();
			break;
		case Large:
			bet = ModBlockEntityTypes.large_mcte.get();
			break;
		case XLarge:
		case XXLarge:
		default:
			throw new IllegalStateException("Illegal MinionChestType:\t" + this.type.name());
		}

		return world.isClientSide ? createTickerHelper(type, bet, AbstractMinionChestBlockEntity::lidAnimateTick) : null;
	}
	
	@Override
	public BlockState rotate(BlockState p_53157_, Rotation p_53158_) {
		return p_53157_.setValue(facing, p_53158_.rotate(p_53157_.getValue(facing)));
	}

	@SuppressWarnings("deprecation")
	@Override
	public BlockState mirror(BlockState p_53154_, Mirror p_53155_) {
		return p_53154_.rotate(p_53155_.getRotation(p_53154_.getValue(facing)));
	}
	
	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(facing);
	}
	
	@Override
	public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type) {
		return false;
	}
	
	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
		if (level.isClientSide)
			return InteractionResult.PASS;
		MenuProvider container;
		switch (this.type) {
		case Small:
			container = new MenuProvider() {
				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new SmallMCC(id, inventory);
				}
				
				@Override
				public Component getDisplayName() {
					return container_name_s;
				}
			};
			break;
		case Medium:
			container = new MenuProvider() {
				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new MediumMCC(id, inventory);
				}
				
				@Override
				public Component getDisplayName() {
					return container_name_m;
				}
			};
			break;
		case Large:
			container = new MenuProvider() {
				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new LargeMCC(id, inventory);
				}
				
				@Override
				public Component getDisplayName() {
					return container_name_l;
				}
			};
			break;
		case XLarge:
		case XXLarge:
		default:
			throw new IllegalStateException("Illegal MinionChestType:\t" + this.type.name());
		}
		
		BlockEntity entity = level.getBlockEntity(pos);
		if (entity instanceof AbstractMinionChestBlockEntity) {
			BlockPos above = pos.above();
			if (level.getBlockState(above).isRedstoneConductor(level, above))
				return InteractionResult.sidedSuccess(level.isClientSide);
			player.openMenu(container);
			return InteractionResult.CONSUME;
		}
		return InteractionResult.PASS;
	}
}