package net.hypixel.skyblock.util;

import java.util.Objects;

import javax.annotation.concurrent.Immutable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
/**
 * Help save and load items from {@link Inventory}.
 *
 * @author MrPineapple070
 * @version 26 June 2020
 * @since 11 June 2019
 */
@Immutable
public final class InventoryHelper {
	/**
	 *  Directly reference a log4j {@link Logger}.
	 */
	private static final Logger LOGGER = LogManager.getLogger();
	
	/**
	 * Load all items in {@code inventory}
	 *
	 * @param list      {@link ListNBT} to load from.
	 * @param inventory {@link Inventory} to load.
	 */
	public static final void loadAllItems(ListTag list, Inventory inventory) {
		Objects.requireNonNull(list, "ListNBT cannot be null");
		Objects.requireNonNull(inventory, "Inventory cannot be null");
		LOGGER.info("Loading all Items");
		LOGGER.info("ListTag:\t" + list.toString());
		LOGGER.info("Inventory:\t" + inventory.toString());
		for (int i = 0; i < list.size(); i++) {
			final CompoundTag compound = list.getCompound(i);
			final int slot = compound.getByte("Slot") & 0xFF;
			if (slot < inventory.getContainerSize())
				inventory.setItem(slot, ItemStack.of(compound));
		}
	}
	
	
	/**
	 * Save all items in {@code inventory}
	 *
	 * @param list      {@link ListNBT} to store it in.
	 * @param inventory {@link Inventory} to save.
	 * @return a {@code ListNBT} with everything in {@code inventory}
	 */
	public static final ListTag saveAllItems(ListTag list, Inventory inventory) {
		Objects.requireNonNull(list, "ListNBT cannot be null");
		Objects.requireNonNull(inventory, "Inventory cannot be null");
		LOGGER.info("Saving all Items");
		LOGGER.info("ListNBT:\t" + list.toString());
		LOGGER.info("Inventory:\t" + inventory.toString());
		for (int i = 0; i < inventory.getContainerSize(); ++i) {
			final ItemStack itemstack = inventory.getItem(i);
			if (!itemstack.isEmpty()) {
				final CompoundTag compound = new CompoundTag();
				compound.putByte("Slot", (byte) i);
				itemstack.deserializeNBT(compound);
				list.add(compound);
			}
		}
		return list;
	}
}