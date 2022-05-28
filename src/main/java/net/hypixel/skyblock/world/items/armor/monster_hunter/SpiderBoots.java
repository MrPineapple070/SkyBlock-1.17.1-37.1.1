package net.hypixel.skyblock.world.items.armor.monster_hunter;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.hypixel.skyblock.world.items.armor.ModArmorMaterial;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class SpiderBoots extends ModArmorItem {
	private static final List<Component> info = Arrays
			.asList(new TranslatableComponent("armor.ability", new TranslatableComponent("armor.spider_boots"))
					.withStyle(ChatFormatting.GOLD), new TranslatableComponent("armor.spider_boots.disc"));

	public SpiderBoots(ModArmorMaterial materialIn, EquipmentSlot slot, Properties builder, ModItemRarity rarity) {
		super(MonsterHunterSet.instance.getMaterial(), EquipmentSlot.FEET, ItemProperties.combat_1,
				MonsterHunterSet.instance.getRarity());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		try {
			tooltip.addAll(MonsterHunterSet.instance.getDescription(this.slot));
			tooltip.addAll(info);
		} catch (final IllegalAccessException e) {
			LOGGER.error(e.getMessage());
		}
	}
}