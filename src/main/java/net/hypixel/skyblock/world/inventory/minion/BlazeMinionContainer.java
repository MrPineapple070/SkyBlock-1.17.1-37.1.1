package net.hypixel.skyblock.world.inventory.minion;

import net.hypixel.skyblock.world.inventory.init.MinionMenuTypes;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

public class BlazeMinionContainer extends AbstractMinionContainer {
	public static class BlazeMC1 extends BlazeMinionContainer {
		public BlazeMC1(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_1.get(), id, inventory, minion);
		}

		public BlazeMC1(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	public static class BlazeMC2 extends BlazeMinionContainer {
		public BlazeMC2(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_2.get(), id, inventory, minion);
		}

		public BlazeMC2(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	public static class BlazeMC3 extends BlazeMinionContainer {
		public BlazeMC3(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_3.get(), id, inventory, minion);
		}

		public BlazeMC3(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	public static class BlazeMC4 extends BlazeMinionContainer {
		public BlazeMC4(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_4.get(), id, inventory, minion);
		}

		public BlazeMC4(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	public static class BlazeMC5 extends BlazeMinionContainer {
		public BlazeMC5(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_5.get(), id, inventory, minion);
		}

		public BlazeMC5(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	public static class BlazeMC6 extends BlazeMinionContainer {
		public BlazeMC6(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_6.get(), id, inventory, minion);
		}

		public BlazeMC6(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	public static class BlazeMC7 extends BlazeMinionContainer {
		public BlazeMC7(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_7.get(), id, inventory, minion);
		}

		public BlazeMC7(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	public static class BlazeMC8 extends BlazeMinionContainer {
		public BlazeMC8(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_8.get(), id, inventory, minion);
		}

		public BlazeMC8(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	public static class BlazeMC9 extends BlazeMinionContainer {
		public BlazeMC9(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_9.get(), id, inventory, minion);
		}

		public BlazeMC9(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	public static class BlazeMCa extends BlazeMinionContainer {
		public BlazeMCa(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_a.get(), id, inventory, minion);
		}

		public BlazeMCa(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	public static class BlazeMCb extends BlazeMinionContainer {
		public BlazeMCb(int id, Inventory inventory, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.blaze_minion_b.get(), id, inventory, minion);
		}

		public BlazeMCb(int id, Inventory inventory, FriendlyByteBuf data) {
			this(id, inventory, getBlockEntity(inventory, data));
		}
	}

	protected BlazeMinionContainer(MenuType<? extends AbstractMinionContainer> container, int id, Inventory inventory,
			AbstractMinionTileEntity minion) {
		super(container, id, inventory, minion);
	}
}