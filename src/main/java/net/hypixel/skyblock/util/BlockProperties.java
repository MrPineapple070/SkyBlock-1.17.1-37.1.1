package net.hypixel.skyblock.util;

import java.util.function.ToIntFunction;

import javax.annotation.concurrent.Immutable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

@Immutable
public final class BlockProperties {
	/**
	 * Always return true
	 * 
	 * @param state {@link BlockState}
	 * @param world {@link IBlockReader}
	 * @param pos   {@link BlockPos}
	 * @return true
	 */
	public static boolean always(BlockState state, Level world, BlockPos pos) {
		return true;
	}

	/**
	 * Always return true
	 * 
	 * @param state {@link BlockState}
	 * @param world {@link IBlockReader}
	 * @param pos   {@link BlockPos}
	 * @param type  {@link EntityType}
	 * @return true
	 */
	public static boolean always(BlockState state, Level world, BlockPos pos, EntityType<?> type) {
		return true;
	}

	/**
	 * Gets a {@link BedBlock} from {@link DyeColor}
	 * 
	 * @param color {@link DyeColor} of bed
	 * @return {@link BedBlock}
	 */
	public static BedBlock bed(DyeColor color) {
		return new BedBlock(color, Properties.of(Material.WOOL, (part) -> {
			return part.getValue(BedBlock.PART) == BedPart.FOOT ? color.getMaterialColor() : MaterialColor.WOOL;
		}).sound(SoundType.WOOD).strength(.2f).noOcclusion());
	}

	/**
	 * Makes {@link LeavesBlock}
	 * 
	 * @return {@link LeavesBlock}
	 */
	public static LeavesBlock leaves() {
		return new LeavesBlock(Properties.of(Material.LEAVES).strength(.2f).randomTicks().sound(SoundType.GRASS)
				.noOcclusion().isSuffocating(BlockProperties::never)
				.isViewBlocking(BlockProperties::never));
	}
	
	/**
	 * Returns the amount of light to emit.
	 * 
	 * @param light amount of light to emit
	 * @return {@link ToIntFunction} of {@link BlockState} light emission
	 */
	public static ToIntFunction<BlockState> litBlockEmission(int light) {
		return (state) -> {
			return state.getValue(BlockStateProperties.LIT) ? light : 0;
		};
	}
	
	/**
	 * Creates a Log
	 * 
	 * @param color0 {@link MaterialColor}
	 * @param color1 {@link MaterialColor}
	 * @return {@link RotatedPillarBlock}
	 */
	public static RotatedPillarBlock log(MaterialColor color0, MaterialColor color1) {
		return new RotatedPillarBlock(Properties.of(Material.WOOD, (state) -> {
			return state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? color0 : color1;
		}).strength(2f).sound(SoundType.WOOD));
	}
	
	/**
	 * Always return false
	 * 
	 * @param state {@link BlockState}
	 * @param world {@link IBlockReader}
	 * @param pos	{@link BlockPos}
	 * @return false
	 */
	public static boolean never(BlockState state, BlockGetter world, BlockPos pos) {
		return false;
	}
	
	/**
	 * Always return false
	 * 
	 * @param state {@link BlockState}
	 * @param world {@link IBlockReader}
	 * @param pos	{@link BlockPos}
	 * @param type	{@link EntityType}
	 * @return	false
	 */
	public static boolean never(BlockState state, BlockGetter world, BlockPos pos, EntityType<?> type) {
		return false;
	}
	
	/**
	 * Rebuild Cache
	 */
	@SuppressWarnings("deprecation")
	public static void rebuildCache() {
		Block.BLOCK_STATE_REGISTRY.forEach(BlockState::initCache);
	}
}