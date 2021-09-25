package main.java.net.trainerlord.worldsystem.objects;

import java.util.List;

public class PlayerWorldsObject {
	
	
	private List<WorldOwnersObject> WorldOwners;

	public PlayerWorldsObject(List<WorldOwnersObject> worldOwners) {
		super();
		this.WorldOwners = worldOwners;
	}

	public List<WorldOwnersObject> getWorldOwners() {
		return WorldOwners;
	}
	
	public void removeWorldOwnerDataAt(int index) {
		WorldOwners.remove(index);
	}
	
	public void addWorldOwner(WorldOwnersObject newOwner) {
		for(WorldOwnersObject member : WorldOwners) {
			if (member.getOwner().equals(newOwner.getOwner())) {
				System.out.println("Found Repeative Player");
				return;
			}
		}
		WorldOwners.add(newOwner);
		//System.out.println("Created new Player");
	}
	
	public void addNewWorld(String entity, WorldObject newWorld) {
		int i = 0;
		for(WorldOwnersObject member : WorldOwners) {
			if (member.getOwner().equals(entity)) {
				WorldOwners.get(i).addWorld(newWorld);
				System.out.println("Created new World for PLayer");
			}
			
			i++;
		}
	}
	
	public int getOwnerWorldCount(String entity) {
		for(WorldOwnersObject member : WorldOwners) {
			if (member.getOwner().equals(entity)) {
				if (member.getWorlds() != null)
					return member.getWorlds().toArray().length;
				return 0;
			}
		}
		return 0;
	}
	
	// This is How the Final Compiled Json Should Look
	// This is Also How I planned out the object Classes
	
	/*
	 * WorldOwners: [{
	 * 	  Owner: <uuid/entity name>
	 *    OwnerType: <player/entity>
	 *    
	 *    Worlds: [{
	 *    	name: "X",
	 *    	
	 *    	useTemplate: false,
	 *    	template: "Blank",
	 *    	
	 *    	seed: 12345,
	 *    	environment: "NORMAL",
	 *    	type: "NORMAL",
	 *      generator: "",
	 *      generateNaturalStructures: true,
	 *    
	 *    	WorldGameRules: {
	 *    		announceAdvancements: true,
	 *    		disableElytraMovementCheck: false,
	 *    		disableRaids: false,
	 *    		doDaylightCycle: true,
	 *    		doEntityDrops: true,
	 *    		doFireTick: true,
	 *    		doInsomnia: true,
	 *    		doImmediateRespawn: false,
	 *    		doLimitedCrafting: false,
	 *    		doMobLoot: true,
	 *    		doMobSpawning: true,
	 *    		doPatrolSpawning: true,
	 *    		doTileDrops: true,
	 *    		doTraderSpawning: true,
	 *    		doWeatherCycle: true,
	 *    		drowningDamage: true,
	 *    		fallDamage: true,
	 *    		fireDamage:true,
	 *    		forgiveDeadPlayers: true,
	 *    		freezeDamage: true,
	 *    		keepInventory: false,
	 *    		logAdminCommands: true,
	 *    		maxCommandChainLength: 65536
	 *    		maxEntityCramming: 24,
	 *    		modGreifing: true,
	 *    		naturalRegeneration: true,
	 *    		playersSleeplingPercentage: 100,
	 *    		randomTickSpeed: 3,
	 *    		reducedDebugInfo: false,
	 *    		sendCommandFeedback: true,
	 *    		showDeathMessages: true,
	 *    		spawnRadius: 10,
	 *    		spectatorsGenerateChunks: true,
	 *    		universalAnger: false,
	 *    		
	 *    		}
	 *    	}]
	 * 	}]
	 */
	
}
