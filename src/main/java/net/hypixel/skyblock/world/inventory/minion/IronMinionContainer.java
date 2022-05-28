package net.hypixel.skyblock.world.inventory.minion;

import net.hypixel.skyblock.world.inventory.init.MinionMenuTypes;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

public class IronMinionContainer extends AbstractMinionContainer {
	public static class IronMC1 extends IronMinionContainer {
		public IronMC1(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_1.get(), windowId, player, minion);
		}

		public IronMC1(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class IronMC2 extends IronMinionContainer {
		public IronMC2(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_2.get(), windowId, player, minion);
		}

		public IronMC2(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class IronMC3 extends IronMinionContainer {
		public IronMC3(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_3.get(), windowId, player, minion);
		}

		public IronMC3(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class IronMC4 extends IronMinionContainer {
		public IronMC4(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_4.get(), windowId, player, minion);
		}

		public IronMC4(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class IronMC5 extends IronMinionContainer {
		public IronMC5(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_5.get(), windowId, player, minion);
		}

		public IronMC5(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class IronMC6 extends IronMinionContainer {
		public IronMC6(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_6.get(), windowId, player, minion);
		}

		public IronMC6(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class IronMC7 extends IronMinionContainer {
		public IronMC7(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_7.get(), windowId, player, minion);
		}

		public IronMC7(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class IronMC8 extends IronMinionContainer {
		public IronMC8(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_8.get(), windowId, player, minion);
		}

		public IronMC8(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class IronMC9 extends IronMinionContainer {
		public IronMC9(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_9.get(), windowId, player, minion);
		}

		public IronMC9(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class IronMCa extends IronMinionContainer {
		public IronMCa(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_a.get(), windowId, player, minion);
		}

		public IronMCa(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class IronMCb extends IronMinionContainer {
		public IronMCb(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.iron_minion_b.get(), windowId, player, minion);
		}

		public IronMCb(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	protected IronMinionContainer(MenuType<IronMinionContainer> type, int windowId, Inventory player,
			AbstractMinionTileEntity tileEntity) {
		super(type, windowId, player, tileEntity);
	}
}