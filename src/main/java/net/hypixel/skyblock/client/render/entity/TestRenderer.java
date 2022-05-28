package net.hypixel.skyblock.client.render.entity;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.client.model.TestEntityModel;
import net.hypixel.skyblock.world.entity.TestEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

@Deprecated
public class TestRenderer extends MobRenderer<TestEntity, TestEntityModel<TestEntity>> {
	public static final ResourceLocation texture = new ResourceLocation(SkyBlock.MOD_ID, "test");

	public TestRenderer(Context ctx) {
		super(ctx, new TestEntityModel<>(ctx.bakeLayer(TestEntityModel.LAYER_LOCATION)), .5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TestEntity p_114482_) {
		return texture;
	}
}