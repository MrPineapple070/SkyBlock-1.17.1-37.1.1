package net.hypixel.skyblock.world.items.armor.adaptive;

import java.util.List;

import net.hypixel.skyblock.world.items.armor.DungeonArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class AdaptiveBoots extends DungeonArmorItem {
	public AdaptiveBoots() {
		super(AdaptiveSet.instance.getMaterial(), EquipmentSlot.FEET, AdaptiveSet.instance.getRarity());
	}
	
	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int tick, boolean selected) {
		if (level.isClientSide)
			return;
		if (! (entity instanceof Player))
			return;
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(AdaptiveSet.instance.getDescription(this.slot));
		} catch (IllegalAccessException e) {
			LOGGER.error(e.getLocalizedMessage());
		}
	}
}