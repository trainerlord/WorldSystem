package net.trainerlord.worldsystem.commands.players;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.trainerlord.worldsystem.api.WSWorlds;
import net.trainerlord.worldsystem.containers.PlayerWorldsContainer;
import net.trainerlord.worldsystem.objects.PlayerWorldsObject;
import net.trainerlord.worldsystem.objects.WorldGameRulesObject;
import net.trainerlord.worldsystem.objects.WorldObject;

public class CommandGet {
	
	private CommandSender sender;
	private Command command;
	private String label;
	private String[] args;
	
	/**
	 * The Get Commands Constructor
	 * 
	 * @param sender
	 * @param command
	 * @param label
	 * @param args
	 */
	public CommandGet(CommandSender sender, Command command, String label, String[] args) {
		this.sender = sender;
		this.command = command;
		this.label = label;
		this.args = args;
	}
	
	
	/**
	 * Runs the Command Get
	 * 
	 * @return returns if the command ran successfully
	 */
	public boolean run() {
			if (sender instanceof Player) 
			{
				Player p = (Player) sender;
				
				if (!p.hasPermission("ws.get")) {
					p.sendMessage("To Add");
					return false;
				}
				
				
				//Multi Templates
				
				//Create World
				WSWorlds.createNew(p, 0);
				
				p.sendMessage("Created World Successfully");
				return true;
			}
			
			sender.sendMessage("No Console");
			return false;
	}
}
