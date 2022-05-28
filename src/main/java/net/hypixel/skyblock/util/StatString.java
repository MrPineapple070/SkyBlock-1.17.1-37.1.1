package net.hypixel.skyblock.util;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;

/**
 * Holds commonly used {@link String} and {@link TranslatableComponent}
 * 
 * @author MrPineapple070
 * @version 12 March 2021
 * @since 11 July 2019
 */
@Immutable
public final class StatString {
	@Nonnull
	public static final MutableComponent attack_speed = new TranslatableComponent("stat.attack_speed")
			.withStyle(ChatFormatting.YELLOW);
	
	@Nonnull
	public static final MutableComponent ability_damage = new TranslatableComponent("stat.ability_damage")
			.withStyle(ChatFormatting.RED);
	
	@Nonnull
	public static final MutableComponent breaking_power = new TranslatableComponent("stat.breaking_power")
			.withStyle(ChatFormatting.GRAY);
	
	@Nonnull
	public static final String complete = FormatingCodes.green + SpecialCharacters.complete + FormatingCodes.reset;
	
	@Nonnull
	public static final MutableComponent crit_chance = new TranslatableComponent("stat.crit_chance")
			.withStyle(ChatFormatting.BLUE);
	
	@Nonnull
	public static final MutableComponent crit_damage = new TranslatableComponent("stat.crit_damage")
			.withStyle(ChatFormatting.BLUE);
	
	@Nonnull
	public static final String day = FormatingCodes.yellow + SpecialCharacters.day + FormatingCodes.reset;
	
	@Nonnull
	public static final MutableComponent defense = new TranslatableComponent("stat.defense")
			.withStyle(ChatFormatting.GREEN);
	
	@Nonnull
	public static final String dungeon_star_1 = "\u00A76\u272a\u00A7r";
	
	@Nonnull
	public static final String dungeon_star_2 = "\u00A76\u272a\u272a\u00A7r";
	
	@Nonnull
	public static final String dungeon_star_3 = "\u00A76\u272a\u272a\u272a\u00A7r";
	
	@Nonnull
	public static final String dungeon_star_4 = "\u00A76\u272a\u272a\u272a\u272a\u00A7r";
	
	@Nonnull
	public static final String dungeon_star_5 = "\u00A76\u272a\u272a\u272a\u272a\u272a\u00A7r";
	
	@Nonnull
	public static final MutableComponent farming_fortune = new TranslatableComponent("stat.farming_fortune")
			.withStyle(ChatFormatting.GOLD);
	
	@Nonnull
	public static final MutableComponent ferocity = new TranslatableComponent("stat.ferocity")
			.withStyle(ChatFormatting.RED);
	
	@Nonnull
	public static final MutableComponent fishing_speed = new TranslatableComponent("stat.fishing_speed")
			.withStyle(ChatFormatting.GREEN);
	
	@Nonnull
	public static final MutableComponent foraging_fortune = new TranslatableComponent("stat.foraging_fortune")
			.withStyle(ChatFormatting.GOLD);
	
	@Nonnull
	public static final MutableComponent health = new TranslatableComponent("stat.health")
			.withStyle(ChatFormatting.RED);
	
	@Nonnull
	public static final String incomplete = FormatingCodes.red + SpecialCharacters.incomplete + FormatingCodes.reset;
	
	@Nonnull
	public static final MutableComponent intelligence = new TranslatableComponent("stat.intelligence")
			.withStyle(ChatFormatting.AQUA);
	
	@Nonnull
	public static final String level_up = FormatingCodes.dark_gray + SpecialCharacters.level_up;
	
	@Nonnull
	public static final MutableComponent magic_find = new TranslatableComponent("stat.magic_find")
			.withStyle(ChatFormatting.AQUA);
	
	@Nonnull
	public static final MutableComponent mana = new TranslatableComponent("stat.mana").withStyle(ChatFormatting.AQUA);
	
	@Nonnull
	public static final MutableComponent mining_fortune = new TranslatableComponent("stat.mining_fortune")
			.withStyle(ChatFormatting.GOLD);
	
	@Nonnull
	public static final MutableComponent mining_speed = new TranslatableComponent("stat.mining_speed")
			.withStyle(ChatFormatting.YELLOW);
	
	@Nonnull
	public static final String night = FormatingCodes.aqua + SpecialCharacters.night + FormatingCodes.reset;
	
	@Nonnull
	public static final MutableComponent pet_luck = new TranslatableComponent("stat.pet_luck")
			.withStyle(ChatFormatting.LIGHT_PURPLE);
	
	@Nonnull
	public static final String reqirement_slayer = FormatingCodes.dark_red + SpecialCharacters.requirement_slayer
			+ " Required" + FormatingCodes.reset;
	
	@Nonnull
	public static final String requirement = FormatingCodes.dark_red + SpecialCharacters.requirement + " Required"
			+ FormatingCodes.reset;
	
	@Nonnull
	public static final MutableComponent sea_creature_chance = new TranslatableComponent("stat.sea_creature_chance")
			.withStyle(ChatFormatting.DARK_AQUA);
	
	@Nonnull
	public static final MutableComponent speed = new TranslatableComponent("stat.speed")
			.withStyle(ChatFormatting.WHITE);
	
	@Nonnull
	public static final MutableComponent strength = new TranslatableComponent("stat.strength")
			.withStyle(ChatFormatting.RED);
	
	@Nonnull
	public static final String ticker = FormatingCodes.yellow + "%d " + SpecialCharacters.ticker;
	
	@Nonnull
	public static final MutableComponent true_def = new TranslatableComponent("stat.true_defense")
			.withStyle(ChatFormatting.WHITE);
	
	@Nonnull
	public static final String powder = "\u1805";
}