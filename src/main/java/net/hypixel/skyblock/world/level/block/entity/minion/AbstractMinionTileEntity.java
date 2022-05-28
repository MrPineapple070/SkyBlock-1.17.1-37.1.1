package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.tags.ModItemTags;
import net.hypixel.skyblock.util.ItemMap;
import net.hypixel.skyblock.util.ItemStackHelper;
import net.hypixel.skyblock.world.items.init.ItemInit;
import net.hypixel.skyblock.world.items.minion.MinionFuelItem;
import net.minecraft.CrashReport;
import net.minecraft.CrashReportCategory;
import net.minecraft.ReportedException;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Container;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.InvWrapper;

/**
 * A {@link TileEntity} for all Minions.<br>
 * <a href=https://hypixel-skyblock.fandom.com/wiki/Minions>Click here</a> for a
 * description of Minions.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public abstract class AbstractMinionTileEntity extends BaseContainerBlockEntity
		implements Container, MenuProvider {
	/**
	 * The tier of each Minion
	 */
	public static enum MinionTier {
		I(1, 0), II(3, 1), III(3, 2), IV(6, 3), IX(12, 8), V(6, 4), VI(9, 5), VII(9, 6), VIII(12, 7), X(15, 9),
		XI(15, 10), XII(15, 11);

		/**
		 * A conversion between this and an integer.
		 */
		@Nonnegative
		public final int asInt;

		/**
		 * The amount of slots for each tier.
		 */
		@Nonnegative
		public final int size;

		private MinionTier(@Nonnegative int size, @Nonnegative int asInt) {
			this.size = size;
			this.asInt = asInt;
		}
	}

	/**
	 * Holds a primitive type array of {@link Items} that holds the minimum
	 * requirement for {@link #compactor()}
	 */
	protected static final Item[] COMP = new Item[] { Items.DIAMOND };

	/**
	 * Fuel Slot index.
	 */
	protected static final int FUEL_INDEX = 0x0;

	/**
	 * Inventory start.
	 */
	protected static final int INVENTORY_START = 0x4;

	/**
	 * {@link Logger} for this
	 */
	@Nonnull
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * A Random Number Generator.
	 */
	@Nonnull
	protected static final Random rand = new Random();

	/**
	 * Seller Slot index.
	 */
	protected static final int SELLER_INDEX = 0x1;

	/**
	 * Upgrade 1 Slot index.
	 */
	protected static final int UPGRADE_1_INDEX = 0x2;

	/**
	 * Upgrade 2 Slot index.
	 */
	protected static final int UPGRADE_2_INDEX = 0x3;

	/**
	 * A {@link List} of {@link BlockPos} of all surrounding {@link Blocks#AIR}
	 */
	@Nonnull
	protected final List<BlockPos> airSurround = new ArrayList<>();

	/**
	 * Index of the current item to merge {@link ItemStack}.
	 */
	protected int currentItem;

	/**
	 * {@link StringTextComponent} used in {@link #getDisplayName()}.
	 */
	@Nonnull
	protected final Component display_name;

	/**
	 * Determine if {@code this} is ticking.
	 */
	protected boolean isTicking = false;

	/**
	 * The {@link AbstractMinionChestBlockEntity} next to {@code this}
	 */
	@Nullable
	protected AbstractMinionChestBlockEntity mcte;

	/**
	 * The list of everything this will hold.
	 */
	@Nonnull
	public NonNullList<ItemStack> minionContents;

	/**
	 * {@link LazyOptional} of {@link IItemHandlerModifiable}
	 */
	@Nonnull
	protected LazyOptional<IItemHandlerModifiable> minionHandler = LazyOptional.of(() -> new InvWrapper(this));

	/**
	 * The Number of Players Using {@code this}
	 */
	@Nonnegative
	protected int numPlayersUsing;

	/**
	 * A {@link List} of {@link BlockPos} of all surrounding {@code BlockPos}
	 */
	@Nonnull
	protected final BlockPos[][][] surround;

	/**
	 * The current game tick of {@code this}
	 */
	@Nonnegative
	protected int tick, fuelTick;

	/**
	 * The tier of {@code this}
	 */
	@Nonnull
	protected final MinionTier tier;

	/**
	 * A {@link List} of {@link BlockPos} of all surrounding valid {@code BlockPos}
	 */
	@Nonnull
	protected final List<BlockPos> validSurround = new ArrayList<>();

	/**
	 * X coordinate of this.
	 */
	@SuppressWarnings("unused")
	@Deprecated
	private int x;

	/**
	 * Y coordinate of this.
	 */
	@SuppressWarnings("unused")
	@Deprecated
	private int y;

	/**
	 * Z coordinate of this.
	 */
	@SuppressWarnings("unused")
	@Deprecated
	private int z;

	/**
	 * Create an Abstract {@link TileEntity} for {@code this}.
	 *
	 * @param typeIn {@code TileEntity} of this.
	 * @param tier   {@link MinionTier} of this.
	 */
	protected AbstractMinionTileEntity(BlockEntityType<? extends AbstractMinionTileEntity> typeIn, BlockPos pos, BlockState state, MinionTier tier) {
		super(typeIn, pos, state);
		this.tier = Objects.requireNonNull(tier, "MinionTier cannot be null");
		this.minionContents = NonNullList.withSize(4 + this.tier.size, ItemStack.EMPTY);
		this.surround = this.initSurround();
		this.display_name = this.initDisplayName();
		LOGGER.debug(this.getType().getRegistryName().toString());
		LOGGER.debug(this.tier.name());
	}

	/**
	 * Adds the stack to the specified slot in the list.
	 *
	 * @param slotIn the specified slot
	 * @param stack  the {@link ItemStack} to add.
	 * @return {@code true} if {@code stack} has been successfully added.
	 *         {@code false} if it's not possible to place the entire stack in the
	 *         inventory.
	 */
	protected final boolean add(int slotIn, ItemStack stack) {
		LOGGER.debug("Adding " + stack.toString() + " to slot " + slotIn);
		if (stack.isEmpty())
			return false;
		try {
			int i;
			while (true) {
				i = stack.getCount();
				stack.setCount(slotIn == -1 ? this.storePartialItemStack(stack) : this.addResource(slotIn, stack));
				if (stack.isEmpty() || stack.getCount() >= i)
					break;
			}
			if (stack.getCount() == i) {
				stack.setCount(0);
				return true;
			} else
				return stack.getCount() < i;
		} catch (final Throwable throwable) {
			final CrashReport crashreport = CrashReport.forThrowable(throwable, "Adding item to inventory");
			final CrashReportCategory crashreportcategory = crashreport.addCategory("Item being added");
			crashreportcategory.setDetail("Registry Name", () -> String.valueOf(stack.getItem().getRegistryName()));
			crashreportcategory.setDetail("Item Class", () -> stack.getItem().getClass().getName());
			crashreportcategory.setDetail("Item ID", Item.getId(stack.getItem()));
			crashreportcategory.setDetail("Item data", stack.getDamageValue());
			crashreportcategory.setDetail("Item name", () -> stack.getDisplayName().getString());
			throw new ReportedException(crashreport);
		}
	}

	/**
	 * Adds drops to {@link #minionContents}
	 *
	 * @param drops the items to add.
	 */
	protected final void addItemStacks(ItemStack... drops) {
		LOGGER.debug("Adding " + Arrays.deepToString(drops) + " to inventory.");
		this.compactor();
		this.autoSmelt();
		this.superCompactor();
		for (ItemStack stack : drops)
			this.add(-1, stack);
		this.diamondSpreading();
		LOGGER.debug(this.minionContents.toString());
	}

	/**
	 * Adds drops to {@link #minionContents}
	 *
	 * @param drops the items to add.
	 */
	protected final void addItemStacks(List<ItemStack> drops) {
		this.addItemStacks(drops.toArray(new ItemStack[drops.size()]));
	}

	/**
	 * Add {@link ItemStack} to {@link #minionContents}. Also handle if the
	 * {@code ItemStack} has a count more than max stack.
	 *
	 * @param index the index to add to
	 * @param stack the {@code ItemStack} to add.
	 * @return the number of items remaining after capping an {@code ItemStack}.
	 */
	private final int addResource(int index, ItemStack stack) {
		LOGGER.debug("Adding " + stack.toString() + " to slot " + index);
		int i = stack.getCount();
		ItemStack itemstack = this.getItem(index);
		if (itemstack.isEmpty()) {
			itemstack = stack.copy();
			itemstack.setCount(0);
			if (stack.hasTag())
				itemstack.setTag(stack.getTag().copy());
			this.setItem(index, itemstack);
		}

		int j = i;
		if (i > itemstack.getMaxStackSize() - itemstack.getCount())
			j = itemstack.getMaxStackSize() - itemstack.getCount();
		if (j > this.getMaxStackSize() - itemstack.getCount())
			j = this.getMaxStackSize() - itemstack.getCount();
		if (j == 0)
			return i;
		else {
			i -= j;
			itemstack.grow(j);
			itemstack.setPopTime(5);
			return i;
		}
	}

	/**
	 * Handle {@link ItemInit#auto_smelter}.<br>
	 * Certain smeltable items will not smelt through this method as
	 * {@link #superCompactor()} takes priority.
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Auto_Smelter">Auto
	 * Smelter.</a>
	 */
	private final void autoSmelt() {
		if (!this.hasUpgrade(ItemInit.auto_smelter.get()))
			return;
		LOGGER.debug("Auto smelting contents");
		final NonNullList<ItemStack> inv = this.getInventory();
		for (final ItemStack stack : inv) {
			final Item smelt = ItemMap.smeltMap.get(stack.getItem());
			if (smelt == null)
				continue;
			this.removeItem(inv.lastIndexOf(stack), 1);
			this.add(-1, new ItemStack(smelt, 1));
		}
	}

	/**
	 * Determine if two {@link ItemStack} can merge into one.
	 *
	 * @param stack1 one {@code ItemStack}
	 * @param stack2 another {@code ItemStack}
	 * @return {@code true} if can merge.<br>
	 *         {@code false} otherwise.
	 */
	protected final boolean canMergeStacks(ItemStack stack1, ItemStack stack2) {
		return !stack1.isEmpty() && this.stackEqualExact(stack1, stack2) && stack1.isStackable()
				&& stack1.getCount() < stack1.getMaxStackSize() && stack1.getCount() < this.getMaxStackSize();
	}

	@Override
	public final boolean canPlaceItem(int index, ItemStack stack) {
		Objects.requireNonNull(stack, "cannot set slot to null");
		final Item item = stack.getItem();
		LOGGER.debug(item.getTags().toString());
		switch (index) {
		case FUEL_INDEX:
			return ModItemTags.fuel.contains(item);
		case SELLER_INDEX:
			return ModItemTags.seller.contains(item);
		case UPGRADE_1_INDEX:
		case UPGRADE_2_INDEX:
			return ModItemTags.upgrade.contains(item);
		default:
			return false;
		}
	}
	
	@Override
	public void clearRemoved() {
		super.clearRemoved();
	}
	
	@Override
	public final void clearContent() {
		this.minionContents.clear();
	}

	/**
	 * Handle {@link ItemInit#compactor}.<br>
	 * Sometimes this will do nothing unless paired with
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Diamond_Spreading">diamond
	 * spreading</a>.<br>
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Compactor">Compactor</a>
	 */
	private final void compactor() {
		if (!this.hasUpgrade(ItemInit.compactor.get()))
			return;
		LOGGER.debug("Compacting contents");
		for (final Item item : this.getCompactor()) {
			Integer count = ItemMap.compCountMap.get(item);
			count = count == null ? 9 : count;
			if (this.countItem(item) == count) {
				this.removeItem(this.lastIndexOfItem(item), count);
				this.add(-1, new ItemStack(ItemMap.compMap.get(item)));
			}
		}
	}

	/**
	 * Handle consuming fuel that this has.
	 *
	 * @param fuel the {@link MinionFuelItem} to consume.
	 */
	protected final void consumeFuel(MinionFuelItem fuel) {
		final int time = fuel.getBurnTime();
		if (time == -1)
			return;
		this.fuelTick = (++this.fuelTick) % time;
		if (this.fuelTick == 0) {
			LOGGER.debug("Consuming fuel: " + fuel.toString());
			this.removeItem(FUEL_INDEX, 1);
		}
	}

	/**
	 * Counts the number of {@link ItemInit#minion_expander} this holds.<br>
	 * This method only looks at the {@link Slot} where this item should be.<br>
	 * Should be the same as running {@link #countItem(Item)}.<br>
	 * 
	 * @return the number of expanders
	 */
	protected final int countExpander() {
		int count = 0;
		for (ItemStack stack : this.getUpgrades())
			if (stack.getItem() == ItemInit.minion_expander.get())
				count++;
		return count;
	}

	@Override
	protected abstract AbstractContainerMenu createMenu(int id, Inventory player);

	/**
	 * Handle {@link ItemInit#diamond_spreading}<br>
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Diamond_Spreading">Diamond
	 * Spreading</a>
	 */
	private final void diamondSpreading() {
		if (!this.hasUpgrade(ItemInit.diamond_spreading.get()))
			return;
		LOGGER.debug("Diamond Spreading Loggic");
		if (rand.nextInt(10) == 0)
			this.add(-1, new ItemStack(Items.DIAMOND));
	}
	
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
		return super.getCapability(cap, side);
	}

	/**
	 * Determine all possible {@link Item} that could be compacted using the
	 * {@link ItemInit#compactor}.
	 *
	 * @return a list of these {@code Item}.
	 */
	protected abstract Item[] getCompactor();

	@Override
	public final int getContainerSize() {
		return this.minionContents.size();
	}

	@Override
	protected final Component getDefaultName() {
		return new TranslatableComponent("container." + this.getType().getRegistryName().toString().toLowerCase());
	}

	@Override
	public final Component getDisplayName() {
		return this.display_name;
	}

	/**
	 * Gets First Empty {@link ItemStack}
	 *
	 * @return the index of empty stack.
	 */
	protected final int getFirstEmptyStack() {
		LOGGER.debug("Getting the index of the first empty stack.");
		for (int i = 4; i < this.minionContents.size(); ++i)
			if (this.minionContents.get(i).isEmpty())
				return i;
		return -1;
	}

	/**
	 * @return the {@link ItemStack} in the Fuel Slot.
	 */
	protected final ItemStack getFuel() {
		return this.getItem(FUEL_INDEX);
	}

	/**
	 * Determines the fuel speed of the Item in the fuel slot.
	 *
	 * @return the fuel speed. 1 if no fuel.
	 */
	protected final double getFuelSpeed() {
		final ItemStack fuel = this.getFuel();
		if (fuel.isEmpty())
			return 1d;
		final Item fuelItem = fuel.getItem();
		if (fuelItem instanceof MinionFuelItem) {
			this.consumeFuel((MinionFuelItem) fuelItem);
			return ((MinionFuelItem) fuelItem).getSpeed();
		}
		throw new IllegalStateException("Found impossible item in fuel slot: " + fuelItem.getRegistryName().toString());
	}

	/**
	 * @return a list of the main inventory.
	 */
	protected final NonNullList<ItemStack> getInventory() {
		final NonNullList<ItemStack> inv = NonNullList.withSize(this.getContainerSize() - 4, ItemStack.EMPTY);
		for (int i = INVENTORY_START; i < this.getContainerSize(); i++)
			inv.set(i - 4, this.minionContents.get(i));
		return inv;
	}

	@Override
	public final ItemStack getItem(int index) {
		return this.minionContents.get(index);
	}
	
	public final NonNullList<ItemStack> getItems() {
		return this.minionContents;
	}

	/**
	 * @return {@link #mcte}
	 */
	public final AbstractMinionChestBlockEntity getMcte() {
		return this.mcte;
	}

	/**
	 * @return the {@link ItemStack} in the Seller Slot.
	 */
	protected final ItemStack getSeller() {
		return this.getItem(SELLER_INDEX);
	}

	/**
	 * Determines the time between {@link #interact(BlockPos)} calls in ticks.
	 * 
	 * @param tier {@link MinionTier}
	 * @return time between actions in ticks.
	 */
	protected abstract int getSpeed(MinionTier tier);

	/**
	 * Determine all possible {@link Item} that could be super compacted.<br>
	 * This method assumes that all {@code Item} are keys in
	 * {@link ItemMap#enchMap}.
	 *
	 * @return a list of these {@code Item}.
	 */
	protected abstract Item[] getSuperCompactor();

	/**
	 * Determine the indexes of 160 {@link Item} to remove.
	 *
	 * @param item {@link Item} to find
	 * @return the indexes
	 */
	protected final int[] getSuperCompIndex(Item item) {
		LOGGER.debug("Finding super compactor indexes for: " + item.getRegistryName().toString());
		final int[] indexs = new int[3];
		int index = 0;
		boolean half = false;
		for (int i = this.minionContents.size() - 1; i > -1; i--) {
			final ItemStack stack = this.minionContents.get(i);
			if (stack.getItem() == item)
				switch (stack.getCount()) {
				case 32:
					if (!half) {
						indexs[index] = i;
						index++;
						half = true;
					}
					break;
				case 64:
					indexs[index] = i;
					index++;
					break;
				default:
					continue;
				}
			else
				continue;
		}
		return indexs;
	}

	/**
	 * @return {@link #tier}
	 */
	public final MinionTier getTier() {
		return this.tier;
	}

	@Override
	public final CompoundTag getUpdateTag() {
		return this.save(new CompoundTag());
	}

	/**
	 * @return the {@link ItemStack} in both Upgrade Slots.
	 */
	protected final ItemStack[] getUpgrades() {
		return new ItemStack[] { this.getItem(UPGRADE_1_INDEX), this.getItem(UPGRADE_2_INDEX) };
	}

	/**
	 * Determines if {@code this} has fuel.
	 *
	 * @return {@code true} if {@code this} has fuel.<br>
	 *         {@code false} otherwise.
	 */
	protected final boolean hasFuel() {
		return !this.getFuel().isEmpty();
	}

	/**
	 * Determines if {@code this} has a seller.
	 *
	 * @return {@code true} if {@code this} has fuel.<br>
	 *         {@code false} otherwise.
	 */
	protected final boolean hasSeller() {
		return !this.getSeller().isEmpty();
	}

	/**
	 * Determines if {@code this} has the upgrade {@code upgrade}
	 *
	 * @param upgrade is the upgrade
	 * @return {@code true} if this has {@code upgrade}<br>
	 *         {@code flase} otherwise.
	 */
	protected final boolean hasUpgrade(Item upgrade) {
		return this.getUpgrades()[0].getItem() == upgrade || this.getUpgrades()[1].getItem() == upgrade;
	}

	/**
	 * Initialize all variables.
	 */
	public final void init() {
		this.isTicking = true;
		this.x = this.worldPosition.getX();
		this.y = this.worldPosition.getY();
		this.z = this.worldPosition.getZ();
		this.tick = 0;
		this.fuelTick = 0;
		LOGGER.debug(this.toString());
		this.setSurround();
	}

	/**
	 * Initializes {@link #display_name}
	 * 
	 * @return {@link Component}.
	 */
	protected abstract Component initDisplayName();

	/**
	 * Create a 3d Array of all {@link BlockPos} that surround this.<br>
	 * This Array is 3d as certain minions interact with blocks that require these 3
	 * dimensions.
	 *
	 * @return the 3d Array with the correct bounds.
	 */
	protected abstract BlockPos[][][] initSurround();

	/**
	 * Interact with {@code pos}
	 *
	 * @param pos is the result of {@link #pickBlockPos()}
	 * @return {@code true} if a {@link Block} has been changed.<br>
	 *         {@code false} if a {@link Block} has not been changed.
	 */
	protected boolean interact(BlockPos pos) {
		return false;
	}

	/**
	 * Determine if {@code this} and any additional storage are full.
	 *
	 * @return {@code true} if full. {@code false} otherwise
	 */
	public final boolean isCompletlyFull() {
		if (this.isInventoryFull())
			if (this.mcte != null)
				return this.mcte.isFull();
		return this.hasSeller();
	}

	@Override
	public final boolean isEmpty() {
		if (this.hasSeller())
			return false;
		for (int i = 4; i < this.getContainerSize(); ++i)
			if (this.getItem(i).isEmpty())
				return true;
		if (this.mcte != null)
			return this.mcte.isFull();
		return false;
	}

	/**
	 * Determine if {@code this} is fill.
	 *
	 * @return {@code true} if full. {@code false} otherwise.
	 */
	protected final boolean isInventoryFull() {
		for (final ItemStack stack : this.getInventory())
			if (stack.isEmpty())
				return false;
			else if (stack.getCount() < stack.getMaxStackSize())
				return false;
		return true;
	}
	
	/**
	 * Finds the last index of a given {@link Item} in {@link #minionContents}.
	 * Since {@link #minionContents} is composed of {@link ItemStack} this method is preferred.
	 * 
	 * @param item {@link Item} to find
	 * @return index
	 */
	private int lastIndexOfItem(Item item) {
		for (int i = this.minionContents.size() - 1; i > -1; i--) {
			if (this.minionContents.get(i).getItem().equals(item))
				return i;
		}
		return -1;
	}

	@Override
	public void load(CompoundTag compound) {
		LOGGER.debug("Loading");
		LOGGER.debug("CompoundNBT:\t" + compound.toString());
		super.load(compound);
		this.minionContents = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, this.minionContents);
	}
	
	@Override
	public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
		LOGGER.debug("NetworkManager:\t" + net.toString());
		LOGGER.debug("ClientboundBlockEntityDataPacket:\t" + pkt.toString());
		this.load(pkt.getTag());
	}

	/**
	 * Pick a random valid {@link BlockPos} to interact with.<br>
	 * This method depends heavily on the type of minion.<br>
	 * This method will return {@code null} if no valid {@link BlockPos} is chosen.
	 *
	 * @return {@link BlockPos} picked.
	 */
	protected abstract BlockPos pickBlockPos();

	@Override
	public final ItemStack removeItem(int index, int count) {
		return ItemStackHelper.removeItem(this.minionContents, index, count);
	}

	@Override
	public final ItemStack removeItemNoUpdate(int index) {
		LOGGER.debug("Removing stack from slot " + index);
		return ItemStackHelper.takeItem(this.minionContents, index);
	}

	/**
	 * Removes a stack from the indexes.
	 *
	 * @param indexes a list of indexes
	 * @return primitive type array of {@link ItemStack} removed.
	 */
	protected final ItemStack[] removeStacksFromSlot(int... indexes) {
		LOGGER.debug("Removing stacks from slots " + Arrays.toString(indexes));
		final ItemStack[] temp = new ItemStack[indexes.length];
		for (int i = 0; i < indexes.length; i++)
			temp[i] = this.getItem(i).getCount() == 32 ? this.removeItem(i, 32) : this.removeItemNoUpdate(i);
		return temp;
	}

	@Override
	public CompoundTag save(CompoundTag compound) {
		LOGGER.debug("Saving");
		super.save(compound);
		ItemStackHelper.saveAllItems(compound, this.minionContents);
		LOGGER.debug("NBT:\t" + compound.toString());
		return compound;
	}

	/**
	 * Determine all surround {@link BlockPos} that equal {@link Material#AIR}.
	 */
	protected void setAirSurround() {
		LOGGER.debug("Finding Air in valid BlockPos");
		this.airSurround.clear();
		for (final BlockPos pos : this.validSurround) {
			BlockState state = this.level.getBlockState(pos);
			if (state.getMaterial() == Material.AIR)
				this.airSurround.add(pos);
		}
		LOGGER.debug(this.airSurround.toString());
	}

	@Override
	public final void setItem(int index, ItemStack stack) {
		Objects.requireNonNull(stack, "ItemStack cannot be null");
		LOGGER.debug("Setting slot" + index + " to " + stack.toString());
		final ItemStack indexStack = this.minionContents.get(index);
		final boolean flag = !stack.isEmpty() && stack.sameItem(indexStack) && ItemStack.tagMatches(stack, indexStack);
		this.minionContents.set(index, stack);
		if (stack.getCount() > this.getMaxStackSize())
			stack.setCount(this.getMaxStackSize());
		if (!flag)
			this.clearContent();
	}
	
	protected void setItems(NonNullList<ItemStack> items) {
		this.minionContents = Objects.requireNonNull(items, "New Minion Contents must be non-null");
	}

	/**
	 * Changes {@link #mcte}
	 *
	 * @param mcte the new {@link AbstractMinionChestBlockEntity}
	 */
	public final void setMcte(@Nullable AbstractMinionChestBlockEntity mcte) {
		LOGGER.debug("Setting AbstractMinionChestTileEntity");
		this.mcte = mcte;
	}

	@Override
	public final void setRemoved() {
		LOGGER.debug("Removing " + this.getClass().getSimpleName());
		super.setRemoved();
		if (this.minionHandler != null)
			this.minionHandler.invalidate();
	}

	/**
	 * Determine all surrounding {@link BlockPos}.<br>
	 * Due to the effects of {@link ItemInit#minion_expander}, this method will
	 * automatically gather the blocks from the enlarged area
	 */
	protected abstract void setSurround();

	/**
	 * Determine all valid surrounding {@link BlockPos}
	 */
	protected abstract void setValidSurround();

	/**
	 * Checks item, NBT, and meta if the item is not damageable.
	 *
	 * @param stack1 one {@link ItemStack}
	 * @param stack2 another {@link ItemStack}
	 * @return {@code true} if equal.<br>
	 *         {@code false} otherwise.
	 */
	private final boolean stackEqualExact(ItemStack stack1, ItemStack stack2) {
		LOGGER.debug("Determining if " + stack1.toString() + " is exactly equal to " + stack2.toString());
		return stack1.getItem() == stack2.getItem() && ItemStack.tagMatches(stack1, stack2);
	}

	@Override
	public final boolean stillValid(Player player) {
		Objects.requireNonNull(player, "player cannot be null");
		if (this.level.getBlockEntity(this.worldPosition) != this)
			return false;
		return player.distanceToSqr(this.worldPosition.getX() + .5, this.worldPosition.getY() + .5,
				this.worldPosition.getZ() + .5) <= 64d;
	}

	/**
	 * Stores a stack in the player's inventory. It first tries to place it in the
	 * selected slot in the player's hotbar, then the offhand slot, then any
	 * available/empty slot in the player's inventory.
	 *
	 * @param stack {@link ItemStack} to add.
	 * @return index of stack
	 */
	private final int storeItemStack(ItemStack stack) {
		LOGGER.debug("Storing " + stack.toString());
		if (this.canMergeStacks(this.getItem(this.currentItem), stack))
			return this.currentItem;
		for (int i = 4; i < this.minionContents.size(); ++i)
			if (this.canMergeStacks(this.minionContents.get(i), stack))
				return i;
		return -1;
	}

	/**
	 * This function stores as many items of an {@link ItemStack} as possible in a
	 * matching slot and returns the quantity of left over items.
	 *
	 * @param stack {@code ItemStack} to store.
	 * @return the quantity of left over {@code Item}
	 */
	private final int storePartialItemStack(ItemStack stack) {
		LOGGER.debug("Storing partially " + stack.toString());
		int i = this.storeItemStack(stack);
		if (i == -1)
			i = this.getFirstEmptyStack();
		return i == -1 ? stack.getCount() : this.addResource(i, stack);
	}

	/**
	 * Handle {@link ItemInit#super_compactor_3000}.<br>
	 * <a href="https://hypixel-skyblock.fandom.com/wiki/Super_Compactor_3000">Super
	 * Compactor 3000</a>
	 */
	private final void superCompactor() {
		if (!this.hasUpgrade(ItemInit.super_compactor_3000.get()))
			return;
		LOGGER.debug("Super Compacting contents");
		for (final Item item : this.getSuperCompactor()) {
			Integer count = ItemMap.enchCountMap.get(item);
			count = count == null ? 160 : count;
			if (this.countItem(item) == count) {
				this.removeStacksFromSlot(this.getSuperCompIndex(item));
				this.add(-1, new ItemStack(ItemMap.enchMap.get(item), ItemMap.enchCountMap.get(item)));
			}
		}
	}
	
	public abstract void tick();

	@Override
	public final String toString() {
		return this.getClass().getSimpleName() + " [worldPosition=" + this.worldPosition.toString() + ", tier="
				+ this.tier + "]";
	}

	@Override
	public final boolean triggerEvent(int id, int type) {
		LOGGER.debug("Triggering Event. id:\t" + id + " type:\t" + type);
		if (id == 1) {
			this.numPlayersUsing = type;
			return true;
		}
		return super.triggerEvent(id, type);
	}
}