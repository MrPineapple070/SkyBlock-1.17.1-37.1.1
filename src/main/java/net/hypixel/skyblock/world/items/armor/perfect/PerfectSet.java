package net.hypixel.skyblock.world.items.armor.perfect;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.hypixel.skyblock.world.items.armor.ModArmorMaterial;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Perfect_Armor">Perfect
 * Armor</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 * @since 29 July 2020
 */
public abstract class PerfectSet extends ModArmorItem {
	public static class Perfect1 extends PerfectSet {
		public Perfect1(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect1, slot, ModItemRarity.Rare);
		}
	}

	public static class Perfect2 extends PerfectSet {
		public Perfect2(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect2, slot, ModItemRarity.Rare);
		}
	}

	public static class Perfect3 extends PerfectSet {
		public Perfect3(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect3, slot, ModItemRarity.Rare);
		}
	}

	public static class Perfect4 extends PerfectSet {
		public Perfect4(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect4, slot, ModItemRarity.Epic);
		}
	}

	public static class Perfect5 extends PerfectSet {
		public Perfect5(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect5, slot, ModItemRarity.Epic);
		}
	}

	public static class Perfect6 extends PerfectSet {
		public Perfect6(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect6, slot, ModItemRarity.Epic);
		}
	}

	public static class Perfect7 extends PerfectSet {
		public Perfect7(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect7, slot, ModItemRarity.Epic);
		}
	}

	public static class Perfect8 extends PerfectSet {
		public Perfect8(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect8, slot, ModItemRarity.Legendary);
		}
	}

	public static class Perfect9 extends PerfectSet {
		public Perfect9(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect9, slot, ModItemRarity.Legendary);
		}
	}

	public static class PerfectA extends PerfectSet {
		public PerfectA(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect10, slot, ModItemRarity.Legendary);
		}
	}

	public static class PerfectB extends PerfectSet {
		public PerfectB(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect11, slot, ModItemRarity.Legendary);
		}
	}

	public static class PerfectC extends PerfectSet {
		public PerfectC(EquipmentSlot slot) {
			super(ModArmorMaterial.Perfect12, slot, ModItemRarity.Legendary);
		}
	}

	protected PerfectSet(ModArmorMaterial material, EquipmentSlot slot, ModItemRarity rarity) {
		super(material, slot, ItemProperties.mine_1, rarity);
	}
	
	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
	}
}