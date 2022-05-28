package net.hypixel.skyblock.world.entity;

import net.hypixel.skyblock.SkyBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowParentGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

@Deprecated
public class TestEntity extends Animal {
	private static final ResourceLocation LOOT_TABLE = new ResourceLocation(SkyBlock.MOD_ID, "entities/example_entity");

	public static AttributeSupplier createAttributes() {
		return Mob.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 50d)
				.add(Attributes.MOVEMENT_SPEED, 0.24d)
				.build();
	}

	public TestEntity(EntityType<? extends Animal> type, Level level) {
		super(type, level);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return SoundEvents.AMBIENT_CAVE;
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob parent) {
		return ModEntityTypes.Test.get().create(level);
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.SHEEP_DEATH;
	}

	@Override
	protected ResourceLocation getDefaultLootTable() {
		return LOOT_TABLE;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.PIG_HURT;
	}

	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new FloatGoal(this));
		this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
		this.goalSelector.addGoal(3, new BreedGoal(this, 1.0D));
		this.goalSelector.addGoal(4, new TemptGoal(this, 1.2D, Ingredient.of(Items.WHEAT), false));
		this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.1D));
		this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
	}
}