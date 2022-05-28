package net.hypixel.skyblock.world.entity.npc;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.npc.Npc;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public abstract class Mayor extends Mob implements Npc {
	public Mayor(EntityType<? extends Mob> entityType, Level world) {
		super(entityType, world);
	}

	@Override
	protected void defineSynchedData() {
		this.setInvulnerable(true);
		this.setNoGravity(true);
		this.setSilent(true);
		this.setCustomNameVisible(true);
	}
	
	@Override
	protected abstract InteractionResult mobInteract(Player player, InteractionHand hand);

	@Override
	public void readAdditionalSaveData(CompoundTag nbt) {
		LOGGER.info("Reading:\t" + nbt.toString());
	}

	@Override
	public void addAdditionalSaveData(CompoundTag nbt) {
		LOGGER.info("Adding:\t" + nbt.toString());
	}
	
	
	@Override
	public Packet<?> getAddEntityPacket() {
		return new ClientboundAddEntityPacket(this);
	}
}