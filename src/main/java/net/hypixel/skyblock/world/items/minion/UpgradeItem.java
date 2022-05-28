package net.hypixel.skyblock.world.items.minion;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class UpgradeItem extends Item {
	public UpgradeItem(Properties properties) {
		super(properties);
	}

	@Override
	public boolean isFoil(ItemStack stack) {
		return true;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
