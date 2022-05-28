package net.hypixel.skyblock.world.entity.npc;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.world.entity.ModEntityTypes;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

/**
 * 
 * @author MrPineapple070
 * @version 03 March 2021
 * @since 11 July 2019
 */
public class Andrew extends VillageNPC {
	public static final TranslatableComponent name = new TranslatableComponent("npc.andrew");
	public static final List<TranslatableComponent> speach = Arrays
			.asList(new TranslatableComponent("npc.andrew.0"), new TranslatableComponent("npc.andrew.1"));
	
	public Andrew(EntityType<? extends VillageNPC> type, Level level) {
		super(ModEntityTypes.Andrew.get(), level);
		// this.setPosRaw(38, 68, -46);
		// this.setCustomName(name);
	}

	@Override
	protected InteractionResult mobInteract(Player player, InteractionHand hand) {
		LOGGER.debug("Player:\t" + player.toString());
		LOGGER.debug("Hand:\t" + hand.name());
		player.sendMessage(speach.get(random.nextInt(2)), this.uuid);
		return InteractionResult.SUCCESS;
	}
}