package net.hypixel.skyblock.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.entity.npc.VillageNPC;
import net.minecraft.client.model.HeadedModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.VillagerHeadModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class VillageNPCModel<T extends VillageNPC> extends HierarchicalModel<T>
		implements HeadedModel, VillagerHeadModel {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(SkyBlock.MOD_ID, "village_npc"), "main");

	protected final ModelPart root;
	protected final ModelPart head;
	protected final ModelPart hat;
	protected final ModelPart hatRim;
	protected final ModelPart rightLeg;
	protected final ModelPart leftLeg;
	protected final ModelPart nose;

	public VillageNPCModel(ModelPart part) {
		this.root = part;
		this.head = part.getChild("head");
		this.hat = this.head.getChild("hat");
		this.hatRim = this.hat.getChild("hat_rim");
		this.nose = this.head.getChild("nose");
		this.rightLeg = part.getChild("right_leg");
		this.leftLeg = part.getChild("left_leg");
	}
	
	/**
	 * Creates the Body {@link LayerDefinition}
	 * 
	 * @return {@link LayerDefinition}
	 */
	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = new MeshDefinition();
		PartDefinition root = mesh.getRoot();
		PartDefinition head = root.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4f, -10f, -4f, 8f, 10f, 8f), PartPose.ZERO);
		PartDefinition hat = head.addOrReplaceChild("hat",
				CubeListBuilder.create().texOffs(32, 0).addBox(-4f, -10f, -4f, 8f, 10f, 8f, new CubeDeformation(.5F)),
				PartPose.ZERO);

		hat.addOrReplaceChild("hat_rim", CubeListBuilder.create().texOffs(30, 47).addBox(-8f, -8f, -6f, 16f, 16f, 1f),
				PartPose.rotation((-(float) Math.PI / 2f), 0f, 0f));
		head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(24, 0).addBox(-1f, -1f, -6f, 2f, 4f, 2f),
				PartPose.offset(0f, -2f, 0f));

		PartDefinition body = root.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 20).addBox(-4f, 0f, -3f, 8f, 12f, 6f), PartPose.ZERO);

		body.addOrReplaceChild("jacket",
				CubeListBuilder.create().texOffs(0, 38).addBox(-4f, 0f, -3f, 8f, 18f, 6f, new CubeDeformation(.5F)),
				PartPose.ZERO);
		root.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(44, 22).addBox(-8f, -2f, -2f, 4f, 8f, 4f).texOffs(44, 22)
						.addBox(4f, -2f, -2f, 4f, 8f, 4f, true).texOffs(40, 38).addBox(-4f, 2f, -2f, 8f, 4f, 4f),
				PartPose.offsetAndRotation(0f, 3f, -1f, -.75F, 0f, 0f));
		root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 22).addBox(-2f, 0f, -2f, 4f, 12f, 4f),
				PartPose.offset(-2f, 12f, 0f));
		root.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-2f, 0f, -2f, 4f, 12f, 4f),
				PartPose.offset(2f, 12f, 0f));

		return LayerDefinition.create(mesh, 64, 64);
	}

	@Override
	public ModelPart root() {
		return this.root;
	}

	@Override
	public void setupAnim(T entity, float leg_xRot, float leg_rot, float head_zRot, float head_yRot, float head_xRot) {
		boolean flag = false;

		this.head.yRot = head_yRot * ((float) Math.PI / 180F);
		this.head.xRot = head_xRot * ((float) Math.PI / 180F);
		if (flag) {
			this.head.zRot = .3F * Mth.sin(.45F * head_zRot);
			this.head.xRot = .4F;
		} else
			this.head.zRot = 0f;

		this.rightLeg.xRot = Mth.cos(leg_xRot * .6662F) * 1.4F * leg_rot * .5F;
		this.leftLeg.xRot = Mth.cos(leg_xRot * .6662F + (float) Math.PI) * 1.4F * leg_rot * .5F;
		this.rightLeg.yRot = 0f;
		this.leftLeg.yRot = 0f;
	}

	@Override
	public ModelPart getHead() {
		return this.head;
	}
	
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		this.root.render(poseStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void hatVisible(boolean visible) {
		this.head.visible = visible;
		this.hat.visible = visible;
		this.hatRim.visible = visible;
	}
}