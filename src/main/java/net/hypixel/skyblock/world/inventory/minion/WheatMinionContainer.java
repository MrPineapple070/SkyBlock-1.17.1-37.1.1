package net.hypixel.skyblock.world.inventory.minion;

import net.hypixel.skyblock.world.inventory.init.MinionMenuTypes;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

public class WheatMinionContainer extends AbstractMinionContainer {
	public static class WheatMC1 extends WheatMinionContainer {
		public WheatMC1(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_1.get(), windowId, player, minion);
		}

		public WheatMC1(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class WheatMC2 extends WheatMinionContainer {
		public WheatMC2(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_2.get(), windowId, player, minion);
		}

		public WheatMC2(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class WheatMC3 extends WheatMinionContainer {
		public WheatMC3(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_3.get(), windowId, player, minion);
		}

		public WheatMC3(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class WheatMC4 extends WheatMinionContainer {
		public WheatMC4(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_4.get(), windowId, player, minion);
		}

		public WheatMC4(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class WheatMC5 extends WheatMinionContainer {
		public WheatMC5(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_5.get(), windowId, player, minion);
		}

		public WheatMC5(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class WheatMC6 extends WheatMinionContainer {
		public WheatMC6(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_6.get(), windowId, player, minion);
		}

		public WheatMC6(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class WheatMC7 extends WheatMinionContainer {
		public WheatMC7(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_7.get(), windowId, player, minion);
		}

		public WheatMC7(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class WheatMC8 extends WheatMinionContainer {
		public WheatMC8(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_8.get(), windowId, player, minion);
		}

		public WheatMC8(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class WheatMC9 extends WheatMinionContainer {
		public WheatMC9(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_9.get(), windowId, player, minion);
		}

		public WheatMC9(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class WheatMCa extends WheatMinionContainer {
		public WheatMCa(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_a.get(), windowId, player, minion);
		}

		public WheatMCa(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class WheatMCb extends WheatMinionContainer {
		public WheatMCb(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.wheat_minion_b.get(), windowId, player, minion);
		}

		public WheatMCb(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	protected WheatMinionContainer(MenuType<WheatMinionContainer> container, int id, Inventory player,
			AbstractMinionTileEntity minion) {
		super(container, id, player, minion);
	}
}