package net.hypixel.skyblock.world.items.enchantment;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

/**
 * A Mod version of {@link Enchantment}
 *
 * @author MrPineapple070
 * @version 11 October 2020
 * @since 11 October 2020
 */
public abstract class ModEnchantment extends Enchantment {
	/**
	 * Primitive type array of {@link EquipmentSlot} holding all Armor
	 * {@link EquipmentSlot}
	 */
	@Nonnull
	protected static final EquipmentSlot[] armor = new EquipmentSlot[] { EquipmentSlot.HEAD,
			EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET };

	/**
	 * {@link Logger}
	 */
	@Nonnull
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * {@link ModEnchantmentType}
	 */
	protected final ModEnchantmentType type;

	protected ModEnchantment(Rarity rarity, EnchantmentCategory type, EquipmentSlot slots) {
		this(rarity, type, new EquipmentSlot[] { slots });
	}

	protected ModEnchantment(Rarity rarity, EnchantmentCategory type, EquipmentSlot... slots) {
		super(rarity, type, slots);
		this.type = null;
	}

	protected ModEnchantment(Rarity rarity, ModEnchantmentType type, EquipmentSlot... slots) {
		super(rarity, EnchantmentCategory.VANISHABLE, slots);
		this.type = type;
	}

	@Override
	protected abstract boolean checkCompatibility(Enchantment ench);

	@Override
	public abstract int getMaxLevel();

	@Override
	public final boolean isAllowedOnBooks() {
		return true;
	}
}