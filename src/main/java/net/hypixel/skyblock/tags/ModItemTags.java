package net.hypixel.skyblock.tags;

import net.minecraft.core.Registry;
import net.minecraft.tags.StaticTagHelper;
import net.minecraft.tags.StaticTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;

public class ModItemTags {
	protected static final StaticTagHelper<Item> HELPER = StaticTags.create(Registry.ITEM_REGISTRY, "tags/items");

	public static final Tag.Named<Item> fuel = bind("fuel");
	public static final Tag.Named<Item> seller = bind("seller");
	public static final Tag.Named<Item> upgrade = bind("upgrade");

	public static Tag.Named<Item> bind(String name) {
		return HELPER.bind(name);
	}
}