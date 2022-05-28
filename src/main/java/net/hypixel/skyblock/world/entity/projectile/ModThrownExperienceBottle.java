package net.hypixel.skyblock.world.entity.projectile;

import net.hypixel.skyblock.world.items.ModExperienceBottleItem;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

public class ModThrownExperienceBottle extends ThrowableItemProjectile {
	private final ModExperienceBottleItem.Type type;
	
	public ModThrownExperienceBottle(BlockPos pos, Level world, ModExperienceBottleItem.Type type) {
		super(EntityType.EXPERIENCE_BOTTLE, pos.getX(), pos.getY(), pos.getZ(), world);
		this.type = type;
	}

	@Override
	protected Item getDefaultItem() {
		return Items.EXPERIENCE_BOTTLE;
	}
	
	@Override
	protected float getGravity() {
		return .07f;
	}
	
	@Override
	protected void onHit(HitResult result) {
		super.onHit(result);
		if (this.level instanceof ServerLevel) {
			this.level.levelEvent(2002, this.blockPosition(), PotionUtils.getColor(Potions.WATER));
			int i;
			
			switch (this.type) {
			case TITANIC:
				i = 30;
				break;
			case GRAND:
				i = 10;
				break;
			default:
				throw new IllegalStateException("Illegal ModExperienceBottleItem.Type:\t" + this.type.name());
			}
			
			ExperienceOrb.award((ServerLevel) this.level, this.position(), i);
			this.discard();
		}
	}
}