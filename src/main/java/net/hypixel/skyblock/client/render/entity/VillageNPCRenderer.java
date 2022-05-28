package net.hypixel.skyblock.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;

import net.hypixel.skyblock.client.model.VillageNPCModel;
import net.hypixel.skyblock.world.entity.npc.VillageNPC;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.resources.ResourceLocation;

public class VillageNPCRenderer extends MobRenderer<VillageNPC, VillageNPCModel<VillageNPC>> {
	/**
	 * {@link ResourceLocation} base texture
	 */
	protected static final ResourceLocation texture = new ResourceLocation("textures/entity/villager/villager.png");

	public VillageNPCRenderer(Context ctx) {
		super(ctx, new VillageNPCModel<>(ctx.bakeLayer(VillageNPCModel.LAYER_LOCATION)), .5f);
		this.addLayer(new CustomHeadLayer<>(this, ctx.getModelSet()));
		this.addLayer(new CrossedArmsItemLayer<>(this));
	}
	
	@Override
	public ResourceLocation getTextureLocation(VillageNPC villager) {
		return texture;
	}

	@Override
	protected void scale(VillageNPC villager, PoseStack pose, float scale) {
		float f = .9375f;
		if (villager.isBaby()) {
			f *= .5f;
			this.shadowRadius = .25F;
		} else
			this.shadowRadius = .5F;

		pose.scale(f, f, f);
	}
}