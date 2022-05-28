package net.hypixel.skyblock.world.items.init;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.level.block.init.BlockInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link BlockItem} for this Mod.
 *
 * @author MrPineapple070
 * @version 22 June 2020
 */
public class BlockItemInit {
	/**
	 * A {@code DeferredRegister} of {@code Item}
	 */
	public static final DeferredRegister<Item> blockItems = DeferredRegister.create(ForgeRegistries.ITEMS, SkyBlock.MOD_ID);

	public static final RegistryObject<BlockItem> day_saver		= blockItems.register("day_saver"	, () -> new BlockItem(BlockInit.day_saver.get()		, ItemProperties.mine_64));
	public static final RegistryObject<BlockItem> hard_glass	= blockItems.register("hard_glass"	, () -> new BlockItem(BlockInit.hard_glass.get()	, ItemProperties.mine_64));
	public static final RegistryObject<BlockItem> haste_block	= blockItems.register("haste_block"	, () -> new BlockItem(BlockInit.haste_block.get()	, ItemProperties.mine_64));

	public static final RegistryObject<BlockItem> night_saver	= blockItems.register("night_saver"		, () -> new BlockItem(BlockInit.night_saver.get()	, ItemProperties.mine_64));
	public static final RegistryObject<BlockItem> silence_block = blockItems.register("silence_block"	, () -> new BlockItem(BlockInit.silence_block.get()	, ItemProperties.mine_64));

	//public static final RegistryObject<BlockItem> large_mcb		= blockItems.register("large_mcb"	, () -> new BlockItem(BlockInit.large_mcb.get()	, ItemProperties.minion_64));
	//public static final RegistryObject<BlockItem> medium_mcb	= blockItems.register("medium_mcb"	, () -> new BlockItem(BlockInit.medium_mcb.get(), ItemProperties.minion_64));
	//public static final RegistryObject<BlockItem> small_mcb 	= blockItems.register("small_mcb"	, () -> new BlockItem(BlockInit.small_mcb.get()	, ItemProperties.minion_64));
}