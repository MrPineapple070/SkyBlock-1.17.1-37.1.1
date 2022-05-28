package net.hypixel.skyblock.world.inventory.minion;

import net.hypixel.skyblock.world.inventory.init.MinionMenuTypes;
import net.hypixel.skyblock.world.level.block.entity.minion.AbstractMinionTileEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

/**
 * Serve as the basis for all 11 tiers of CobbleMinionContainer.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class CobbleMinionContainer extends AbstractMinionContainer {
	public static class CobbleMC1 extends CobbleMinionContainer {
		public CobbleMC1(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_1.get(), windowId, player, minion);
		}

		public CobbleMC1(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CobbleMC2 extends CobbleMinionContainer {
		public CobbleMC2(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_2.get(), windowId, player, minion);
		}

		public CobbleMC2(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CobbleMC3 extends CobbleMinionContainer {
		public CobbleMC3(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_3.get(), windowId, player, minion);
		}

		public CobbleMC3(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CobbleMC4 extends CobbleMinionContainer {
		public CobbleMC4(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_4.get(), windowId, player, minion);
		}

		public CobbleMC4(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CobbleMC5 extends CobbleMinionContainer {
		public CobbleMC5(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_5.get(), windowId, player, minion);
		}

		public CobbleMC5(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CobbleMC6 extends CobbleMinionContainer {
		public CobbleMC6(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_6.get(), windowId, player, minion);
		}

		public CobbleMC6(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CobbleMC7 extends CobbleMinionContainer {
		public CobbleMC7(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_7.get(), windowId, player, minion);
		}

		public CobbleMC7(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CobbleMC8 extends CobbleMinionContainer {
		public CobbleMC8(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_8.get(), windowId, player, minion);
		}

		public CobbleMC8(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CobbleMC9 extends CobbleMinionContainer {
		public CobbleMC9(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_9.get(), windowId, player, minion);
		}

		public CobbleMC9(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CobbleMCa extends CobbleMinionContainer {
		public CobbleMCa(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_a.get(), windowId, player, minion);
		}

		public CobbleMCa(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	public static class CobbleMCb extends CobbleMinionContainer {
		public CobbleMCb(int windowId, Inventory player, AbstractMinionTileEntity minion) {
			super(MinionMenuTypes.cobblestone_minion_b.get(), windowId, player, minion);
		}

		public CobbleMCb(int windowId, Inventory player, FriendlyByteBuf data) {
			this(windowId, player, getBlockEntity(player, data));
		}
	}

	protected CobbleMinionContainer(MenuType<CobbleMinionContainer> container, int windowId, Inventory player,
			AbstractMinionTileEntity minion) {
		super(container, windowId, player, minion);
	}
}