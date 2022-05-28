package net.hypixel.skyblock.world.items.armor;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.PotatoBookableItem;
import net.hypixel.skyblock.world.items.ReforgableItem;
import net.hypixel.skyblock.world.items.Reforge;
import net.hypixel.skyblock.world.items.UpgradableItem;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * Mod version of {@link ArmorItem}<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Armor">All Armor</a>
 *
 * @author MrPineapple070
 * @version 7 July 2020
 * @since 11 June 2019
 */
public abstract class ModArmorItem extends ArmorItem implements ReforgableItem, PotatoBookableItem, UpgradableItem {
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * Determine if {@link #rarity} has been upgraded.
	 */
	protected boolean isUpgraded;

	/**
	 * The number of applied {@link HotPotatoBook}
	 */
	@Nonnegative
	protected int numPotatoBooks;

	/**
	 * The {@link ModItemRarity} of this.
	 */
	@Nonnull
	protected ModItemRarity rarity;

	/**
	 * The current {@link ArmorReforge}
	 */
	@Nullable
	protected ArmorReforge reforge = (ArmorReforge) Reforge.None;

	protected Component reforge_display = new TextComponent("");

	/**
	 * Construct this.
	 *
	 * @param material {@link ModArmorMaterial} of this.
	 * @param slot       {@link EquipmentSlot} of this.
	 * @param builder    {@link Properties} of this.
	 * @param rarity     {@link ModItemRarity} of this.
	 */
	protected ModArmorItem(ModArmorMaterial material, EquipmentSlot slot, Properties builder,
			ModItemRarity rarity) {
		super(material, slot, builder);
		this.rarity = Objects.requireNonNull(rarity, "Armor must have a rarity.");
		this.isUpgraded = false;
		this.numPotatoBooks = 0;
	}

	@Override
	public abstract void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag);

	@Override
	public boolean apply() {
		if (this.numPotatoBooks == 10)
			return false;
		++this.numPotatoBooks;
		return true;
	}

	@Override
	public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
		return super.damageItem(stack, 0, entity, onBroken);
	}

	@Override
	public Component getName(ItemStack stack) {
		MutableComponent rd = this.reforge_display.copy();
		Component dp = super.getName(stack).copy();
		if (this.material == ModArmorMaterial.Wise && this.reforge == ArmorReforge.Wise)
			rd = new TextComponent("Very");
		else if (this.material == ModArmorMaterial.Strong && this.reforge == ArmorReforge.Strong)
			rd = new TextComponent("Very");
		else if (this.material == ModArmorMaterial.Superior && this.reforge == ArmorReforge.Superior)
			rd = new TextComponent("Highly");
		else if (this.material == ModArmorMaterial.Heavy) {
			if (this.reforge == ArmorReforge.Heavy)
				rd = new TextComponent("Extremly");
			else if (this.reforge == ArmorReforge.Light)
				rd = new TextComponent("Not So");
		} else if (ModArmorMaterial.isPerfect(this.material) && this.reforge == ArmorReforge.Perfect)
			rd = new TextComponent("Absolutely");
		return (rd.append(dp)).withStyle(this.rarity.color);
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
	public boolean canBeDepleted() {
		return false;
	}

	@Override
	public void reforge() {
		this.reforge = ArmorReforge.getRandomReforge();
		try {
			this.reforge_display = new TextComponent(
					this.reforge.getClass().getMethod("name", (Class<?>[]) null).invoke(this.reforge) + "");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			LOGGER.error(e.getLocalizedMessage());
			for (StackTraceElement element : e.getStackTrace())
				LOGGER.error(element.toString());
		}
	}

	@Override
	public void setRarity(ModItemRarity rarity) {
		LOGGER.warn("setRarity() method called.");
		this.rarity = Objects.requireNonNull(rarity, "New ModItemRarity cannot be null.");
	}

	@Override
	public void setReforge(Reforge reforge) {
		this.reforge = (ArmorReforge) reforge;
		try {
			this.reforge_display = new TextComponent(
					this.reforge.getClass().getMethod("name", (Class<?>[]) null).invoke(this.reforge) + "");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			LOGGER.error(e.getLocalizedMessage());
			for (StackTraceElement element : e.getStackTrace())
				LOGGER.error(element.toString());
		}
	}

	@Override
	public boolean upgrade() {
		if (this.isUpgraded)
			return false;
		try {
			this.rarity = this.rarity.getNext();
			this.isUpgraded = true;
			return true;
		} catch (final IllegalStateException ise) {
			LOGGER.error(ise.getMessage());
			return false;
		}
	}
}