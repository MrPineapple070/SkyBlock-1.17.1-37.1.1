package net.hypixel.skyblock.world.inventory.minion;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.world.inventory.init.ModMenuTypes;
import net.hypixel.skyblock.world.level.block.minion.MinionChestBlock.MinionChestType;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

/**
 * Serve as a basis for all {@code MinionChestContainer}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Minion_Chests">Click
 * here</a> for a description of Minion Chests.
 *
 * @author MrPineapple070
 * @version 12 June 2020
 * @since 11 June 2019
 */
public abstract class MinionChestContainer extends AbstractContainerMenu {
	public static class LargeMCC extends MinionChestContainer {
		public LargeMCC(int windowId, Inventory pInvIn) {
			super(ModMenuTypes.large_mcc.get(), windowId, pInvIn, MinionChestType.Large);
		}

		public LargeMCC(int windowId, Inventory pInvIn, FriendlyByteBuf data) {
			this(windowId, pInvIn);
		}
	}

	public static class MediumMCC extends MinionChestContainer {
		public MediumMCC(int windowId, Inventory pInvIn) {
			super(ModMenuTypes.medium_mcc.get(), windowId, pInvIn, MinionChestType.Medium);
		}

		public MediumMCC(int windowId, Inventory pInvIn, FriendlyByteBuf data) {
			this(windowId, pInvIn);
		}
	}

	protected static class MinionChestSlot extends Slot {
		public MinionChestSlot(Container container, int slot, int x, int y) {
			super(container, slot, x, y);
		}

		@Override
		public boolean mayPlace(ItemStack stack) {
			return false;
		}
	}

	public static class SmallMCC extends MinionChestContainer {
		public SmallMCC(int windowId, Inventory pInvIn) {
			super(ModMenuTypes.small_mcc.get(), windowId, pInvIn, MinionChestType.Small);
		}

		public SmallMCC(int windowId, Inventory pInvIn, FriendlyByteBuf data) {
			this(windowId, pInvIn);
		}
	}

	/**
	 * {@link Container} of the contents of this.
	 */
	@Nonnull
	public final Container inventory;
	
	/**
	 * {@link MinionChestType} of this.
	 */
	@Nonnull
	protected final MinionChestType type;

	protected MinionChestContainer(MenuType<? extends MinionChestContainer> type, int id,
			Inventory inventory, MinionChestType chest_type) {
		super(type, id);
		this.type = chest_type;
		this.inventory = new SimpleContainer(this.type.additional);
		this.inventory.startOpen(inventory.player);

		// Main Inventory
		int rowMin, rowMax, colMin, colMax;
		switch (chest_type) {
		case Small:
			rowMin = 1;
			rowMax = 2;
			colMin = 1;
			colMax = 4;
			break;
		case Medium:
			rowMin = 0;
			rowMax = 3;
			colMin = 1;
			colMax = 4;
			break;
		case Large:
			rowMin = 0;
			rowMax = 3;
			colMin = 0;
			colMax = 5;
			break;
		default:
			throw new IllegalStateException("Illegal MinionChestType " + this.type.name());
		}

		// Main Inventory
		for (int row = rowMin; row < rowMax; ++row)
			for (int col = colMin; col < colMax; ++col)
				this.addSlot(new MinionChestSlot(this.inventory, row, col, rowMax));

		// Player Inventory
		for (int row = 0; row < 3; ++row)
			for (int col = 0; col < 9; ++col)
				this.addSlot(new Slot(inventory, 9 + 9 * row + col, 48 + 18 * col, 129 + 18 * row));

		// Player HotBar
		for (int col = 0; col < 9; ++col)
			this.addSlot(new Slot(inventory, col, 48 + 18 * col, 187));
	}

	/**
	 * Getter method of {@link #inventory}
	 * @return {@link #inventory}
	 */
	public Container getChestInventory() {
		return this.inventory;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < this.type.additional)
				if (!this.moveItemStackTo(itemstack1, this.type.additional, this.slots.size(), true))
					return ItemStack.EMPTY;
				else if (!this.moveItemStackTo(itemstack1, 0, this.type.additional, false))
					return ItemStack.EMPTY;

			if (itemstack1.isEmpty())
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
		}
		return itemstack;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		this.inventory.stopOpen(playerIn);
	}

	@Override
	public boolean stillValid(Player playerIn) {
		return this.inventory.stillValid(playerIn);
	}
}