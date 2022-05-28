package net.hypixel.skyblock.world.inventory.minion;

import net.hypixel.skyblock.world.inventory.init.MinionMenuTypes;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

public class AcaciaMinionContainer extends AbstractMinionContainer {
	public static class AcaciaMC1 extends AcaciaMinionContainer {
		public AcaciaMC1(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_1.get(), windowId, player, minion);
		}

		public AcaciaMC1(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class AcaciaMC2 extends AcaciaMinionContainer {
		public AcaciaMC2(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_2.get(), windowId, player, minion);
		}

		public AcaciaMC2(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class AcaciaMC3 extends AcaciaMinionContainer {
		public AcaciaMC3(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_3.get(), windowId, player, minion);
		}

		public AcaciaMC3(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class AcaciaMC4 extends AcaciaMinionContainer {
		public AcaciaMC4(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_4.get(), windowId, player, minion);
		}

		public AcaciaMC4(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class AcaciaMC5 extends AcaciaMinionContainer {
		public AcaciaMC5(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_5.get(), windowId, player, minion);
		}

		public AcaciaMC5(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class AcaciaMC6 extends AcaciaMinionContainer {
		public AcaciaMC6(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_6.get(), windowId, player, minion);
		}

		public AcaciaMC6(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class AcaciaMC7 extends AcaciaMinionContainer {
		public AcaciaMC7(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_7.get(), windowId, player, minion);
		}

		public AcaciaMC7(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class AcaciaMC8 extends AcaciaMinionContainer {
		public AcaciaMC8(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_8.get(), windowId, player, minion);
		}

		public AcaciaMC8(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class AcaciaMC9 extends AcaciaMinionContainer {
		public AcaciaMC9(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_9.get(), windowId, player, minion);
		}

		public AcaciaMC9(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class AcaciaMCa extends AcaciaMinionContainer {
		public AcaciaMCa(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_a.get(), windowId, player, minion);
		}

		public AcaciaMCa(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class AcaciaMCb extends AcaciaMinionContainer {
		public AcaciaMCb(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.acacia_minion_b.get(), windowId, player, minion);
		}

		public AcaciaMCb(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	protected AcaciaMinionContainer(MenuType<AcaciaMinionContainer> type, int id, Inventory player,
			AbstractMinionTileEntity minion) {
		super(type, id, player, minion);
	}
}