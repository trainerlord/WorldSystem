package net.trainerlord.worldsystem.containers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import com.google.gson.Gson;

import net.trainerlord.worldsystem.objects.PlayerWorldsObject;
import net.trainerlord.worldsystem.objects.WorldObject;
import net.trainerlord.worldsystem.objects.WorldOwnersObject;

public class PlayerWorldsContainer {
	
	private PlayerWorldsObject data;
	
	
	public PlayerWorldsContainer() {
		File dataFile = new File("plugins//WorldSystem//PlayerWorlds.json");
		Gson gson = new Gson();
		if (dataFile.exists()) 
		{
			try {
				Reader reader = Files.newBufferedReader(dataFile.toPath());
				data = gson.fromJson(reader, PlayerWorldsObject.class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("Error 201: Unable To Read PlayerWorlds Data File");
			}
		} else {
			try {
				FileWriter fileWriter = new FileWriter("plugins//WorldSystem//PlayerWorlds.json");
				data = new PlayerWorldsObject(new ArrayList<>());
				gson.toJson(data, fileWriter);
				fileWriter.close();

			} catch(IOException e) {
				System.err.println("Error 202: Unable To Create PlayerWorlds Data File");
				e.printStackTrace();
			}
			
		}
	}
	
	public void SaveData() {
		File dataFile = new File("plugins//WorldSystem//PlayerWorlds.json");
		Gson gson = new Gson();
		try {
			FileWriter fileWriter = new FileWriter("plugins//WorldSystem//PlayerWorlds.json");
			gson.toJson(data, fileWriter);
			fileWriter.close();

		} catch(IOException e) {
			System.err.println("Error 203: Unable To Save PlayerWorlds Data File");
			e.printStackTrace();
		}
	}
	
	public void AddPlayerOwner(Player p) {
		data.addWorldOwner(new WorldOwnersObject(p.getUniqueId().toString(), true, new ArrayList<>()));
	}
	
	public void addNewWorldToPlayer(Player p, WorldObject newWorld) {
		data.addNewWorld(p.getUniqueId().toString(), newWorld);
	}
	
	public int getOwnersWorldCount(Player p) {
		return data.getOwnerWorldCount(p.getUniqueId().toString());
	}
	
	public WorldOwnersObject getWorldOwner(Player p) {
		
		
		for(WorldOwnersObject member : data.getWorldOwners()) { 
			if (member.getOwner().equals(p.getUniqueId().toString()))
				return member;
		}
		
		return null;
	}

}
