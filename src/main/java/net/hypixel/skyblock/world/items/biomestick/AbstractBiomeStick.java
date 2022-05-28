package net.hypixel.skyblock.world.items.biomestick;

import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Serve as a base for
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Biome_Stick">Biome
 * Sticks</a>.
 *
 * @author MrPineapple070
 * @version 24 June 2020
 */
public abstract class AbstractBiomeStick extends Item {
	protected static final String translate = "item.biome_stick.%s.discripion";

	protected static void sendMessage(Player player, Component text) {
		player.sendMessage(text, Player.createPlayerUUID(player.getGameProfile()));
	}

	protected int range;

	protected AbstractBiomeStick(Properties properties) {
		super(properties);
		this.range = 0;
	}

	@Override
	public abstract void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag);

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return false;
	}

	@Override
	public boolean canAttackBlock(BlockState state, Level worldIn, BlockPos pos, Player player) {
		if (!worldIn.isClientSide)
			this.handleClick(player, worldIn, pos, false, player.getItemInHand(InteractionHand.MAIN_HAND));
		return false;
	}

	protected void handleClick(Player player, Level worldIn, BlockPos pos, boolean rightClick, ItemStack stack) {
		if (rightClick)
			worldIn.getBiome(pos);
		this.range = ++this.range % 5;
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}

	@Override
	public boolean isFoil(ItemStack stack) {
		return true;
	}

	@Override
	public abstract InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand);
}