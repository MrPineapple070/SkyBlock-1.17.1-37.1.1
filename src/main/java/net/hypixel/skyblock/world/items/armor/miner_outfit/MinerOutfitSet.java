package net.hypixel.skyblock.world.items.armor.miner_outfit;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.hypixel.skyblock.world.items.armor.FullSetInformation;
import net.hypixel.skyblock.world.items.armor.ModArmorItem;
import net.hypixel.skyblock.world.items.armor.ModArmorMaterial;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Miner%27s_Outfit">Miner
 * Set</a>
 *
 * @author MrPineapple070
 * @version 18 May 2020
 */
public class MinerOutfitSet extends ModArmorItem {
	private static final List<Component> fsb = Arrays.asList(
			FullSetInformation.full_set_bonus.copy().append(new TranslatableComponent("armor.miner_outfit.fsb"))
			.withStyle(ChatFormatting.GOLD),
			new TranslatableComponent("armor.miner_outfit.fsb.disc",
					((MutableComponent) MobEffects.DIG_SPEED.getDisplayName())
					.withStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.DIG_SPEED.getColor())))));

	private static final MobEffectInstance haste = new MobEffectInstance(MobEffects.DIG_SPEED, 1, 1);

	public MinerOutfitSet(EquipmentSlot slot) {
		super(ModArmorMaterial.Miner_Outfit, slot, ItemProperties.mine_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(fsb);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof Player))
			return;
		Player player = (Player) entity;
		int m = 0;
		for (ItemStack s : player.getArmorSlots()) {
			Item item = s.getItem();
			if (!(item instanceof ArmorItem))
				continue;
			ArmorItem armor = (ArmorItem) item;
			if (armor.getMaterial() == ModArmorMaterial.Miner_Outfit)
				m++;
		}
		
		if (m == 4)
			player.addEffect(haste);
	}
}
