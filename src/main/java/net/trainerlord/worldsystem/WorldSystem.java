package main.java.net.trainerlord.worldsystem;

import org.bukkit.plugin.java.JavaPlugin;

import main.java.net.trainerlord.worldsystem.commands.CommandRegistery;
import main.java.net.trainerlord.worldsystem.commands.WorldSystemCommandTabComplete;

public class WorldSystem extends JavaPlugin
{
	
	/**
	 * Method onEnable
	 * 
	 * Called at the start of the server
	 */
	@Override
	public void onEnable() 
	{
		// Registers all the commands Used by this plugin
		getCommand("ws").setExecutor(new CommandRegistery());
		getCommand("ws").setTabCompleter(new WorldSystemCommandTabComplete());
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

}