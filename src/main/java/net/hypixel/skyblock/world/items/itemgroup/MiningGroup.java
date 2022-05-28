package net.hypixel.skyblock.world.items.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MiningGroup extends CreativeModeTab {
	public static final MiningGroup instance = new MiningGroup(CreativeModeTab.TABS.length);

	private MiningGroup(int index) {
		super(index, "Mining");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Items.DIAMOND_PICKAXE);
	}
}