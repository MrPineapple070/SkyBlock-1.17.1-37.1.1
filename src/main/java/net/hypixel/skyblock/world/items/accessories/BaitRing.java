package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.bait.Bait;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that have a 5% chance to not consume {@link Bait}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Bait_Ring">Bait
 * Ring</a>.<br>
 * <a href=
 * "http://textures.minecraft.net/texture/5a316d585b789b582f2d99e8e6cb2d70433e8996fab024a74bc790e22aedcdeb">Texture</a>.
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class BaitRing extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.bait_ring");

	public BaitRing() {
		super(ItemProperties.fish_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof Player))
			return;
		final Player player = (Player) entity;
		if (player.fishing == null)
			return;
		if (level.getRandom().nextInt(100) >= 5)
			LOGGER.debug("Bait consume");
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return InteractionResultHolder.pass(player.getItemInHand(hand));
	}
}