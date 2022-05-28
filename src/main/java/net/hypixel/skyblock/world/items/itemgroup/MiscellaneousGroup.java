package net.hypixel.skyblock.world.items.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MiscellaneousGroup extends CreativeModeTab {
	public static final MiscellaneousGroup instance = new MiscellaneousGroup(CreativeModeTab.TABS.length);

	public MiscellaneousGroup(int index) {
		super(index, "Miscellaneous");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Items.BEACON);
	}
}