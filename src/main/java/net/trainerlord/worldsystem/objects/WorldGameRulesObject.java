package main.java.net.trainerlord.worldsystem.objects;

public class WorldGameRulesObject {
	
	 public WorldGameRulesObject(boolean announceAdvancements, boolean disableElytraMovementCheck, boolean disableRaids,
			boolean doDaylightCycle, boolean doEntityDrops, boolean doFireTick, boolean doInsomnia,
			boolean doImmediateRespawn, boolean doLimitedCrafting, boolean doMobLoot, boolean doMobSpawning,
			boolean doPatrolSpawning, boolean doTileDrops, boolean doTraderSpawning, boolean doWeatherCycle,
			boolean drowningDamage, boolean fallDamage, boolean fireDamage, boolean forgiveDeadPlayers,
			boolean freezeDamage, boolean keepInventory, boolean logAdminCommands, int maxCommandChainLength,
			int maxEntityCramming, boolean modGreifing, boolean naturalRegeneration, int playersSleeplingPercentage,
			int randomTickSpeed, boolean reducedDebugInfo, boolean sendCommandFeedback, boolean showDeathMessages,
			int spawnRadius, boolean spectatorsGenerateChunks, boolean universalAnger) {
		super();
		this.announceAdvancements = announceAdvancements;
		this.disableElytraMovementCheck = disableElytraMovementCheck;
		this.disableRaids = disableRaids;
		this.doDaylightCycle = doDaylightCycle;
		this.doEntityDrops = doEntityDrops;
		this.doFireTick = doFireTick;
		this.doInsomnia = doInsomnia;
		this.doImmediateRespawn = doImmediateRespawn;
		this.doLimitedCrafting = doLimitedCrafting;
		this.doMobLoot = doMobLoot;
		this.doMobSpawning = doMobSpawning;
		this.doPatrolSpawning = doPatrolSpawning;
		this.doTileDrops = doTileDrops;
		this.doTraderSpawning = doTraderSpawning;
		this.doWeatherCycle = doWeatherCycle;
		this.drowningDamage = drowningDamage;
		this.fallDamage = fallDamage;
		this.fireDamage = fireDamage;
		this.forgiveDeadPlayers = forgiveDeadPlayers;
		this.freezeDamage = freezeDamage;
		this.keepInventory = keepInventory;
		this.logAdminCommands = logAdminCommands;
		this.maxCommandChainLength = maxCommandChainLength;
		this.maxEntityCramming = maxEntityCramming;
		this.modGreifing = modGreifing;
		this.naturalRegeneration = naturalRegeneration;
		this.playersSleeplingPercentage = playersSleeplingPercentage;
		this.randomTickSpeed = randomTickSpeed;
		this.reducedDebugInfo = reducedDebugInfo;
		this.sendCommandFeedback = sendCommandFeedback;
		this.showDeathMessages = showDeathMessages;
		this.spawnRadius = spawnRadius;
		this.spectatorsGenerateChunks = spectatorsGenerateChunks;
		this.universalAnger = universalAnger;
	}
	private boolean announceAdvancements = true;
	 private boolean disableElytraMovementCheck = false;
	 private boolean disableRaids = false;
	 private boolean doDaylightCycle = true;
	 private boolean doEntityDrops = true;
	 private boolean doFireTick = true;
	 private boolean doInsomnia = true;
	 private boolean doImmediateRespawn = false;
	 private boolean doLimitedCrafting = false;
	 private boolean doMobLoot = true;
	 private boolean doMobSpawning = true;
	 private boolean doPatrolSpawning = true;
	 private boolean doTileDrops = true;
	 private boolean doTraderSpawning = true;
	 private boolean doWeatherCycle = true;
	 private boolean drowningDamage = true;
	 private boolean fallDamage = true;
	 private boolean fireDamage = true;
	 private boolean forgiveDeadPlayers = true;
	 private boolean freezeDamage = true;
	 private boolean keepInventory = false;
	 private boolean logAdminCommands = true;
	 private int maxCommandChainLength = 65536;
	 private int maxEntityCramming = 24;
	 private boolean modGreifing = true;
	 private boolean naturalRegeneration = true;
	 private int playersSleeplingPercentage = 100;
	 private int randomTickSpeed = 3;
	 private boolean reducedDebugInfo = false;
	 private boolean sendCommandFeedback = true;
	 private boolean showDeathMessages = true;
	 private int spawnRadius = 100;
	 private boolean spectatorsGenerateChunks = true;
	 private boolean universalAnger = false;
	 
	 /**
	  * @return Whether advancements should be announced in chat
	  */
	public boolean isAnnounceAdvancements() {
		return announceAdvancements;
	}
	
	/**
	 * @return Whether the server should skip checking player speed when the player is wearing elytra. Often helps with jittering due to lag in multiplayer.
	 */
	public boolean isDisableElytraMovementCheck() {
		return disableElytraMovementCheck;
	}
	/**
	 * 
	 * @return 	Whether raids are disabled.
	 */
	public boolean isDisableRaids() {
		return disableRaids;
	}
	/**
	 * 
	 * @return 	Whether the daylight cycle and moon phases progress
	 */
	public boolean isDoDaylightCycle() {
		return doDaylightCycle;
	}
	/**
	 * 
	 * @return Whether entities that are not mobs should have drops
	 */
	public boolean isDoEntityDrops() {
		return doEntityDrops;
	}
	
	/**
	 * 
	 * @return Whether fire should spread and naturally extinguish
	 */
	public boolean isDoFireTick() {
		return doFireTick;
	}
	
	/**
	 * 
	 * @return Whether phantoms can spawn in the nighttime
	 */
	public boolean isDoInsomnia() {
		return doInsomnia;
	}
	/**
	 * 
	 * @return 	Players respawn immediately without showing the death screen
	 */
	public boolean isDoImmediateRespawn() {
		return doImmediateRespawn;
	}
	/**
	 * 
	 * @return Whether players should be able to craft only those recipes that they've unlocked first
	 */
	public boolean isDoLimitedCrafting() {
		return doLimitedCrafting;
	}
	/**
	 * 
	 * @return 	Whether mobs should drop items and experience orbs
	 */
	public boolean isDoMobLoot() {
		return doMobLoot;
	}
	/**
	 * 
	 * @return 	Whether mobs should naturally spawn. Does not affect monster spawners.
	 */
	public boolean isDoMobSpawning() {
		return doMobSpawning;
	}
	/**
	 * 
	 * @return 	Whether patrols can spawn
	 */
	public boolean isDoPatrolSpawning() {
		return doPatrolSpawning;
	}
	/**
	 * 
	 * @return 	Whether blocks should have drops
	 */
	public boolean isDoTileDrops() {
		return doTileDrops;
	}
	/**
	 * 
	 * @return  Whether wandering traders can spawn
	 */
	public boolean isDoTraderSpawning() {
		return doTraderSpawning;
	}
	/**
	 * 
	 * @return Whether the weather can change naturally. The /weather command can still change weather.
	 */
	public boolean isDoWeatherCycle() {
		return doWeatherCycle;
	}
	
	/**
	 * 
	 * @return 	Whether the player should take damage when drowning
	 */
	public boolean isDrowningDamage() {
		return drowningDamage;
	}
	
	/**
	 * 
	 * @return 	Whether the player should take fall damage
	 */
	public boolean isFallDamage() {
		return fallDamage;
	}
	/**
	 * 
	 * @return 	Whether the player should take damage in fire, lava, campfires, or on magma blocks
	 */
	public boolean isFireDamage() {
		return fireDamage;
	}
	/**
	 * 
	 * @return 	Makes angered neutral mobs stop being angry when the targeted player dies nearby
	 */
	public boolean isForgiveDeadPlayers() {
		return forgiveDeadPlayers;
	}
	
	/**
	 * 
	 * @return Whether the player should take damage when inside powder snow
	 */
	public boolean isFreezeDamage() {
		return freezeDamage;
	}
	
	/**
	 * 
	 * @return Whether the player should keep items and experience in their inventory after death
	 */
	public boolean isKeepInventory() {
		return keepInventory;
	}
	
	/**
	 * 
	 * @return	Whether to log admin commands to server log
	 */
	public boolean isLogAdminCommands() {
		return logAdminCommands;
	}
	
	/**
	 * 
	 * @return 		The maximum length of a chain of commands that can be executed during one tick. Applies to command blocks and functions.
	 */
	public int getMaxCommandChainLength() {
		return maxCommandChainLength;
	}
	
	/**
	 * 
	 * @return The maximum number of pushable entities a mob or player can push, before taking 3 hearts suffocation damage per half-second. Setting to 0 or lower disables the rule. Damage affects survival-mode or adventure-mode players, and all mobs but bats. Pushable entities include non-spectator-mode players, any mob except bats, as well as boats and minecarts.
	 */
	public int getMaxEntityCramming() {
		return maxEntityCramming;
	}
	
	/**
	 * 
	 * @return Whether creepers, zombies, endermen, ghasts, withers, ender dragons, rabbits, sheep, villagers, silverfish, snow golems, and end crystals should be able to change blocks and whether mobs can pick up items, which also disables bartering. This also affects the capability of zombie-like creatures like zombified piglins and drowned to pathfind to turtle eggs.
	 */
	public boolean isModGreifing() {
		return modGreifing;
	}
	
	/**
	 * 
	 * @return Whether the player can regenerate health naturally if their hunger is full enough (doesn't affect external healing, such as golden apples, the Regeneration effect, etc.)
	 */
	public boolean isNaturalRegeneration() {
		return naturalRegeneration;
	}
	
	/**
	 * 
	 * @return 	What percentage of players must sleep to skip the night.
	 */
	public int getPlayersSleeplingPercentage() {
		return playersSleeplingPercentage;
	}
	
	/**
	 * 
	 * @return How often a random block tick occurs (such as plant growth, leaf decay, etc.) per chunk section per game tick. 0 and negative values disables random ticks, higher numbers increase random ticks. Setting to a high integer results in high speeds of decay and growth. Numbers over 4096 make plant growth or leaf decay instantaneous.
	 */
	public int getRandomTickSpeed() {
		return randomTickSpeed;
	}
	
	/**
	 * 
	 * @return Whether the debug screen shows all or reduced information; and whether the effects of F3 + B (entity hitboxes) and F3 + G (chunk boundaries) are shown.
	 */
	public boolean isReducedDebugInfo() {
		return reducedDebugInfo;
	}
	/**
	 * 
	 * @return Whether the feedback from commands executed by a player should show up in chat. Also affects the default behavior of whether command blocks store their output text
	 */
	public boolean isSendCommandFeedback() {
		return sendCommandFeedback;
	}
	
	/**
	 * 
	 * @return 	Whether death messages are put into chat when a player dies. Also affects whether a message is sent to the pet's owner when the pet dies.
	 */
	public boolean isShowDeathMessages() {
		return showDeathMessages;
	}
	/**
	 * 
	 * @return 	The number of blocks outward from the world spawn coordinates that a player spawns in when first joining a server or when dying without a personal spawnpoint.
	 */
	public int getSpawnRadius() {
		return spawnRadius;
	}
	/**
	 * 
	 * @return 	Whether players in spectator mode can generate chunks
	 */
	public boolean isSpectatorsGenerateChunks() {
		return spectatorsGenerateChunks;
	}
	/**
	 * 
	 * @return	Makes angered neutral mobs attack any nearby player, not just the player that angered them. Works best if forgiveDeadPlayers is disabled.
	 */
	public boolean isUniversalAnger() {
		return universalAnger;
	}

	 
}
