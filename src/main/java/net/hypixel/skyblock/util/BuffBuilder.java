package net.hypixel.skyblock.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableList;

import net.hypixel.skyblock.world.items.armor.FullSetInformation;
import net.minecraft.network.chat.Component;

public class BuffBuilder {
	/**
	 * {@link ImmutableList} of {@link String} holding all buffs. Order of this list<br>
	 * is Health, Defense, True Defense, Strength, Speed, Crit Change, Crit Damage,
	 * Intelligence, Mining Speed, Sea Creature Chance, Magic Find, Pet Luck,
	 * Ability Damage, Ferocity, Mining Fortune, Mining Speed, Foraging Fortune
	 */
	public static final ImmutableList<Component> buff = ImmutableList.copyOf(Arrays.asList(StatString.health,
			StatString.defense, StatString.true_def, StatString.strength, StatString.speed, StatString.crit_chance,
			StatString.crit_damage, StatString.intelligence, StatString.mining_speed, StatString.sea_creature_chance,
			StatString.magic_find, StatString.pet_luck, StatString.ability_damage, StatString.ferocity,
			StatString.mining_fortune, StatString.farming_fortune, StatString.foraging_fortune));
	
	/**
	 * Creates a buff {@link Map}
	 * 
	 * @param buff a list of doubles with the strength of the buff.
	 * @param stat a list of {@link String} with buffs to increase.
	 * @return {@link Map} from {@link String} to {@link Double}
	 */
	public static final Map<String, Double> createBuffArray(double[] buff, String[] stat) {
		HashMap<String, Double> temp = new HashMap<>();

		if (buff.length > BuffBuilder.buff.size())
			throw new IllegalStateException(
					"Expected less than " + BuffBuilder.buff.size() + " elements, got " + buff.length);
		if (buff.length != stat.length)
			throw new IllegalStateException("Buff and index arrays must be the same length");

		for (int i = 0; i < buff.length; ++i)
			temp.put(stat[i], Double.valueOf(buff[i]));

		return temp;
	}
	
	public static final String health() {
		return StatString.health.getString();
	}
	
	public static final String defense() {
		return StatString.defense.getString();
	}
	
	public static final String true_def() {
		return StatString.true_def.getString();
	}
	
	public static final String strength() {
		return StatString.strength.getString();
	}
	
	public static final String speed() {
		return StatString.speed.getString();
	}
	
	public static final String crit_chance() {
		return StatString.crit_chance.getString();
	}
	
	public static final String crit_damage() {
		return StatString.crit_damage.getString();
	}
	
	public static final String intelligence() {
		return StatString.intelligence.getString();
	}
	
	public static final String mining_speed() {
		return StatString.mining_speed.getString();
	}
	
	public static final String scc() {
		return StatString.sea_creature_chance.getString();
	}
	
	public static final String magic_find() {
		return StatString.magic_find.getString();
	}
	
	public static final String pet_luck() {
		return StatString.pet_luck.getString();
	}
	
	public static final String ability_damage() {
		return StatString.ability_damage.getString();
	}
	
	public static final String ferocity() {
		return StatString.ferocity.getString();
	}
	
	public static final String mining_fortune() {
		return StatString.mining_fortune.getString();
	}
	
	public static final String farming_fortune() {
		return StatString.farming_fortune.getString();
	}
	
	public static final String foraging_fortune() {
		return StatString.foraging_fortune.getString();
	}
	
	/**
	 * Gets the actual {@link String} of the buff
	 * 
	 * @param index index into {@link FullSetInformation#buff}
	 * @return {@link String} of buff
	 */
	public static final String getStatString(int index) {
		return buff.get(index).getString();
	}
}