package net.hypixel.skyblock.world.items.crafting;

import net.hypixel.skyblock.SkyBlock;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleRecipeSerializer;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialize and Register all {@link RecipeType} for this Mod.
 *
 * @author MrPineapple070
 * @version 10 October 2020
 * @since 10 October 2020
 */
public class RecipeSerializerInit {
	public static final DeferredRegister<RecipeSerializer<?>> rs = DeferredRegister
			.create(ForgeRegistries.RECIPE_SERIALIZERS, SkyBlock.MOD_ID);
	
	public static final RegistryObject<RecipeSerializer<?>> backpack_color_seralizer = rs
			.register("crafting_special_backpackcoloring", () -> new SimpleRecipeSerializer<>(BackpackColoring::new));
	public static final RegistryObject<RecipeSerializer<?>> enchanted_item_serializer = rs.register("enchanted_item",
			EnchantedItemRecipe.Serializer::new);
	public static final RegistryObject<RecipeSerializer<?>> enchantment_serializer = rs.register("enchantment",
			EnchantmentRecipe.Serializer::new);
	public static final RegistryObject<RecipeSerializer<?>> forge_serializer = rs.register("forge",
			ForgeRecipe.Serializer::new);
	public static final RegistryObject<RecipeSerializer<?>> pet_item_serializer = rs.register("pet_item",
			PetItemRecipe.Serializer::new);
	public static final RegistryObject<RecipeSerializer<?>> shaped_seralizer = rs.register("shaped",
			ModShapedRecipe.Serializer::new);
}