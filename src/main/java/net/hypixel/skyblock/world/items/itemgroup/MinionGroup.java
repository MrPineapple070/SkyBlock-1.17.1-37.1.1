package net.hypixel.skyblock.world.items.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MinionGroup extends CreativeModeTab {
	public static final MinionGroup instance = new MinionGroup(CreativeModeTab.TABS.length);

	private MinionGroup(int index) {
		super(index, "Minions");
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Items.AIR);
	}
}