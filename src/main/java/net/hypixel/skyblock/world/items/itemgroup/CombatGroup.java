package net.hypixel.skyblock.world.items.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CombatGroup extends CreativeModeTab {
	public static final CombatGroup instance = new CombatGroup(CreativeModeTab.TABS.length);

	private CombatGroup(int index) {
		super(index, "Combat");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Items.DIAMOND_SWORD);
	}
}