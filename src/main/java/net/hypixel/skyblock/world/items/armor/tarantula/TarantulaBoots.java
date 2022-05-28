package net.hypixel.skyblock.world.items.armor.tarantula;

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

public class TarantulaBoots extends ModArmorItem {
	private static final List<Component> info = Arrays.asList(
			new TranslatableComponent("armor.slayer.piece_bonus", "Spider").withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.tarantula.piece_bonus"),
			new TranslatableComponent("armor.slayer.piece_bonus.0", "0", StatString.defense),
			new TranslatableComponent("armor.slayer.piece_bonus.1", "10", StatString.defense),
			new TranslatableComponent("armor.ability", new TranslatableComponent("armor.tarantula_boots")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.tarantula.boots"));

	public TarantulaBoots() {
		super(TarantulaSet.instance.getMaterial(), EquipmentSlot.FEET, ItemProperties.combat_1,
				TarantulaSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(info);
			tooltip.addAll(TarantulaSet.instance.getDescription(this.slot));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}