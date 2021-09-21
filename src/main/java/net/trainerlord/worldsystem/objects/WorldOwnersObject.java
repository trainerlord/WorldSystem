package main.java.net.trainerlord.worldsystem.objects;

import java.util.List;

public class WorldOwnersObject {
	private String Owner;
	private boolean OwnerPlayer;
	private List<WorldObject> Worlds;
	
	public WorldOwnersObject(String owner, boolean ownerPlayer, List<WorldObject> worlds) {
		super();
		Owner = owner;
		OwnerPlayer = ownerPlayer;
		Worlds = worlds;
	}

	public String getOwner() {
		return Owner;
	}

	public boolean isOwnerPlayer() {
		return OwnerPlayer;
	}

	public List<WorldObject> getWorlds() {
		return Worlds;
	}
	
	public void addWorld(WorldObject newWorld) {
		Worlds.add(newWorld);
	}
	
	public void removeWorldAt(int index) {
		Worlds.remove(index);
	}
	
}
