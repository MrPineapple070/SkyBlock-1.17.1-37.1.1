package net.hypixel.skyblock.world.inventory;

import java.util.Objects;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public abstract class GUISlot extends Slot {
	protected static final Logger LOGGER = LogManager.getLogger();
	
	@Nonnull
	protected final ItemStack stack;

	public GUISlot(Container contianer, int slot, int x, int y) {
		this(contianer, slot, x, y, ItemStack.EMPTY);
	}

	public GUISlot(Container container, int slot, int x, int y, Item item) {
		this(container, slot, x, y, new ItemStack(item));
	}

	public GUISlot(Container container, int slot, int x, int y, ItemStack stack) {
		super(container, slot, x, y);
		this.stack = Objects.requireNonNull(stack, "ItemStack cannot be null");
		this.set(this.stack);
	}
	
	@Override
	public void set(ItemStack stack) {
		super.set(this.stack);
	}

	@Override
	public abstract boolean mayPickup(Player player);

	@Override
	public boolean mayPlace(ItemStack stack) {
		return false;
	}
}