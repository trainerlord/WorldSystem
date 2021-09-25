package main.java.net.trainerlord.worldsystem.containers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import com.google.gson.Gson;

import main.java.net.trainerlord.worldsystem.objects.PlayerWorldsObject;
import main.java.net.trainerlord.worldsystem.objects.WorldOwnersObject;

public class PlayerWorldsContainer {
	
	private PlayerWorldsObject data;
	
	public static final File DATA_FILE = new File("plugins//WorldSystem//PlayerWorlds.json");
	
	public PlayerWorldsContainer() {
		Gson gson = new Gson();
		if (DATA_FILE.exists()) 
		{
			try {
				Reader reader = Files.newBufferedReader(DATA_FILE.toPath());
				data = gson.fromJson(reader, PlayerWorldsObject.class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("Error 201: Unable To Read PlayerWorlds Data File");
			}
		} else {
			try {
				data = new PlayerWorldsObject(new ArrayList<>());
				gson.toJson(data, new FileWriter(DATA_FILE));

			} catch(IOException e) {
				System.err.println("Error 202: Unable To Create PlayerWorlds Data File");
				e.printStackTrace();
			}
			
		}
	}
	
	public void SaveData() {
		try {
			Gson gson = new Gson();
			gson.toJson(data, new FileWriter(DATA_FILE));

		} catch(IOException e) {
			System.err.println("Error 203: Unable To Save PlayerWorlds Data File");
			e.printStackTrace();
		}
	}
	
	public void AddPlayerOwner(Player p) {
		data.addWorldOwner(new WorldOwnersObject(p.getUniqueId().toString(), true, null));
	}

}
