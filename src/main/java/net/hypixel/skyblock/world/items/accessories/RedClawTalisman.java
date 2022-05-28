package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that increases Crit Damage by 1%.
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class RedClawTalisman extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.red_claw",
			StatString.crit_damage, "1%");

	public RedClawTalisman() {
		super(ItemProperties.combat_1, ModItemRarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}