package net.hypixel.skyblock.world.items.enchantment;

import java.util.function.Predicate;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.item.Wearable;
import net.minecraftforge.common.IExtensibleEnum;

public enum ModEnchantmentType implements IExtensibleEnum {
	PICKAXE {
		public boolean canEnchant(Item item) {
			return item instanceof PickaxeItem;
		}
	},
	SHOVEL {
		public boolean canEnchant(Item item) {
			return item instanceof ShovelItem;
		}
	},
	AXE {
		public boolean canEnchant(Item item) {
			return item instanceof AxeItem;
		}
	},
	HOE {
		public boolean canEnchant(Item item) {
			return item instanceof HoeItem;
		}
	},
	AXE_HOE {
		public boolean canEnchant(Item item) {
			return item instanceof HoeItem || item instanceof AxeItem;
		}
	},
	WEAPON {
		public boolean canEnchant(Item item) {
			return item instanceof SwordItem || item instanceof BowItem;
		}
	},
	NONARMOR {
		public boolean canEnchant(Item item) {
			return item instanceof Vanishable && ! (item instanceof Wearable);
		}
	}
	;

	public static ModEnchantmentType create(String name, Predicate<Item> delegate) {
		throw new IllegalStateException("Enum not extended");
	}

	/**
	 * {@link Predicate} of {@link Item} to test is this can enchant an {@link Item}.
	 */
	private Predicate<Item> delegate;

	private ModEnchantmentType() {
	}

	private ModEnchantmentType(Predicate<Item> delegate) {
		this.delegate = delegate;
	}

	public boolean canEnchant(Item item) {
		return this.delegate.test(item);
	}
}