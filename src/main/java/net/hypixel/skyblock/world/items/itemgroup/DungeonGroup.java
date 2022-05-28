package net.hypixel.skyblock.world.items.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DungeonGroup extends CreativeModeTab {
	public static final DungeonGroup instance = new DungeonGroup(CreativeModeTab.TABS.length);

	public DungeonGroup(int index) {
		super(index, "Dungeon");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Items.DRAGON_EGG);
	}
}