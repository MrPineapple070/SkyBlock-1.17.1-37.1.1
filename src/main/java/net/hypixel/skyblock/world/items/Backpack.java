package net.hypixel.skyblock.world.items;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.init.BackpackInit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.fmllegacy.RegistryObject;

public abstract class Backpack extends Item {
	/**
	 * Enumerative type that holds sizes of {@link AbstractBackpack}.
	 * 
	 * @author MrPineapple070
	 * @version 08 September 2020
	 * @since 11 July 2019
	 */
	public static enum BackpackType {
		Small(9), Medium(18), Large(27), Greater(36), Jumbo(54);

		/**
		 * The size of this.
		 */
		@Nonnegative
		public final int size;
		
		private BackpackType(int size) {
			this.size = size;
		}
	}
	
	public static class SmallBackpack extends Backpack {
		public SmallBackpack(DyeColor color) {
			super(BackpackType.Small, color);
		}
	}
	
	public static class MediumBackpack extends Backpack {
		public MediumBackpack(DyeColor color) {
			super(BackpackType.Medium, color);
		}
	}
	
	public static class LargeBackpack extends Backpack {
		public LargeBackpack(DyeColor color) {
			super(BackpackType.Large, color);
		}
	}
	
	public static class GreaterBackpack extends Backpack {
		public GreaterBackpack(DyeColor color) {
			super(BackpackType.Greater, color);
		}
	}

	public static class JumboBackpack extends Backpack {
		public JumboBackpack(DyeColor color) {
			super(BackpackType.Greater, color);
		}
	}
	
	/**
	 * Holds all {@link DyeColor#BLACK} backpacks. 
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> black = Arrays.asList(BackpackInit.black_small_backpack,
			BackpackInit.black_medium_backpack, BackpackInit.black_large_backpack, BackpackInit.black_greater_backpack,
			BackpackInit.black_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#BLUE} backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> blue = Arrays.asList(BackpackInit.blue_small_backpack,
			BackpackInit.blue_medium_backpack, BackpackInit.blue_large_backpack, BackpackInit.blue_greater_backpack,
			BackpackInit.blue_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#BROWN} backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> brown = Arrays.asList(BackpackInit.brown_small_backpack,
			BackpackInit.brown_medium_backpack, BackpackInit.brown_large_backpack, BackpackInit.brown_greater_backpack,
			BackpackInit.brown_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#CYAN} backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> cyan = Arrays.asList(BackpackInit.cyan_small_backpack,
			BackpackInit.cyan_medium_backpack, BackpackInit.cyan_large_backpack, BackpackInit.cyan_greater_backpack,
			BackpackInit.cyan_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#GRAY} backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> gray = Arrays.asList(BackpackInit.gray_small_backpack,
			BackpackInit.gray_medium_backpack, BackpackInit.gray_large_backpack, BackpackInit.gray_greater_backpack,
			BackpackInit.gray_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#GREEN} backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> green = Arrays.asList(BackpackInit.green_small_backpack,
			BackpackInit.green_medium_backpack, BackpackInit.green_large_backpack, BackpackInit.green_greater_backpack,
			BackpackInit.green_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#LIGHT_BLUE} backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> light_blue = Arrays.asList(BackpackInit.light_blue_small_backpack,
			BackpackInit.light_blue_medium_backpack, BackpackInit.light_blue_large_backpack,
			BackpackInit.light_blue_greater_backpack, BackpackInit.light_blue_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#LIGHT_GRAY} backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> light_gray = Arrays.asList(BackpackInit.light_gray_small_backpack,
			BackpackInit.light_gray_medium_backpack, BackpackInit.light_gray_large_backpack,
			BackpackInit.light_gray_greater_backpack, BackpackInit.light_gray_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#LIME} backpack.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> lime = Arrays.asList(BackpackInit.lime_small_backpack,
			BackpackInit.lime_medium_backpack, BackpackInit.lime_large_backpack, BackpackInit.lime_greater_backpack,
			BackpackInit.lime_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#MAGENTA} backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> magenta = Arrays.asList(BackpackInit.magenta_small_backpack,
			BackpackInit.magenta_medium_backpack, BackpackInit.magenta_large_backpack,
			BackpackInit.magenta_greater_backpack, BackpackInit.magenta_jumbo_backpack);
	
	/**
	 * Holds all colorless backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> none = Arrays.asList(BackpackInit.small_backpack,
			BackpackInit.medium_backpack, BackpackInit.large_backpack, BackpackInit.greater_backpack,
			BackpackInit.jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#ORANGE} backpack.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> orange = Arrays.asList(BackpackInit.orange_small_backpack,
			BackpackInit.orange_medium_backpack, BackpackInit.orange_large_backpack,
			BackpackInit.orange_greater_backpack, BackpackInit.orange_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#PINK} backpack.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> pink = Arrays.asList(BackpackInit.pink_small_backpack,
			BackpackInit.pink_medium_backpack, BackpackInit.pink_large_backpack, BackpackInit.pink_greater_backpack,
			BackpackInit.pink_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#PURPLE} backpack.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> purple = Arrays.asList(BackpackInit.purple_small_backpack,
			BackpackInit.purple_medium_backpack, BackpackInit.purple_large_backpack,
			BackpackInit.purple_greater_backpack, BackpackInit.purple_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#RED}
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> red = Arrays.asList(BackpackInit.red_small_backpack,
			BackpackInit.red_medium_backpack, BackpackInit.red_large_backpack, BackpackInit.red_greater_backpack,
			BackpackInit.red_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#WHITE} backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> white = Arrays.asList(BackpackInit.white_small_backpack,
			BackpackInit.white_medium_backpack, BackpackInit.white_large_backpack, BackpackInit.white_greater_backpack,
			BackpackInit.white_jumbo_backpack);
	
	/**
	 * Holds all {@link DyeColor#YELLOW} backpacks.
	 */
	@Nonnull
	public static final List<RegistryObject<Item>> yellow = Arrays.asList(BackpackInit.yellow_small_backpack,
			BackpackInit.yellow_medium_backpack, BackpackInit.yellow_large_backpack,
			BackpackInit.yellow_greater_backpack, BackpackInit.yellow_jumbo_backpack);
	
	/**
	 * Retrieves an {@link ItemStack} from a {@link BackpackType} and {@link DyeColor}
	 * 
	 * @param type	{@link BackpackType}
	 * @param color	{@link DyeColor}
	 * @return {@link ItemStack}
	 */
	@Nonnull
	public static final ItemStack getBackpackStack(BackpackType type, DyeColor color) {
		return new ItemStack(getBackpack(type, color));
	}
	
	/**
	 * Retrieves an {@link Item} from a {@link BackpackType} and {@link DyeColor}
	 * 
	 * @param type	{@link BackpackType}
	 * @param color	{@link DyeColor}
	 * @return {@link Item}
	 */
	@Nonnull
	public static final Item getBackpack(BackpackType type, DyeColor color) {
		int size;
		switch (Objects.requireNonNull(type, "BackpackType cannot be null")) {
		case Small:
			size = 0;
			break;
		case Medium:
			size = 1;
			break;
		case Large:
			size = 2;
			break;
		case Greater:
			size = 3;
			break;
		case Jumbo:
			size = 4;
			break;
		default:
			throw new IllegalStateException("Illegal BackpackType:\t" + type.name());
		}

		if (color == null)
			return none.get(size).get();

		switch (color) {
		case BLACK:
			return black.get(size).get();
		case BLUE:
			return blue.get(size).get();
		case BROWN:
			return brown.get(size).get();
		case CYAN:
			return cyan.get(size).get();
		case GRAY:
			return gray.get(size).get();
		case GREEN:
			return green.get(size).get();
		case LIGHT_BLUE:
			return light_blue.get(size).get();
		case LIGHT_GRAY:
			return light_gray.get(size).get();
		case LIME:
			return lime.get(size).get();
		case MAGENTA:
			return magenta.get(size).get();
		case ORANGE:
			return orange.get(size).get();
		case PINK:
			return pink.get(size).get();
		case PURPLE:
			return purple.get(size).get();
		case RED:
			return red.get(size).get();
		case WHITE:
			return white.get(size).get();
		case YELLOW:
			return yellow.get(size).get();
		default:
			return none.get(size).get();
		}
	}

	/**
	 * Convert {@link AbstractBackpack} to {@link ItemStack}
	 * 
	 * @param backpack {@link AbstractBackpack} to convert
	 * @return {@link ItemStack} converted
	 */
	@Nonnull
	protected static final ItemStack getColoredItemStack(Backpack backpack) {
		return new ItemStack(getItem(backpack));
	}

	/**
	 * Convert {@link AbstractBackpack} to {@link Item}
	 * 
	 * @param backpack {@link AbstractBackpack} to convert
	 * @return {@link Item} converted
	 */
	@Nonnull
	protected static Item getItem(Backpack backpack) {
		return getBackpack(backpack.type, backpack.color);
	}

	/**
	 * The {@link DyeColor} of this.
	 */
	@Nullable
	public final DyeColor color;

	/**
	 * The {@link BackpackType} of this.
	 */
	@Nonnull
	public final BackpackType type;

	public Backpack(BackpackType type, @Nullable DyeColor color) {
		super(ItemProperties.miscellaneous_64);
		this.type = Objects.requireNonNull(type, "BackpackType cannot be null.");
		this.color = color;
	}

	/**
	 * @return {@link #color}
	 */
	@Nullable
	public DyeColor getColor() {
		return this.color;
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return InteractionResultHolder.pass(player.getItemInHand(hand));
	}
}