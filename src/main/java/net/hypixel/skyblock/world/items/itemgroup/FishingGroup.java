package net.hypixel.skyblock.world.items.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class FishingGroup extends CreativeModeTab {
	public static final FishingGroup instance = new FishingGroup(CreativeModeTab.TABS.length, "Fishing");

	private FishingGroup(int index, String label) {
		super(index, label);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Items.FISHING_ROD);
	}
}