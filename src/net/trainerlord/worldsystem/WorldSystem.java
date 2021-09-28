package net.trainerlord.worldsystem;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.trainerlord.worldsystem.commands.CommandRegistery;
import net.trainerlord.worldsystem.commands.WorldSystemCommandTabComplete;
import net.trainerlord.worldsystem.configs.LanguageConfig;
import net.trainerlord.worldsystem.utils.CreatorAdapter;

public class WorldSystem extends JavaPlugin
{
	
	private CreatorAdapter creator;
	/**
	 * Method onEnable
	 * 
	 * Called at the start of the server
	 */
	@Override
	public void onEnable() 
	{
		
		makeDirAndConfigs();
		// Registers all the commands Used by this plugin
		getCommand("ws").setExecutor(new CommandRegistery());
		getCommand("ws").setTabCompleter(new WorldSystemCommandTabComplete());
		
		
		
		
		creator = (c, r) -> {
            Bukkit.getWorlds().add(c.createWorld());
            r.run();
        };
	}
	
	
	
	/**
	 * onDisable
	 * 
	 * Called at the closer of the server
	 */
	@Override
	public void onDisable() {
		
	}
	
	
	/**
	 * Gets the current Running Instance of the PLugin
	 * 
	 * @return returns the Core Instance of the Plugin
	 */
	 public static WorldSystem getInstance() {
	        return JavaPlugin.getPlugin(WorldSystem.class);
	    }
	 
	 private void makeDirAndConfigs() {
		 File folder = getInstance().getDataFolder();
		 File dir = new File(folder + "/worldsources");
		 File languages = new File(folder + "/languages");
		 
		 if (!dir.exists()) 
	            dir.mkdirs();

		 if (!languages.exists())
	            languages.mkdirs();
		 
		 LanguageConfig.checkAllLanguageConfigs();
	 }
	 
	 public CreatorAdapter getAdapter() {
		 return creator;
	 }

}
