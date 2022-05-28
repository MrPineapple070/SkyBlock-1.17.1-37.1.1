package net.hypixel.skyblock.world.level.block.entity;

import java.util.Objects;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.util.TimeConverter;
import net.hypixel.skyblock.world.inventory.init.ModMenuTypes;
import net.hypixel.skyblock.world.level.block.TimeSaver;
import net.hypixel.skyblock.world.level.block.TimeSaver.TimeSaverType;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;

/**
 * @author MrPineapple070
 * @version 07 October 2020
 * @since 07 October 2020
 */
public class TimeSaverTileEntity extends BaseContainerBlockEntity implements MenuProvider {
	public static final class DaySaverTileEntity extends TimeSaverTileEntity {
		public DaySaverTileEntity(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.day_saver.get(), pos, state, TimeSaverType.Day);
		}
	}

	public static final class NightSaverTileEntity extends TimeSaverTileEntity {
		public NightSaverTileEntity(BlockPos pos, BlockState state) {
			super(ModBlockEntityTypes.night_saver.get(), pos, state, TimeSaverType.Night);
		}
	}

	/**
	 * {@link TranslatableComponent} for the name of day time
	 */
	@Nonnull
	protected static final Component day = new TranslatableComponent("container.time_saver.day");

	/**
	 * {@link Logger}
	 */
	@Nonnull
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * {@link TranslatableComponent} for the name of night time
	 */
	@Nonnull
	protected static final Component night = new TranslatableComponent("container.time_saver.night");

	/**
	 * {@link ItemStack} used in {@link #getItem(int)},
	 * {@link #removeItem(int, int)}, and {@link #removeItemNoUpdate(int)}
	 */
	@Nonnull
	protected static final ItemStack stack = new ItemStack(Items.DAYLIGHT_DETECTOR);

	/**
	 * Call this method on every tick.
	 * 
	 * @param level       {@link Level} that {@link TimeSaverTileEntity} is in
	 * @param pos         {@link BlockPos} of where {@link TimeSaverTileEntity} is
	 * @param state       {@link BlockState} of the {@link TimeSaverTileEntity}
	 * @param blockEntity {@link TimeSaverTileEntity} itself.
	 */
	public static <T extends BlockEntity> void tick(Level level, BlockPos pos, BlockState state, T blockEntity) {
		if (!(level instanceof ServerLevel))
			return;
		if (!(blockEntity instanceof TimeSaverTileEntity))
			return;
		ServerLevel server = (ServerLevel) level;
		TimeSaverTileEntity tste = (TimeSaverTileEntity) blockEntity;
		boolean day = tste.type == TimeSaver.TimeSaverType.Day;
		server.setDayTime(TimeConverter.hours.get((tste.getSelected() + 6 + (day ? 12 : 0)) % TimeConverter.hours.size()));
	}

	/**
	 * {@link LazyOptional} of {@link IItemHandlerModifiable}
	 */
	@Nonnull
	protected LazyOptional<IItemHandlerModifiable> saverHandler = LazyOptional.of(() -> this.createHandler());

	/**
	 * Index that holds time selected;
	 */
	protected int selected;

	/**
	 * {@link TimeSaverType} to handle day or night.
	 */
	@Nonnull
	public final TimeSaverType type;

	public TimeSaverTileEntity(BlockEntityType<? extends TimeSaverTileEntity> typeIn, BlockPos pos, BlockState state,
			TimeSaverType type) {
		super(typeIn, pos, state);
		this.type = Objects.requireNonNull(type, "TimeSaverType cannot be null");
	}

	@Override
	public void clearContent() {
	}

	/**
	 * Create an {@link ItemStackHandler} to handle when the contents of this
	 * changes.
	 * 
	 * @return {@link ItemStackHandler}
	 */
	protected final ItemStackHandler createHandler() {
		return new ItemStackHandler(this.getContainerSize()) {
			@Override
			public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
				return false;
			}

			@Override
			protected void onContentsChanged(int slot) {
				TimeSaverTileEntity.this.setChanged();
			}
		};
	}

	@Override
	@Deprecated
	protected AbstractContainerMenu createMenu(int windowId, Inventory inventory) {
		return ModMenuTypes.time_saver.get().create(windowId, inventory);
	}

	@Override
	public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
		switch (this.type) {
		case Day:
		case Night:
			return ModMenuTypes.time_saver.get().create(id, inventory);
		default:
			throw new IllegalStateException("Illegal TimeSaverType:\t" + this.type.name());
		}
	}

	@Override
	public int getContainerSize() {
		return 12;
	}

	@Override
	protected Component getDefaultName() {
		switch (this.type) {
		case Day:
			return day;
		case Night:
			return night;
		default:
			throw new IllegalStateException("Illegal TimeSaverType:\t" + this.type.name());
		}
	}

	@Override
	public Component getDisplayName() {
		switch (this.type) {
		case Day:
			return day;
		case Night:
			return night;
		default:
			throw new IllegalStateException("Illegal TimeSaverType:\t" + this.type.name());
		}
	}

	@Override
	public ItemStack getItem(int slot) {
		return ItemStack.EMPTY;
	}

	public int getSelected() {
		return this.selected;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public ItemStack removeItem(int slot, int amount) {
		return ItemStack.EMPTY;
	}

	@Override
	public ItemStack removeItemNoUpdate(int slot) {
		return ItemStack.EMPTY;
	}

	@Override
	public void setItem(int slot, ItemStack stack) {
	}

	public void setSelected(int selected) {
		this.selected = selected;
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}
}