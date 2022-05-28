package net.hypixel.skyblock.world.inventory.minion;

import java.awt.MenuItem;
import java.util.Objects;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.tags.ModItemTags;
import net.hypixel.skyblock.world.inventory.CloseSlot;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;

/**
 * A base for all {@link Container} for all Minions.
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Minions">Click here for a
 * description of Minions.</a>
 *
 * @author MrPineapple070
 * @version 11 July 2019
 * @since 11 July 2019
 */
public class AbstractMinionContainer extends AbstractContainerMenu {
	protected static class MinionSlot extends Slot {
		public MinionSlot(Container container, int slot, int x, int y) {
			super(container, slot, x, y);
		}

		@Override
		public boolean mayPlace(ItemStack stack) {
			return false;
		}
	}

	protected class FuelSlot extends Slot {
		public FuelSlot(Container container) {
			super(container, 0, 44, 18);
		}

		@Override
		public boolean mayPlace(ItemStack stack) {
			return ModItemTags.fuel.contains(stack.getItem());
		}
	}

	protected class SellerSlot extends Slot {
		public SellerSlot(Container inventoryIn) {
			super(inventoryIn, 1, 44, 36);
		}

		@Override
		public int getMaxStackSize() {
			return 1;
		}

		@Override
		public boolean mayPlace(ItemStack stack) {
			return ModItemTags.seller.contains(stack.getItem());
		}
	}

	protected class UpgradeSlot extends Slot {
		public UpgradeSlot(Container inventoryIn, int index) {
			super(inventoryIn, index, 44, index == 2 ? 54 : 72);
		}

		@Override
		public int getMaxStackSize() {
			return 1;
		}

		@Override
		public boolean mayPlace(ItemStack stack) {
			return ModItemTags.upgrade.contains(stack.getItem());
		}
	}
	
	/**
	 * Gets a {@link AbstractMinionTileEntity} from {@link FriendlyByteBuf}
	 * @param inventory	{@link Inventory} of {@link Player}
	 * @param data		{@link FriendlyByteBuf}
	 * @return {@link AbstractMinionTileEntity}
	 */
	protected static final AbstractMinionTileEntity getBlockEntity(final Inventory inventory, final FriendlyByteBuf data) {
		Objects.requireNonNull(inventory, "Inventory cannot be null");
		Objects.requireNonNull(data, "FriendlyByteBuf cannot be null");
		final BlockEntity be = inventory.player.level.getBlockEntity(data.readBlockPos());
		if (be instanceof AbstractMinionTileEntity)
			return (AbstractMinionTileEntity) be;
		throw new IllegalStateException("Expected AbstractMinionTileEntity got " + be.getClass().toString());
	}
	
	/**
	 * {@link Logger} for this.
	 */
	@Nonnull
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * The {@link IInventory} of this.
	 */
	@Nonnull
	protected final Container inventory;

	/**
	 * The {@link IInventory} that hold {@link MenuItem}
	 */
	@Nonnull
	protected final Container menu;

	/**
	 * The {@link AbstractMinionTileEntity} of this,
	 */
	@Nonnull
	protected final AbstractMinionTileEntity minion;

	/**
	 * Construct this
	 *
	 * @param type   the {@link ContainerType}.
	 * @param id     the unique window id.
	 * @param player the {@link PlayerInventory}.
	 * @param minion the {@link TileEntity} for {@code this}.
	 */
	protected AbstractMinionContainer(MenuType<? extends AbstractMinionContainer> type, int id, Inventory player,
			AbstractMinionTileEntity minion) {
		super(type, id);
		this.minion = Objects.requireNonNull(minion, "AbstractMinionTileEntity cannot be null");
		this.inventory = new SimpleContainer(
				this.minion.minionContents.toArray(new ItemStack[this.minion.minionContents.size()]));
		this.menu = new SimpleContainer(2);
		LOGGER.debug(this.getType().getRegistryName().toString());

		this.addSlot(new FuelSlot(this.inventory));
		this.addSlot(new SellerSlot(this.inventory));
		this.addSlot(new UpgradeSlot(this.inventory, 2));
		this.addSlot(new UpgradeSlot(this.inventory, 3));

		// Main Inventory
		int num = this.minion.getContainerSize();
		for (int row = 0; row < 3; ++row)
			for (int col = 0; col < 5; ++col)
				if (num == 4)
					break;
				else {
					this.addSlot(new MinionSlot(this.inventory, 4 + row * 5 + col, row, col));
					num--;
				}

		// Menu Inventory
		this.addSlot(new CloseSlot(this.menu, 0, 80, 72));

		// Player Inventory
		for (int row = 0; row < 3; ++row)
			for (int column = 0; column < 9; ++column)
				this.addSlot(new Slot(player, 9 + row * 9 + column, 8 + column * 18, 102 + row * 18));

		// Player HotBar
		for (int column = 0; column < 9; ++column)
			this.addSlot(new Slot(player, column, 8 + column * 18, 160));
	}

	@Override
	public final boolean stillValid(Player playerIn) {
		return true;
	}

	@Override
	public final void removed(Player playerIn) {
		super.removed(playerIn);
		this.inventory.stillValid(playerIn);
	}

	@Override
	public final ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack stack = ItemStack.EMPTY;
		final Slot slot = this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			final ItemStack stack1 = slot.getItem();
			stack = stack1.copy();
			if (index < this.minion.getContainerSize()) {
				if (!this.moveItemStackTo(stack1, this.inventory.getContainerSize(), this.inventory.getContainerSize(),
						true))
					return ItemStack.EMPTY;
			} else if (!this.moveItemStackTo(stack1, 0, this.inventory.getContainerSize(), false))
				return ItemStack.EMPTY;
			if (stack1.isEmpty())
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
		}
		return stack;
	}
}