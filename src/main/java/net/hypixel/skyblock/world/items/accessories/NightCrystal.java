package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class NightCrystal extends Accessory {
	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#ATTACK_DAMAGE}
	 * by 0xA.
	 */
	private static final AttributeModifier attack_mod = new AttributeModifier(
			Attributes.ATTACK_DAMAGE.getDescriptionId(), 0xA, Operation.ADDITION);

	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#ARMOR} by 0xA.
	 */
	private static final AttributeModifier defense_mod = new AttributeModifier(Attributes.ARMOR.getDescriptionId(), 0xA,
			Operation.ADDITION);

	private static final Component info = new TranslatableComponent("accessory.night_crystal", StatString.strength,
			StatString.defense);

	public NightCrystal() {
		super(ItemProperties.mine_1, ModItemRarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
	
	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		if (level.isClientSide)
			return;
		if (level.isDay())
			return;
		if (entity instanceof Player) {
			final Player player = (Player) entity;
			final AttributeInstance atk_dmg = player.getAttribute(Attributes.ATTACK_DAMAGE);
			final AttributeInstance def = player.getAttribute(Attributes.ARMOR);
			atk_dmg.addTransientModifier(attack_mod);
			def.addTransientModifier(defense_mod);
		}
	}
}