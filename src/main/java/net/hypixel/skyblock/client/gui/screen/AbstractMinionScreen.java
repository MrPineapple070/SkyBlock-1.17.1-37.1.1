package net.hypixel.skyblock.client.gui.screen;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.inventory.minion.AbstractMinionContainer;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Serve as a basis for all Minion Screens
 *
 * @author MrPineapple070
 * @version 6 June 2020
 * @since 6 June 2020
 */
@OnlyIn(Dist.CLIENT)
public final class AbstractMinionScreen extends AbstractContainerScreen<AbstractMinionContainer> {
	/**
	 * The texture for this screen.
	 */
	@Nonnull
	public static final ResourceLocation background_texture = new ResourceLocation(SkyBlock.MOD_ID,
			"textures/gui/abstract_minion_screen.png");

	protected static final TranslatableComponent fuel = new TranslatableComponent("gui.minion.fuel");
	protected static final TranslatableComponent seller = new TranslatableComponent("gui.minion.seller");
	protected static final TranslatableComponent boost_0 = new TranslatableComponent("gui.minion.boost.0");
	protected static final TranslatableComponent boost_1 = new TranslatableComponent("gui.minion.boost.1");

	/**
	 * {@link Logger} for this
	 */
	@Nonnull
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * Construct this.
	 *
	 * @param screenContainer {@link AbstractMinionContainer} to holds this.
	 * @param inv             {@link PlayerInventory} of the player viewing this.
	 * @param titleIn         {@link Component} for the title.
	 */
	public AbstractMinionScreen(AbstractMinionContainer screenContainer, Inventory inv, Component titleIn) {
		super(screenContainer, inv, titleIn);
		this.leftPos = 0;
		this.topPos = 0;
		this.imageHeight = 184;
		this.imageWidth = 176;
		this.width = 256;
		this.height = 256;
	}

	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(stack);
		super.render(stack, mouseX, mouseY, partialTicks);
		this.renderTooltip(stack, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack stack, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderFogColor(1f, 1f, 1f, 1f);
		this.minecraft.getTextureManager().bindForSetup(background_texture);
		this.blit(stack, (this.width - this.imageWidth) / 2, (this.height - this.imageHeight) / 2, 0, 0,
				this.imageWidth, this.imageHeight);
	}

	@Override
	protected void renderLabels(PoseStack stack, int mouseX, int mouseY) {
		this.font.draw(stack, this.title, 8, 3, 0x404040);
		this.font.draw(stack, fuel, 8, 19, 0x404040);
		this.font.draw(stack, seller, 8, 37, 0x404040);
		this.font.draw(stack, boost_0, 8, 55, 0x404040);
		this.font.draw(stack, boost_1, 8, 73, 0x404040);
		this.font.draw(stack, this.playerInventoryTitle, 8, 91, 0x404040);
	}
}