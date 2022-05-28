package net.hypixel.skyblock.world.items.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ForagingGroup extends CreativeModeTab {
	public static final ForagingGroup instance = new ForagingGroup(CreativeModeTab.TABS.length);

	private ForagingGroup(int index) {
		super(index, "Foraging");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Items.OAK_SAPLING);
	}
}