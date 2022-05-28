package net.hypixel.skyblock.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.hypixel.skyblock.SkyBlock;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

@Deprecated
public class TestEntityModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(SkyBlock.MOD_ID, "testentity"), "main");
	private final ModelPart body;
	private final ModelPart head;

	public TestEntityModel(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = new MeshDefinition();
		PartDefinition root = mesh.getRoot();

		root.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
				.addBox(-8f, -8f, 0f, 8f, 8f, 8f, new CubeDeformation(0f)), PartPose.offset(0f, 24f, 0f));
		root.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5f, -9f, 0f, 1f, 1f, 1f, new CubeDeformation(0f)), PartPose.offset(0f, 24f, 0f));

		return LayerDefinition.create(mesh, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		this.body.render(poseStack, buffer, packedLight, packedOverlay);
		this.head.render(poseStack, buffer, packedLight, packedOverlay);
	}
}