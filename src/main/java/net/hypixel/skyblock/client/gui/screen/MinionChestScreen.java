package net.hypixel.skyblock.client.gui.screen;

import java.util.Objects;

import javax.annotation.Nonnull;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.inventory.minion.MinionChestContainer;
import net.hypixel.skyblock.world.level.block.minion.MinionChestBlock.MinionChestType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.MenuAccess;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * A basis for MinionChest Screen.
 *
 * @author MrPineapple070
 * @version 24 June 2020
 * @since 14 June 2019
 */
@OnlyIn(Dist.CLIENT)
public class MinionChestScreen extends AbstractContainerScreen<MinionChestContainer>
		implements MenuAccess<MinionChestContainer> {
	public static class LargeMCS extends MinionChestScreen {
		public LargeMCS(MinionChestContainer screenContainer, Inventory inv, Component titleIn) {
			super(screenContainer, inv, titleIn, MinionChestType.Large);
		}
	}

	public static class MediumMCS extends MinionChestScreen {
		public MediumMCS(MinionChestContainer screenContainer, Inventory inv, Component titleIn) {
			super(screenContainer, inv, titleIn, MinionChestType.Medium);
		}
	}

	public static class SmallMCS extends MinionChestScreen {
		public SmallMCS(MinionChestContainer screenContainer, Inventory inv, Component titleIn) {
			super(screenContainer, inv, titleIn, MinionChestType.Small);
		}
	}

	/**
	 * Background Texture for Large Minion Chest
	 */
	@Nonnull
	private static final ResourceLocation large = new ResourceLocation(SkyBlock.MOD_ID,
			"textures/gui/large_minion_chest_screen.png");

	/**
	 * Background Texture for Medium Minion Chest
	 */
	@Nonnull
	private static final ResourceLocation medium = new ResourceLocation(SkyBlock.MOD_ID,
			"textures/gui/medium_minion_chest_screen.png");

	/**
	 * Background Texture for Small Minion Chest
	 */
	@Nonnull
	private static final ResourceLocation small = new ResourceLocation(SkyBlock.MOD_ID,
			"textures/gui/small_minion_chest_screen.png");

	/**
	 * Background Texture for Extra Large Minion Chest
	 */
	@Nonnull
	private static final ResourceLocation xlarge = new ResourceLocation(SkyBlock.MOD_ID,
			"textures/gui/x_large_minion_chest_screen.png");

	/**
	 * Background Texture for Extra Extra Large Minion Chest
	 */
	@Nonnull
	private static final ResourceLocation xxlarge = new ResourceLocation(SkyBlock.MOD_ID,
			"textures/gui/xx_large_minion_chest_screen.png");

	/**
	 * The {@link MinionChestType} of this.
	 */
	@Nonnull
	protected final MinionChestType type;

	protected MinionChestScreen(MinionChestContainer screenContainer, Inventory inv, Component titleIn,
			MinionChestType type) {
		super(screenContainer, inv, titleIn);
		this.leftPos = 0;
		this.topPos = 0;
		this.width = 256;
		this.height = 256;
		this.type = Objects.requireNonNull(type, "Type of this MinionChestScreen cannot be null.");
	}

	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(stack);
		super.render(stack, mouseX, mouseY, partialTicks);
		this.renderTooltip(stack, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack stack, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
		switch (this.type) {
		case Small:
			this.minecraft.getTextureManager().bindForSetup(small);
			break;
		case Medium:
			this.minecraft.getTextureManager().bindForSetup(medium);
			break;
		case Large:
			this.minecraft.getTextureManager().bindForSetup(large);
			break;
		default:
			throw new IllegalStateException("Illegal MinionChestType " + this.type.name());
		}
		this.blit(stack, (this.width - this.imageWidth) / 2, (this.height - this.imageHeight) / 2, 0, 0,
				this.imageWidth, this.imageHeight);
	}

	@Override
	protected void renderLabels(PoseStack stack, int mouseX, int mouseY) {
		this.font.draw(stack, this.title.getString(), 48, 50, 0x404040);
		this.font.draw(stack, this.playerInventoryTitle.getString(), 48, 118, 0x404040);
	}
}