package net.hypixel.skyblock.world.items.minion;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;

/**
 * This class handles Minion Fuel.
 *
 * @author mrPineapple
 * @version 22 June 2020
 */
public class MinionFuelItem extends Item {
	/**
	 * The number of ticks this will be effective for.<br>
	 * This can be -1 if this will last forever.
	 */
	private final int burnTime;

	/**
	 * The amount this will speed up the minion.
	 */
	private final double speed;

	/**
	 * Constructor
	 * 
	 * @param properties {@link Properties}
	 * @param burnTime   in ticks
	 * @param speed      percentage
	 */
	public MinionFuelItem(Properties properties, int burnTime, double speed) {
		super(properties);
		if (burnTime < -1)
			throw new IllegalArgumentException("Illegal burn time: " + burnTime);
		this.burnTime = burnTime;
		if (speed <= 0d)
			throw new IllegalArgumentException("Illegal speed: " + speed);
		this.speed = speed;
	}

	public int getBurnTime() {
		return this.burnTime;
	}

	public double getSpeed() {
		return this.speed;
	}
}