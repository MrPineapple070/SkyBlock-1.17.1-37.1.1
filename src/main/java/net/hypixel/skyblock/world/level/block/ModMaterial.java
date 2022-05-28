package net.hypixel.skyblock.world.level.block;

import javax.annotation.Nonnull;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.PushReaction;

/**
 * Holds more {@link Material}.
 * 
 * @author MrPineapple070
 * @version 16 August 2021
 * @since 11 July 2019
 */
public class ModMaterial {
	/**
	 * Gemstone {@link Material}
	 */
	@Nonnull
	public static final Material Gemstone = new Material(MaterialColor.NONE, false, true, true, false, false, false,
			PushReaction.IGNORE);
}