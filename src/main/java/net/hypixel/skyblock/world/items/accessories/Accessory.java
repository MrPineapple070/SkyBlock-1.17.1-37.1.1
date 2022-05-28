package net.hypixel.skyblock.world.items.accessories;

import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.ReforgableItem;
import net.hypixel.skyblock.world.items.Reforge;
import net.hypixel.skyblock.world.items.UpgradableItem;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

/**
 * A Generic Accessory. <br>
 * These {@link Item} will give the player certain effects while in its
 * inventory.
 *
 * @author MrPineapple070
 * @version 18 May 2020
 * @since 21 June 2019
 */
public abstract class Accessory extends Item implements ReforgableItem, UpgradableItem {
	/**
	 * {@link Logger}
	 */
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * The {@link ModItemRarity} of this.
	 */
	@Nonnull
	protected ModItemRarity rarity;

	/**
	 * The current {@link AccessoryReforge}
	 */
	@Nullable
	protected AccessoryReforge reforge = (AccessoryReforge) Reforge.None;

	/**
	 * Determine if this is upgraded.
	 */
	protected boolean upgraded;

	protected Accessory(Properties properties, ModItemRarity rarity) {
		super(properties);
		this.rarity = Objects.requireNonNull(rarity, "Accessory rarity must be non-null");
		this.upgraded = false;
	}

	@Override
	public abstract void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag);
	
	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return false;
	}
	
	@Override
	public boolean canAttackBlock(BlockState state, Level level, BlockPos pos, Player player) {
		return false;
	}

	@Override
	public boolean canBeDepleted() {
		return false;
	}
	
	@Override
	public int getBurnTime(ItemStack stack, RecipeType<?> recipeType) {
		return 0;
	}

	@Override
	public Component getName(ItemStack stack) {
		return new TranslatableComponent(this.getOrCreateDescriptionId()).withStyle(this.rarity.color);
	}

	@Override
	public ModItemRarity getRarity() {
		return this.rarity;
	}

	@Override
	public Reforge getReforge() {
		return this.reforge;
	}
	
	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		return;
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return false;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}

	@Override
	public void reforge() {
		this.reforge = AccessoryReforge.getRandomReforge();
	}

	@Override
	public void setRarity(ModItemRarity rarity) {
		LOGGER.warn("setRarity() called");
		LOGGER.warn("Old:\t" + this.rarity.name());
		LOGGER.warn("New:\t" + rarity.name());
		this.rarity = Objects.requireNonNull(rarity, "New ModItemRarity cannot be null");
	}

	@Override
	public void setReforge(Reforge reforge) {
		this.reforge = (AccessoryReforge) reforge;
	}

	@Override
	public boolean showDurabilityBar(ItemStack stack) {
		return false;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [rarity=" + this.rarity + ", reforge=" + this.reforge + ", upgraded="
				+ this.upgraded + "]";
	}

	/**
	 * Upgrade {@link #rarity}. Each {@code Accessory} can only be upgraded once.
	 *
	 * @return {@code true} if upgrade successful.<br>
	 *         {@code false} if upgrade unsuccessful.
	 */
	@Override
	public boolean upgrade() {
		if (this.upgraded)
			return false;
		try {
			this.rarity = this.rarity.getNext();
			this.upgraded = true;
			return true;
		} catch (final IllegalStateException ise) {
			return false;
		}
	}
}