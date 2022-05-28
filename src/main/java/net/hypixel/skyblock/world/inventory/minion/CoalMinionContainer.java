package net.hypixel.skyblock.world.inventory.minion;

import net.hypixel.skyblock.world.inventory.init.MinionMenuTypes;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

/**
 * Serve as a base for Coal Minion Containers
 *
 * @author MrPineapple070
 * @version 24 July 2020
 * @since 17 June 2019
 */
public class CoalMinionContainer extends AbstractMinionContainer {
	public static class CoalMC1 extends CoalMinionContainer {
		public CoalMC1(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_1.get(), windowId, player, minion);
		}

		public CoalMC1(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CoalMC2 extends CoalMinionContainer {
		public CoalMC2(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_2.get(), windowId, player, minion);
		}

		public CoalMC2(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CoalMC3 extends CoalMinionContainer {
		public CoalMC3(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_3.get(), windowId, player, minion);
		}

		public CoalMC3(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CoalMC4 extends CoalMinionContainer {
		public CoalMC4(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_4.get(), windowId, player, minion);
		}

		public CoalMC4(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CoalMC5 extends CoalMinionContainer {
		public CoalMC5(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_5.get(), windowId, player, minion);
		}

		public CoalMC5(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CoalMC6 extends CoalMinionContainer {
		public CoalMC6(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_6.get(), windowId, player, minion);
		}

		public CoalMC6(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CoalMC7 extends CoalMinionContainer {
		public CoalMC7(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_7.get(), windowId, player, minion);
		}

		public CoalMC7(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CoalMC8 extends CoalMinionContainer {
		public CoalMC8(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_8.get(), windowId, player, minion);
		}

		public CoalMC8(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CoalMC9 extends CoalMinionContainer {
		public CoalMC9(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_9.get(), windowId, player, minion);
		}

		public CoalMC9(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CoalMCa extends CoalMinionContainer {
		public CoalMCa(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_a.get(), windowId, player, minion);
		}

		public CoalMCa(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CoalMCb extends CoalMinionContainer {
		public CoalMCb(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.coal_minion_b.get(), windowId, player, minion);
		}

		public CoalMCb(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	protected CoalMinionContainer(MenuType<CoalMinionContainer> container, int windowId, Inventory player,
			AbstractMinionTileEntity minion) {
		super(container, windowId, player, minion);
	}
}