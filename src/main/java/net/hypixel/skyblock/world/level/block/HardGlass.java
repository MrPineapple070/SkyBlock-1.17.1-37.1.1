package net.hypixel.skyblock.world.level.block;

import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class HardGlass extends AbstractGlassBlock {
	public HardGlass() {
		super(Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion());
	}
}