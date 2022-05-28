package net.hypixel.skyblock.world.items.accessories;

import java.util.List;

import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.hypixel.skyblock.world.items.ModItemRarity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.LevelData;

/**
 * An {@link Accessory} that increases
 * <font style="color:#e73c3c">Strength</font> and
 * <font style="color:#00d400">Defense</font> depending on the Player's
 * proximity to spawn.
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class GravityTalisman extends Accessory {
	private static final Component info = new TranslatableComponent("accessory.gravity", StatString.strength,
			StatString.defense);

	public GravityTalisman() {
		super(ItemProperties.mine_1, ModItemRarity.Uncommon);
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
		LevelData data = level.getLevelData();
		final Player player = (Player) entity;
		final BlockPos spawn = new BlockPos(data.getXSpawn(), data.getYSpawn(), data.getZSpawn());
		spawn.distSqr(player.blockPosition());
	}
}