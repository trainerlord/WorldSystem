package net.trainerlord.worldsystem.events;

import java.util.UUID;

import org.bukkit.WorldCreator;
import org.bukkit.event.HandlerList;


public class WorldCreationEvent extends WorldEvent {

	public final static HandlerList handlers = new HandlerList();
	private final UUID owner;
	private WorldCreator worldCreator;
	
	public WorldCreationEvent(UUID owner, WorldCreator creator) {

		this.owner = owner;
		this.setWorldCreator(creator);
	}


    public final static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return owner of world that gets created
     */
    public UUID getOwner() {
        return owner;
    }

    @Override
    public final HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @return the worldcreator which will be used
     */
    public WorldCreator getWorldCreator() {
        return worldCreator;
    }

    public void setWorldCreator(WorldCreator worldCreator) {
        this.worldCreator = worldCreator;
    }
}
