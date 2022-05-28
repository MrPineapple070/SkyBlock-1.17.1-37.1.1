package net.hypixel.skyblock.world.items.enchanted_items;

import net.hypixel.skyblock.world.items.minion.MinionFuelItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

/**
 * Help give the Enchantment Glint to MinionFuel.
 *
 * @author MrPineapple070
 * @version 22 June 2020
 */
public class EnchantedFuelItem extends MinionFuelItem {
	/**
	 * Construct {@code this}
	 *
	 * @param properties {@link Properties}
	 * @param burnTime   burn time in ticks.
	 * @param fuelSpeed  the amount this will reduce off of Minion.
	 */
	public EnchantedFuelItem(Properties properties, int burnTime, double fuelSpeed) {
		super(properties, burnTime, fuelSpeed);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return false;
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
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