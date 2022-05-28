package net.hypixel.skyblock.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

/**
 * A class to create {@link MobEffect} for this Mod.
 *
 * @author MrPineapple070
 * @version 16 May 2020
 */
public class ModMobEffect extends MobEffect {
	public ModMobEffect(MobEffectCategory typeIn, int liquidColorIn) {
		super(typeIn, liquidColorIn);
	}
}