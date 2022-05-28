package net.hypixel.skyblock.world.level.block.init;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.level.block.HardGlass;
import net.hypixel.skyblock.world.level.block.TimeSaver;
import net.hypixel.skyblock.world.level.block.TimeSaver.TimeSaverType;
import net.hypixel.skyblock.world.level.block.minion.MinionChestBlock.LargeMCB;
import net.hypixel.skyblock.world.level.block.minion.MinionChestBlock.MediumMCB;
import net.hypixel.skyblock.world.level.block.minion.MinionChestBlock.SmallMCB;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link Block} for this Mod. <br>
 * Some {@code Blocks} are Initialized and Registered in other classes.
 *
 * @author MrPineapple070
 * @version 31 May 2020
 */
public class BlockInit {
	/**
	 * A {@code DeferredRegister} for {@code Block}.
	 */
	public static final DeferredRegister<Block> blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, SkyBlock.MOD_ID);
	
	public static final RegistryObject<Block> hard_glass	= blocks.register("hard_glass"		, HardGlass::new);
	public static final RegistryObject<Block> haste_block	= blocks.register("haste_block"		, () -> new Block(Properties.copy(Blocks.END_STONE)));
	public static final RegistryObject<Block> silence_block = blocks.register("silence_block"	, () -> new Block(Properties.copy(Blocks.JUKEBOX)));
	public static final RegistryObject<Block> night_saver	= blocks.register("night_saver"		, () -> new TimeSaver(TimeSaverType.Night));
	public static final RegistryObject<Block> day_saver		= blocks.register("day_saver"		, () -> new TimeSaver(TimeSaverType.Day));
	
	public static final RegistryObject<Block> small_mcb = blocks.register("small_mcb", () -> new SmallMCB());
	public static final RegistryObject<Block> medium_mcb = blocks.register("medium_mcb", () -> new MediumMCB());
	public static final RegistryObject<Block> large_mcb = blocks.register("large_mcb", () -> new LargeMCB());
}