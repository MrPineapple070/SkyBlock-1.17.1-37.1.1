package net.hypixel.skyblock.world.inventory.minion;

import net.hypixel.skyblock.world.inventory.init.MinionMenuTypes;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

public class BirchMinionContainer extends AbstractMinionContainer {
	public static class BirchMC1 extends BirchMinionContainer {
		public BirchMC1(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_1.get(), windowId, player, minion);
		}

		public BirchMC1(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class BirchMC2 extends BirchMinionContainer {
		public BirchMC2(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_2.get(), windowId, player, minion);
		}

		public BirchMC2(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class BirchMC3 extends BirchMinionContainer {
		public BirchMC3(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_3.get(), windowId, player, minion);
		}

		public BirchMC3(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class BirchMC4 extends BirchMinionContainer {
		public BirchMC4(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_4.get(), windowId, player, minion);
		}

		public BirchMC4(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class BirchMC5 extends BirchMinionContainer {
		public BirchMC5(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_5.get(), windowId, player, minion);
		}

		public BirchMC5(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class BirchMC6 extends BirchMinionContainer {
		public BirchMC6(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_6.get(), windowId, player, minion);
		}

		public BirchMC6(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class BirchMC7 extends BirchMinionContainer {
		public BirchMC7(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_7.get(), windowId, player, minion);
		}

		public BirchMC7(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class BirchMC8 extends BirchMinionContainer {
		public BirchMC8(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_8.get(), windowId, player, minion);
		}

		public BirchMC8(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class BirchMC9 extends BirchMinionContainer {
		public BirchMC9(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_9.get(), windowId, player, minion);
		}

		public BirchMC9(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class BirchMCa extends BirchMinionContainer {
		public BirchMCa(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_a.get(), windowId, player, minion);
		}

		public BirchMCa(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class BirchMCb extends BirchMinionContainer {
		public BirchMCb(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.birch_minion_b.get(), windowId, player, minion);
		}

		public BirchMCb(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public BirchMinionContainer(MenuType<? extends AbstractMinionContainer> type, int windowId, Inventory player,
			AbstractMinionTileEntity tileEntity) {
		super(type, windowId, player, tileEntity);
	}
}