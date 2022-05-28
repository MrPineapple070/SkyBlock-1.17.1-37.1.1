package net.hypixel.skyblock;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.client.model.TestEntityModel;
import net.hypixel.skyblock.client.model.VillageNPCModel;
import net.hypixel.skyblock.client.render.entity.TestRenderer;
import net.hypixel.skyblock.client.render.entity.VillageNPCRenderer;
import net.hypixel.skyblock.potion.PotionInit;
import net.hypixel.skyblock.util.ModSoundEvents;
import net.hypixel.skyblock.world.entity.ModEntityTypes;
import net.hypixel.skyblock.world.entity.TestEntity;
import net.hypixel.skyblock.world.entity.npc.VillageNPC;
import net.hypixel.skyblock.world.inventory.init.MasterContainerInit;
import net.hypixel.skyblock.world.items.crafting.RecipeSerializerInit;
import net.hypixel.skyblock.world.items.enchantment.EnchantmentInit;
import net.hypixel.skyblock.world.items.init.MasterItemInit;
import net.hypixel.skyblock.world.level.block.entity.ModBlockEntityTypes;
import net.hypixel.skyblock.world.level.block.init.MasterBlockInit;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;

// The value here should match an entry in the META-INF/mods.toml file
@SuppressWarnings("deprecation")
@Mod(SkyBlock.MOD_ID)
public class SkyBlock {
	/**
	 *  Directly reference a log4j {@link Logger}.
	 */
	private static final Logger LOGGER = LogManager.getLogger();
	
	/**
	 * {@link String} holding Mod ID
	 */
	public static final String MOD_ID = "hypixelskyblockmod";
	
	public SkyBlock() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		bus.addListener(this::enqueueIMC);
		bus.addListener(this::processIMC);
		
		// ParticleInit.particle_types.register(bus);
		ModSoundEvents.sounds.register(bus);

		PotionInit.register(bus);

		EnchantmentInit.enchantments.register(bus);

		MasterItemInit.register(bus);
		RecipeSerializerInit.rs.register(bus);
		// FluidInit.fluids.register(bus);
		MasterBlockInit.register(bus);

		ModEntityTypes.entities.register(bus);
		ModBlockEntityTypes.be_types.register(bus);
		MasterContainerInit.register(bus);

		// FeatureInit.features.register(bus);
		// FeatureInit.strucutres.register(bus);

		// PortalBlockInit.portal_blocks.register(bus);

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	/**
	 * Pre-Init registering
	 * 
	 * @param event {@link FMLCommonSetupEvent}
	 */
	private void setup(final FMLCommonSetupEvent event) {
		LOGGER.debug("setup() called");
		
		PotionInit.addRecipies();
		MinecraftForge.EVENT_BUS.register(RegisterCommandsEvent.class);
	}
	
	/**
	 * Send information from this mod to another mod
	 * 
	 * @param event {@link InterModEnqueueEvent}
	 */
	private void enqueueIMC(final InterModEnqueueEvent event) {
		LOGGER.debug("enqueueIMC() called");
		InterModComms.sendTo("examplemod", "\u0006", () -> {
			LOGGER.info("Hello world from the MDK");
			return "Hello world";
		});
	}
	
	/**
	 * Receives information from another mod to this mod
	 * 
	 * @param event {@link InterModProcessEvent}
	 */
	private void processIMC(final InterModProcessEvent event) {
		LOGGER.info("Got IMC {}",
				event.getIMCStream().map(m -> m.messageSupplier().get()).collect(Collectors.toList()));
	}
	
	/**
	 * You can use {@link SubscribeEvent} and let the Event Bus discover methods to call
	 * 
	 * @param event {@link FMLServerStartingEvent}
	 */
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		LOGGER.info("onServerStarting()");
	}
	
	@EventBusSubscriber(modid = SkyBlock.MOD_ID, bus = Bus.MOD)
	public static class Register {
		@SubscribeEvent
		public static void registerAttributes(EntityAttributeCreationEvent event) {
			LOGGER.debug("Registering Attributes");
			event.put(ModEntityTypes.Andrew.get(), VillageNPC.createAttributes());
			event.put(ModEntityTypes.Test.get(), TestEntity.createAttributes());
		}
		
		@SubscribeEvent
	    public static void registerLayers(RegisterLayerDefinitions event) {
			LOGGER.debug("Register Layers");
	        event.registerLayerDefinition(VillageNPCModel.LAYER_LOCATION, VillageNPCModel::createBodyLayer);
	        event.registerLayerDefinition(TestEntityModel.LAYER_LOCATION, TestEntityModel::createBodyLayer);
	    }
		
		@SubscribeEvent
		public static void registerRenderers(RegisterRenderers event) {
			LOGGER.debug("Registering Renderers");
			event.registerEntityRenderer(ModEntityTypes.Andrew.get(), VillageNPCRenderer::new);
			event.registerEntityRenderer(ModEntityTypes.Test.get(), TestRenderer::new);
		}
	}
}