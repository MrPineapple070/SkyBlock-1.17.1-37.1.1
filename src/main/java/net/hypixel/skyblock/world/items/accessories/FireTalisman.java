package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that provides immunity to fire.
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class FireTalisman extends Accessory {
	private static final MobEffectInstance fire = new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1);
	private static final Component info = new TranslatableComponent("accessory.fire");

	public FireTalisman() {
		super(ItemProperties.combat_1, ModItemRarity.Common);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof Player))
			return;
		final Player player = (Player) entity;
		player.addEffect(fire);
	}
}