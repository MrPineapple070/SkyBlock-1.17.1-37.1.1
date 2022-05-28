package net.hypixel.skyblock.world.entity.npc;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.npc.Npc;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public abstract class VillageNPC extends Mob implements Npc {
	public static final AttributeSupplier createAttributes() {
		return Mob.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 100)
				.add(Attributes.KNOCKBACK_RESISTANCE, 100)
				.add(Attributes.MOVEMENT_SPEED, 0)
				.build();
	}

	public VillageNPC(EntityType<? extends Mob> type, Level worldIn) {
		super(type, worldIn);
		LOGGER.info(type.getRegistryName().toString() + " created");
	}
	
	@Override
	public void setHealth(float health) {
		LOGGER.debug(this.entityData.toString());
		return;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		LOGGER.info("Writing:\t" + compound.toString());
	}

	@Override
	protected final void defineSynchedData() {
		this.setInvulnerable(true);
		this.setNoGravity(true);
		this.setSilent(true);
		this.setCustomNameVisible(true);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return SoundEvents.VILLAGER_AMBIENT;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		return false;
	}

	@Override
	protected abstract InteractionResult mobInteract(Player player, InteractionHand hand);

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		LOGGER.info("Reading:\t" + compound.toString());
	}
	
	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, 6f));
	}
}