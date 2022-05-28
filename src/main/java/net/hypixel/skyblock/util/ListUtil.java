package net.hypixel.skyblock.util;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * Utilities for {@link List}.<br>
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
@Immutable
public final class ListUtil {
	/**
	 *  Directly reference a log4j {@link Logger}.
	 */
	private static final Logger LOGGER = LogManager.getLogger();
	
	/**
	 * Reads {@link Ingredient} from a {@link JsonArray}
	 *
	 * @param json_array {@link JsonArray} to read from
	 * @return {@link NonNullList} of {@link Ingredient} read.
	 */
	public static final NonNullList<Ingredient> readIngredients(JsonArray json_array) {
		Objects.requireNonNull(json_array, "JsonArray cannot be null");
		LOGGER.info("JsonArray:\t" + json_array.toString());
		final NonNullList<Ingredient> ingredients = NonNullList.create();
		for (final JsonElement json : json_array) {
			final Ingredient ingredient = Ingredient.fromJson(json);
			if (!ingredient.isEmpty())
				ingredients.add(ingredient);
		}
		return ingredients;
	}

	public static final NonNullList<ItemStack> readItemStacks(JsonArray json_array) {
		Objects.requireNonNull(json_array, "JsonArray cannot be null");
		LOGGER.debug("JsonArray:\t" + json_array.toString());
		NonNullList<ItemStack> stacks = NonNullList.create();
		for (JsonElement json : json_array)
			stacks.add(new ItemStack(JSONUtils.convertToItem(json, "item"), JSONUtils.convertToInt(json, "count")));
		return stacks;
	}

	/**
	 * Remove all instances from a list of elements from a primative type array.
	 *
	 * @param <E>      type held in the array that extends {@link Object}
	 * @param list     privative type array to edit.
	 * @param elements elements to remove
	 * @return elements removed from list
	 * @throws IllegalAccessException when elements has a length of zero
	 */
	@SuppressWarnings("unchecked")
	public static final <E extends Object> E[] removeAll(E[] list, E... elements) throws IllegalAccessException {
		Objects.requireNonNull(list, "List cannot be null");
		Objects.requireNonNull(elements, "Elements cannot be null");
		if (elements.length == 0)
			throw new IllegalAccessException("Must remove at least one element from list");
		LOGGER.info("Removing " + Arrays.deepToString(elements));
		LOGGER.info("from " + Arrays.deepToString(list));
		final List<E> temp = Arrays.asList(list);
		temp.removeAll(Arrays.asList(elements));
		return (E[]) temp.toArray();
	}

	/**
	 * Remove {@code null} from a primative type array.
	 *
	 * @param <E>  type held in the array that extends {@link Object}
	 * @param list primative type array to edit.
	 * @return null removed from list
	 */
	@SuppressWarnings("unchecked")
	public static final <E extends Object> E[] removeNull(E[] list) {
		Objects.requireNonNull(list, "List cannot be null");
		LOGGER.info("Removing null from" + Arrays.deepToString(list));
		return (E[]) Arrays.stream(list).filter(e -> e != null).toArray();
	}

	/**
	 * Sets all elements in a {@link List} to element
	 *
	 * @param <E>     type held in the list that extends {@link Object}
	 * @param element the element to set
	 * @param list    {@link List} to set
	 * @return converted {@link List}
	 */
	public static final <E extends Object> List<E> setAll(@Nullable E element, List<E> list) {
		Objects.requireNonNull(list, "List cannot be null");
		LOGGER.info("Setting all elements to " + element.toString());
		for (int i = 0; i < list.size(); i++)
			list.set(i, element);
		return list;
	}
}