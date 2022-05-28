package net.hypixel.skyblock.world.items.armor.bat_person;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.armor.FullSetInformation;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.hypixel.skyblock.world.items.armor.ModArmorMaterial;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Bat_Person_Armor">Bat
 * Person Armor</a>
 *
 * @author MrPineapple070
 * @version 18 December 2019
 * @since 24 October 2019
 */
public class BatPersonSet extends ModArmorItem {
	protected static final List<Component> fsb = Arrays.asList(FullSetInformation.full_set_bonus.copy()
			.append(new TranslatableComponent("armor.bat_person.fsb")).withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.bat_person.fsb.disc"));

	public BatPersonSet(EquipmentSlot slot) {
		super(ModArmorMaterial.Bat_Person, slot, ItemProperties.mine_1, ModItemRarity.Legendary);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(fsb);
	}
}