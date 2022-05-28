package net.hypixel.skyblock.world.items;

import net.hypixel.skyblock.world.entity.projectile.ModThrownExperienceBottle;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ExperienceBottleItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

/**
 * Used for custom {@link ExperienceBottleItem}
 *
 * @author MrPineapple070
 * @version 20 May 2020
 */
public class ModExperienceBottleItem extends ExperienceBottleItem {
	
	/**
	 * An enumerated type determining the type of {@link ModExperienceBottleItem}
	 *
	 * @author MrPineapple070
	 * @version 20 May 2020
	 */
	public enum Type {
		GRAND, TITANIC;
	}

	/**
	 * The {@link Type} of this
	 */
	private final ModExperienceBottleItem.Type type;

	/**
	 * Construct this
	 *
	 * @param builder {@link Properties}
	 * @param type    {@link Type}
	 */
	public ModExperienceBottleItem(Properties builder, Type type) {
		super(builder);
		if (type == null)
			throw new IllegalArgumentException("ModExperienceBottleItem must have a Type");
		this.type = type;
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		final ItemStack stack = player.getItemInHand(hand);
		level.playSound(player, player.blockPosition(), SoundEvents.EXPERIENCE_BOTTLE_THROW, SoundSource.NEUTRAL, .5f, .4f / (level.getRandom().nextFloat() * .4f + .8f));
		if (!level.isClientSide) {
			final ModThrownExperienceBottle exp_entity = new ModThrownExperienceBottle(player.blockPosition(), level, this.type);
			exp_entity.setItem(stack);
			exp_entity.shootFromRotation(player, player.getXRot(), player.getYRot(), -20f, .7f, 1f);
		}
		
		player.awardStat(Stats.ITEM_USED.get(this));
		
		if (!player.getAbilities().instabuild)
			stack.shrink(1);
		
		return InteractionResultHolder.success(stack);
	}
}