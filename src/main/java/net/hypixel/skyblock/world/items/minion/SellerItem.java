package net.hypixel.skyblock.world.items.minion;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

/**
 * Seller Items for Minions
 *
 * @author mrPineapple
 * @version 22 June 2020
 */
public class SellerItem extends Item {
	/**
	 * Construct {@code this}
	 *
	 * @param properties {@link Properties}
	 */
	public SellerItem(Properties properties) {
		super(properties);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return false;
	}

	@Override
	public boolean isFoil(ItemStack stack) {
		return true;
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return false;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
}
