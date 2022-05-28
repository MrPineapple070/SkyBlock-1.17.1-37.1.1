package net.hypixel.skyblock.world.entity;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.entity.npc.Andrew;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
	public static final DeferredRegister<EntityType<?>> entities = DeferredRegister.create(ForgeRegistries.ENTITIES,
			SkyBlock.MOD_ID);

	public static final RegistryObject<EntityType<Andrew>> Andrew = entities.register("andrew",
			() -> EntityType.Builder.<Andrew>of(Andrew::new, MobCategory.CREATURE).sized(.6f, 1.95f)
					.build(new ResourceLocation(SkyBlock.MOD_ID, "andrew").toString()));
	
	@SuppressWarnings("deprecation")
	@Deprecated
	public static final RegistryObject<EntityType<TestEntity>> Test = entities.register("test", 
			() -> EntityType.Builder.of(TestEntity::new, MobCategory.CREATURE).sized(1f, 1f)
					.build(new ResourceLocation(SkyBlock.MOD_ID, "test").toString()));
}