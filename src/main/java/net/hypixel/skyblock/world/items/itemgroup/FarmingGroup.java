package net.hypixel.skyblock.world.items.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class FarmingGroup extends CreativeModeTab {
	public static final FarmingGroup instance = new FarmingGroup(CreativeModeTab.TABS.length);

	private FarmingGroup(int index) {
		super(index, "Farming");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Items.WHEAT);
	}
}