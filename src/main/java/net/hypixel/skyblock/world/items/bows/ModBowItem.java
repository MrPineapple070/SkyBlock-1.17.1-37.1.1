package net.hypixel.skyblock.world.items.bows;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Objects;

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
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * Serve as a base for {@link BowItem}.
 *
 * @author MrPineapple070
 * @version 13 August 2020
 * @since 13 August 2020
 */
public abstract class ModBowItem extends BowItem implements ReforgableItem, UpgradableItem, PotatoBookableItem {
	protected static final Logger LOGGER = LogManager.getLogger();
	protected static final Component item_ability = new TranslatableComponent("bow.ability");

	/**
	 * Determine if {@link #rarity} has been changed.
	 */
	protected boolean isUpgraded;

	/**
	 * The number of {@link HotPotatoBook} applied.
	 */
	@Nonnegative
	protected int numPotatoBook;

	/**
	 * {@link ModItemRarity} of this.
	 */
	@Nonnull
	protected ModItemRarity rarity;

	/**
	 * {@link Reforge} of this.
	 */
	@Nullable
	protected Reforge reforge = Reforge.None;

	@Nonnull
	protected Component reforge_display = TextComponent.EMPTY;

	protected ModBowItem(Properties builder, ModItemRarity rarity) {
		super(builder);
		this.rarity = Objects.requireNonNull(rarity, "ModItemRarity cannot be null");
		this.isUpgraded = false;
		this.numPotatoBook = 0;
	}

	@Override
	public abstract void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag);

	@Override
	public final boolean apply() {
		if (this.numPotatoBook == 10)
			return false;
		++this.numPotatoBook;
		return true;
	}

	@Override
	public boolean canBeDepleted() {
		return false;
	}

	@Override
	public final Component getName(ItemStack stack) {
		return new TranslatableComponent(this.getOrCreateDescriptionId()).withStyle(this.rarity.color);
	}

	@Override
	public final ModItemRarity getRarity() {
		return this.rarity;
	}

	@Override
	public final Reforge getReforge() {
		return this.reforge;
	}

	@Override
	public final void reforge() {
		this.reforge = BowReforge.getRandomReforge();
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
	public final void setRarity(ModItemRarity rarity) {
		LOGGER.warn("Setting rarity:\t" + rarity.getNext());
		this.rarity = rarity;
	}

	@Override
	public final void setReforge(Reforge reforge) {
		this.reforge = reforge;
	}

	@Override
	public final boolean upgrade() {
		if (this.isUpgraded)
			return false;
		this.rarity = this.rarity.getNext();
		return true;
	}
}