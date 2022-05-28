package net.hypixel.skyblock.client.gui.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import net.hypixel.skyblock.SkyBlock;
import net.hypixel.skyblock.world.inventory.TimeSaverMenu;
import net.hypixel.skyblock.world.level.block.TimeSaver;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;

/**
 * A {@link AbstractContainerScreen} that allows the {@link Player} to interact
 * with {@link TimeSaver}.
 *
 * @author MrPineapple070
 * @version 07 October 2020
 * @since 07 October 2020
 */
public class TimeSaverScreen extends AbstractContainerScreen<TimeSaverMenu> {
	/**
	 * The texture for this screen.
	 */
	public static final ResourceLocation background_texture = new ResourceLocation(SkyBlock.MOD_ID,
			"textures/gui/time_saver_screen.png");

	/**
	 * @param menu {@link TimeSaverContainer} containing this.
	 * @param inv             {@link Inventory} of {@link Player}
	 *                        interacting with this
	 * @param titleIn         {@link Component} of the title for this screen
	 */
	public TimeSaverScreen(TimeSaverMenu menu, Inventory inv, Component titleIn) {
		super(menu, inv, titleIn);
		this.leftPos = 0;
		this.topPos = 0;
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
	protected void renderBg(PoseStack stack, float ticks, int x, int y) {
		RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
		this.minecraft.getTextureManager().bindForSetup(background_texture);
		this.blit(stack, (this.width - this.imageWidth) / 2, (this.height - this.imageHeight) / 2, 0, 0,
				this.imageWidth, this.imageHeight);
	}
}