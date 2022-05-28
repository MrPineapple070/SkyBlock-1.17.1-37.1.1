package net.hypixel.skyblock.util;

import java.util.Objects;

import javax.annotation.Nullable;

import net.hypixel.skyblock.SkyBlock;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * This class helps read and write {@link CompoundNBT}
 *
 * @author MrPineapple070
 * @version 27 May 2020.
 */
public class TagHelper {
	/**
	 * Read {@code c}. The reverse of {@link #toNBT(Object)}
	 *
	 * @param data is the {@link CompoundNBT} to read from.
	 * @return the object read from {@code c}
	 */
	@Nullable
	public static ItemStack fromNBT(CompoundTag data) {
		Objects.requireNonNull(data, "CompoundTag cannot be null");
		switch (data.getByte("type")) {
		case 0:
			return new ItemStack(
					ForgeRegistries.ITEMS.getValue(new ResourceLocation(SkyBlock.MOD_ID, data.getString("item"))),
					data.getInt("count"));
		default:
			return null;
		}
	}

	/**
	 * Write {@link CompoundNBT} for {@link ItemStack}
	 *
	 * @param stack the {@code ItemStack} to write {@code CompoundNBT} for.
	 * @return the written {@code CompoundNBT}
	 * @throws IllegalAccessException if stack is {@link ItemStack#isEmpty()}
	 */
	public static CompoundTag writeItemStack(ItemStack stack) throws IllegalAccessException {
		Objects.requireNonNull(stack, "ItemStack cannot be null");
		if (stack.isEmpty())
			throw new IllegalAccessException("ItemStack cannot be empty");
		
		final CompoundTag data = new CompoundTag();
		data.putInt("count", stack.getCount());
		data.putString("item", stack.getItem().getRegistryName().toString());
		data.putByte("type", (byte) 0);
		return data;
	}
}