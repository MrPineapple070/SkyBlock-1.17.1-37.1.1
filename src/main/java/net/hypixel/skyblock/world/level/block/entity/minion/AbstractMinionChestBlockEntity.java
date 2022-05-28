package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.util.ItemStackHelper;
import net.hypixel.skyblock.world.level.block.entity.ModBlockEntityTypes;
import net.hypixel.skyblock.world.level.block.minion.MinionChestBlock;
import net.hypixel.skyblock.world.level.block.minion.MinionChestBlock.MinionChestType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.CompoundContainer;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestLidController;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.entity.LidBlockEntity;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

/**
 * Server as a base for MinionChest TileEntity
 *
 * @author MrPineapple070
 * @version 5 July 2020
 * 
 */
public class AbstractMinionChestBlockEntity extends RandomizableContainerBlockEntity implements LidBlockEntity {
	public static class LargeMCTE extends AbstractMinionChestBlockEntity {
		public LargeMCTE(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.large_mcte.get(), pos, state, MinionChestType.Large);
		}
	}

	public static class MediumMCTE extends AbstractMinionChestBlockEntity {
		public MediumMCTE(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.medium_mcte.get(), pos, state, MinionChestType.Medium);
		}
	}

	public static class SmallMCTE extends AbstractMinionChestBlockEntity {
		public SmallMCTE(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.small_mcte.get(), pos, state, MinionChestType.Small);
		}
	}
	
	/**
	 * {@link Logger} for this class
	 */
	protected static final Logger LOGGER = LogManager.getLogger();
	
	/**
	 * Animate the lid opening
	 * 
	 * @param level	{@link Level} this is in
	 * @param pos	{@link BlockPos} of this
	 * @param state	{@link BlockState} of this
	 * @param chest	{@link AbstractMinionChestBlockEntity} of this
	 */
	public static void lidAnimateTick(Level level, BlockPos pos, BlockState state, AbstractMinionChestBlockEntity chest) {
		chest.chestLidController.tickLid();
	}
	
	/**
	 * Play sound at a {@link BlockPos}
	 * @param level	{@link Level} to play the sound in
	 * @param pos	{@link BlockPos} to play the sound
	 * @param state	{@link BlockState} of the
	 * @param sound	{@link SoundEvent} to play
	 */
	static void playSound(Level level, BlockPos pos, BlockState state, SoundEvent sound) {
		ChestType type = state.getValue(ChestBlock.TYPE);
		if (type != ChestType.LEFT) {
			double x = (double)pos.getX() + .5;
			double y = (double)pos.getY() + .5;
			double z = (double)pos.getZ() + .5;
			if (type == ChestType.RIGHT) {
				Direction direction = ChestBlock.getConnectedDirection(state);
				x += (double)direction.getStepX() * .5;
				z += (double)direction.getStepZ() * .5;
			}

			level.playSound(null, x, y, z, sound, SoundSource.BLOCKS, .5f, level.random.nextFloat() * .1f + .9f);
		}
	}
	
	@Deprecated
	@Nullable
	protected LazyOptional<IItemHandler> chestHandler = LazyOptional.of(() -> new InvWrapper(this));

	/**
	 * {@link ChestLidController}
	 */
	private final ChestLidController chestLidController;

	/**
	 * The {@link NonNullList} of things that {@code this} contains.
	 */
	@Nonnull
	protected NonNullList<ItemStack> items;

	/**
	 * The angle of the chest lid
	 */
	@Deprecated
	public float lidAngle;

	/**
	 * The number of Players using {@code this}
	 */
	@Deprecated
	protected int numPlayersUsing;
	
	/**
	 * {@link ContainerOpenersCounter}
	 */
	private final ContainerOpenersCounter openersCounter = new ContainerOpenersCounter() {
		protected boolean isOwnContainer(Player p_155355_) {
			if (!(p_155355_.containerMenu instanceof ChestMenu)) {
				return false;
			} else {
				Container container = ((ChestMenu)p_155355_.containerMenu).getContainer();
				return container == AbstractMinionChestBlockEntity.this || container instanceof CompoundContainer && ((CompoundContainer)container).contains(AbstractMinionChestBlockEntity.this);
			}
		}

		protected void onClose(Level level, BlockPos pos, BlockState state) {
			AbstractMinionChestBlockEntity.playSound(level, pos, state, SoundEvents.CHEST_CLOSE);
		}

		protected void onOpen(Level level, BlockPos pos, BlockState state) {
			AbstractMinionChestBlockEntity.playSound(level, pos, state, SoundEvents.CHEST_OPEN);
		}

		protected void openerCountChanged(Level level, BlockPos pos, BlockState state, int idk, int id) {
			AbstractMinionChestBlockEntity.this.signalOpenCount(level, pos, state, idk, id);
		}
	};

	/**
	 * The angle of the chest lid last tick
	 */
	@Deprecated
	public float prevLidAngle;

	/**
	 * A counter that is incremented once each tick. Used to determine when to
	 * determine when to sync with the client; this happens every 80 ticks. However,
	 * the number of players is not re-counted.
	 */
	@Deprecated
	protected int ticksSinceSync;

	/**
	 * The {@link MinionChestType} of this.
	 */
	@Nonnull
	public final MinionChestType type;

	/**
	 * Construct this.
	 *
	 * @param typeIn the {@link TileEntityType}
	 * @param type   the {@link MinionChestType}
	 */
	protected AbstractMinionChestBlockEntity(BlockEntityType<? extends AbstractMinionChestBlockEntity> typeIn,
			BlockPos pos, BlockState state, MinionChestType type) {
		super(typeIn, pos, state);
		this.chestLidController = new ChestLidController();
		this.type = Objects.requireNonNull(type, "Minion Chest Tile Entity must have a MinionChestType.");
		this.items = NonNullList.withSize(this.type.additional, ItemStack.EMPTY);
	}

	public boolean canBeUsed(Player player) {
		if (this.level.getBlockEntity(this.worldPosition) != this)
			return false;
		else
			return (player.distanceToSqr(this.worldPosition.getX() + .5, this.worldPosition.getY() + .5,
					this.worldPosition.getZ() + .5) <= 64d);
	}
	
	@Deprecated
	public void closeInventory(Player player) {
		if (!player.isSpectator()) {
			--this.numPlayersUsing;
			this.onOpenOrClose();
		}
	}

	@Override
	protected AbstractContainerMenu createMenu(int id, Inventory inventory) {
		return null;
	}
	
	@Deprecated
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
		if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			return this.chestHandler.cast();
		return super.getCapability(cap, side);
	}

	@Override
	public int getContainerSize() {
		return this.items.size();
	}

	@Override
	protected Component getDefaultName() {
		switch (this.type) {
		case Small:
			return MinionChestBlock.container_name_s;
		case Medium:
			return MinionChestBlock.container_name_m;
		case Large:
			return MinionChestBlock.container_name_l;
		default:
			throw new IllegalStateException("Illegal Minion Chest Type:\t" + this.type.name());
		}
	}

	@Override
	public Component getDisplayName() {
		return new TextComponent(this.type.name() + " Minion Chest");
	}

	@Override
	public ItemStack getItem(int index) {
		return this.items.get(index);
	}

	@Override
	public NonNullList<ItemStack> getItems() {
		return this.items;
	}

	@Override
	public float getOpenNess(float angle) {
		return this.chestLidController.getOpenness(angle);
	}

	@Override
	public boolean isEmpty() {
		for (final ItemStack stack : this.items)
			if (!stack.isEmpty())
				return false;
		return true;
	}

	/**
	 * Determine if {@code this} is full.
	 *
	 * @return {@code true} if full. {@code false} otherwise.
	 */
	public boolean isFull() {
		for (final ItemStack stack : this.items)
			if (stack.isEmpty())
				return false;
			else if (stack.getCount() < stack.getMaxStackSize())
				return false;
		return true;
	}

	@Override
	public void load(CompoundTag compound) {
		LOGGER.info("AbstractMinionChestTileEntity Reading");
		LOGGER.info("CompoundNBT:\t" + compound.toString());
		super.load(compound);
		this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
		if (!this.trySaveLootTable(compound))
			ItemStackHelper.loadAllItems(compound, this.items);
	}
	
	@Deprecated
	protected void onOpenOrClose() {
		Block block = this.getBlockState().getBlock();
		if (block instanceof ChestBlock) {
			this.level.blockEvent(this.worldPosition, block, 1, this.numPlayersUsing);
			this.level.updateNeighborsAt(this.worldPosition, block);
		}
	}
	
	@Deprecated
	public void openInventory(Player player) {
		if (!player.isSpectator()) {
			if (this.numPlayersUsing < 0) {
				this.numPlayersUsing = 0;
			}

			++this.numPlayersUsing;
			this.onOpenOrClose();
		}
	}

	/**
	 * Play a sound in the world.
	 *
	 * @param sound the {@link SoundEvent} to play.
	 */
	protected void playSound(SoundEvent sound) {
		this.level.playSound((Player) null, this.worldPosition, sound, SoundSource.BLOCKS, .5f,
				this.level.random.nextFloat() * .1f + .9f);
	}

	@Override
	public ItemStack removeItem(int index, int count) {
		return ItemStackHelper.removeItem(this.items, index, count);
	}

	@Override
	public ItemStack removeItemNoUpdate(int index) {
		LOGGER.info("Remove stack form slot " + index);
		return ItemStackHelper.takeItem(this.items, index);
	}

	@Override
	public CompoundTag save(CompoundTag compound) {
		LOGGER.info("Saving:\t" + compound.toString());
		super.save(compound);
		if (!this.trySaveLootTable(compound))
			ItemStackHelper.saveAllItems(compound, this.items);
		return compound;
	}

	@Override
	public void setItem(int index, ItemStack stack) {
		LOGGER.info("Setting slot " + index + " to " + stack.toString());
		final ItemStack indexStack = this.items.get(index);
		final boolean flag = !stack.isEmpty() && stack.sameItem(indexStack) && ItemStack.tagMatches(stack, indexStack);
		this.items.set(index, stack);
		if (stack.getCount() > this.getMaxStackSize())
			stack.setCount(this.getMaxStackSize());
		if (!flag)
			this.setChanged();
	}

	@Override
	public void setItems(NonNullList<ItemStack> itemsIn) {
		this.items = itemsIn;
	}

	@Override
	public void setRemoved() {
		this.clearContent();
		super.setRemoved();
	}
	
	/**
	 * Signal open count
	 * 
	 * @param level {@link Level} this is in
	 * @param pos	{@link BlockPos} of this
	 * @param state	{@link BlockState} of this
	 * @param idk	I don't know what this does
	 * @param id	Block event Id.
	 */
	protected void signalOpenCount(Level level, BlockPos pos, BlockState state, int idk, int id) {
		Block block = state.getBlock();
		level.blockEvent(pos, block, 1, id);
	}
	
	@Override
	public void startOpen(Player player) {
		if (!this.remove && !player.isSpectator()) {
			this.openersCounter.incrementOpeners(player, this.getLevel(), this.getBlockPos(), this.getBlockState());
		}

	}
	
	@Override
	public void stopOpen(Player player) {
		if (!this.remove && !player.isSpectator()) {
			this.openersCounter.decrementOpeners(player, this.getLevel(), this.getBlockPos(), this.getBlockState());
		}

	}
	
	@Deprecated
	public void tick() {
		if (++this.ticksSinceSync % 20 * 4 == 0)
			this.level.blockEvent(this.worldPosition, Blocks.ENDER_CHEST, 1, this.numPlayersUsing);

		this.prevLidAngle = this.lidAngle;
		int x = this.worldPosition.getX();
		int y = this.worldPosition.getY();
		int z = this.worldPosition.getZ();
		if (this.numPlayersUsing > 0 && this.lidAngle == 0f)
			this.level.playSound((Player) null, x + .5, y + .5d, z + .5, SoundEvents.CHEST_OPEN,
					SoundSource.BLOCKS, 0.5F, this.level.random.nextFloat() * .1f + .9f);
		if (this.numPlayersUsing == 0 && this.lidAngle > 0f || this.numPlayersUsing > 0 && this.lidAngle < 1f) {
			if (this.numPlayersUsing > 0)
				this.lidAngle += .1f;
			else
				this.lidAngle -= .1f;
			if (this.lidAngle > 1f)
				this.lidAngle = 1f;
			if (this.lidAngle < .5f && this.lidAngle >= .5f)
				this.level.playSound((Player) null, x + 0.5D, (double) y + .5d, z + 0.5D, SoundEvents.CHEST_CLOSE,
						SoundSource.BLOCKS, .5f, this.level.random.nextFloat() * .1f + .9f);
			if (this.lidAngle < 0f)
				this.lidAngle = 0f;
		}
	}

	@Override
	public boolean triggerEvent(int id, int type) {
		LOGGER.info("Triggering event " + id + " of chest type " + type);
		if (id == 1) {
			this.numPlayersUsing = type;
			this.chestLidController.shouldBeOpen(type > 0);
			return true;
		}

		return super.triggerEvent(id, type);
	}
}