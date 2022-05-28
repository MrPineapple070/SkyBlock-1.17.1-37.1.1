package net.hypixel.skyblock.world.level.block.entity.minion;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public abstract class AbstractSummonerMTE extends AbstractMinionTileEntity {
	protected final EntityType<? extends Entity> summon;

	protected final Queue<Entity> summoned = new LinkedList<>();

	public AbstractSummonerMTE(BlockEntityType<? extends AbstractSummonerMTE> typeIn, BlockPos pos, BlockState state,
			MinionTier tier, EntityType<? extends Entity> summon) {
		super(typeIn, pos, state, tier);
		this.summon = Objects.requireNonNull(summon, "Entity to summon cannot be null");
	}

	protected abstract void removeEntity();

	@Override
	protected Item[] getCompactor() {
		return COMP;
	}

	@Override
	protected BlockPos[][][] initSurround() {
		return new BlockPos[0][0][0];
	}

	@Override
	protected BlockPos pickBlockPos() {
		return this.worldPosition;
	}

	@Override
	public CompoundTag save(CompoundTag compound) {
		super.save(compound);

		ListTag listnbt = new ListTag();

		for (Entity entity : this.summoned) {
			CompoundTag nbt = new CompoundTag();
			entity.save(nbt);
			listnbt.add(nbt);
		}

		compound.put("Entities", listnbt);
		LOGGER.debug("NBT:\t" + compound.toString());
		return compound;
	}

	@Override
	public void load(CompoundTag compound) {
		if (!(this.level instanceof ServerLevel))
			return;
		super.load(compound);

		ListTag list = compound.getList("Entities", 10);
		ServerLevel world = (ServerLevel) this.level;

		for (int i = 0; i < list.size(); ++i)
			this.summoned.offer(world.getEntity(list.getCompound(i).getUUID("UUID")));

		LOGGER.debug(this.summoned.toString());
	}

	@Override
	protected void setSurround() {
		return;
	}

	@Override
	protected void setValidSurround() {
		return;
	}

	@Override
	public void tick() {
		if (this.level.isClientSide)
			return;
		if (!this.isTicking)
			this.init();
		if (this.isCompletlyFull())
			return;
		this.tick = ++this.tick % (int) (this.getSpeed(this.tier) * this.getFuelSpeed());
		if (this.tick != 0)
			return;
		if (this.summoned.size() < 5)
			this.summoned.offer(summon.spawn((ServerLevel) this.level, null, null, null, this.pickBlockPos(),
					MobSpawnType.TRIGGERED, true, true));
		else
			this.removeEntity();
	}
}