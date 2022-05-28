package net.hypixel.skyblock.world.items;

import java.util.Random;

import javax.annotation.Nonnull;

/**
 * An interface to serve as the base for all Reforges.
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Reforging">All Reforges</a>
 *
 * @author MrPineapple070
 * @version 7 July 2020
 * @since 11 June 2019
 */
public interface Reforge {
	/**
	 * When the current Item has no {@code Reforge}
	 */
	public static final Reforge None = null;
	
	/**
	 * {@link Random}
	 */
	public static final Random rand = new Random();

	/**
	 * @return The array for {@link ModItemRarity#Common}
	 */
	@Nonnull
	public double[] common();

	/**
	 * @return The array for {@link ModItemRarity#Epic}
	 */
	@Nonnull
	public double[] epic();

	/**
	 * @return The array for {@link ModItemRarity#Legendary}
	 */
	@Nonnull
	public double[] legendary();

	/**
	 * @return The array for {@link ModItemRarity#Rare}
	 */
	@Nonnull
	public double[] rare();
	
	/**
	 * @return The array for {@link ModItemRarity#Uncommon}
	 */
	@Nonnull
	public double[] uncommon();
}