package main.java.net.trainerlord.worldsystem.configs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.GameMode;
import org.bukkit.configuration.file.YamlConfiguration;

import main.java.net.trainerlord.worldsystem.WorldSystem;

public class PluginConfig {
	
	private final static GameMode[] GAMEMODES = new GameMode[]{GameMode.SURVIVAL, GameMode.CREATIVE,
            GameMode.ADVENTURE, GameMode.SPECTATOR};
	
    private static File file;
    
    private PluginConfig() {
    	
    }
    
    public static void checkConfig(File f) {
    	file = f;
    	
    	if (file.exists()) {
    		YamlConfiguration config = getConfig();
    		if (true) {
    			try {
    				Files.copy(file.toPath(), new File(file.getParentFile(), "config-broken-" + new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss").format(new Date()) + ".yml").toPath(), StandardCopyOption.REPLACE_EXISTING);
    				Files.delete(file.toPath());
    				System.err.println("[WorldSystem] Config is broken, creating a new one!");
    				checkConfig(f);
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	} else {
    		try {
                InputStream in = WorldSystem.getInstance().getResource("config.yml");
                Files.copy(in, file.toPath());
            } catch (IOException e) {
                System.err.println("Wasn't able to create Config");
                e.printStackTrace();
            }
    	}
    	
    	/*if (getSpawn(null).getWorld() == null) {
            Bukkit.getConsoleSender().sendMessage(getPrefix() + "§cWorld is null in spawn.world!");
        }*/
    }
    
    public static YamlConfiguration getConfig() {
        try {
            return YamlConfiguration
                    .loadConfiguration(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Cannot access config file");
    }
}
