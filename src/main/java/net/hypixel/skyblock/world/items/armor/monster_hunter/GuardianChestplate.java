package net.hypixel.skyblock.world.items.armor.monster_hunter;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class GuardianChestplate extends ModArmorItem {
	private static final List<Component> info = Arrays.asList(
			new TranslatableComponent("armor.ability", new TranslatableComponent("armor.guardian_chestplate"))
					.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.guardian_chestplate.disc.0", StatString.health)
					.withStyle(ChatFormatting.GRAY));

	public GuardianChestplate() {
		super(MonsterHunterSet.instance.getMaterial(), EquipmentSlot.CHEST, ItemProperties.combat_1,
				MonsterHunterSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(MonsterHunterSet.instance.getDescription(this.slot));
			tooltip.addAll(info);
		} catch (IllegalAccessException e) {
			LOGGER.error(e.getMessage());
		}
	}
}