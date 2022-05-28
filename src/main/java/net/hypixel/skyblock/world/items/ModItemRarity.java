package net.hypixel.skyblock.world.items;

import java.util.Objects;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableList;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;

/**
 * A mod version of {@link net.minecraft.item.Rarity}
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public enum ModItemRarity {
	Common(ChatFormatting.WHITE, 0), Uncommon(ChatFormatting.GREEN, 1), Rare(ChatFormatting.BLUE, 2),
	Epic(ChatFormatting.DARK_PURPLE, 3), Legendary(ChatFormatting.GOLD, 4), Mythic(ChatFormatting.LIGHT_PURPLE, 5),
	Divine(ChatFormatting.AQUA, 5), Special(ChatFormatting.RED, 6), Very_Special(ChatFormatting.RED, 7);
	
	public static final Component common		= new TranslatableComponent("rarity.common").withStyle(Common.color);
	public static final Component uncommon		= new TranslatableComponent("rarity.uncommon").withStyle(Uncommon.color);
	public static final Component rare			= new TranslatableComponent("rarity.rare").withStyle(Rare.color);
	public static final Component epic			= new TranslatableComponent("rarity.epic").withStyle(Epic.color);
	public static final Component legendary		= new TranslatableComponent("rarity.legendary").withStyle(Legendary.color);
	public static final Component mythic		= new TranslatableComponent("rarity.mythic").withStyle(Mythic.color);
	public static final Component divine		= new TranslatableComponent("rarity.divine").withStyle(Divine.color);
	public static final Component special		= new TranslatableComponent("rarity.special").withStyle(Special.color);
	public static final Component very_special	= new TranslatableComponent("rarity.very_special").withStyle(Very_Special.color);

	/**
	 * A {@link ImmutableList} of {@link ModItemRarity} that are higher rarities.
	 */
	@Nonnull
	public static final ModItemRarity[] high = new ModItemRarity[] { Epic, Legendary, Mythic };

	/**
	 * A {@link ImmutableList} of {@link ModItemRarity} that are lower rarities.
	 */
	@Nonnull
	public static final ModItemRarity[] low = new ModItemRarity[] { Common, Uncommon, Rare };

	/**
	 * A {@link ImmutableList} of {@link ModItemRarity} that are only obtained
	 * through artificial means.
	 */
	@Nonnull
	public static final ModItemRarity[] artificial = new ModItemRarity[] { Divine, Special, Very_Special };

	/**
	 * The {@link ChatFormatting} of this {@code ModItemRarity}
	 */
	@Nonnull
	public final ChatFormatting color;
	
	/**
	 * This number should be identical to {@link #ordinal()}
	 */
	public final int rank;

	private ModItemRarity(ChatFormatting color, int rank) {
		this.color = Objects.requireNonNull(color, "ChatFormatting cannot be null");
		this.rank = rank;
	}

	/**
	 * Determines the next tier of {@link ModItemRarity}
	 *
	 * @return the next {@code ModItemRarity}.
	 */
	public ModItemRarity getNext() {
		switch (this) {
		case Common:
			return Uncommon;
		case Uncommon:
			return Rare;
		case Rare:
			return Epic;
		case Epic:
			return Legendary;
		case Legendary:
			return Mythic;
		case Mythic:
			return Divine;
		case Special:
			return Very_Special;
		default:
			throw new IllegalStateException(this.name() + " does not have an upgrade.");
		}
	}
	
	/**
	 * Determines the previous tier of {@link ModItemRarity}
	 * 
	 * @return the previous {@link ModItemRarity}
	 */
	public ModItemRarity getPrevious() {
		switch (this) {
		case Uncommon:
			return Common;
		case Rare:
			return Uncommon;
		case Epic:
			return Rare;
		case Legendary:
			return Epic;
		case Mythic:
			return Legendary;
		case Divine:
			return Mythic;
		case Very_Special:
			return Special;
		default:
			throw new IllegalStateException(this.name() + " does not have a previous.");
		}
	}
}