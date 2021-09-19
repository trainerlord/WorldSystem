package net.trainerlord.worldsystem.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.trainerlord.worldsystem.commands.players.CommandGet;

public class CommandRegistery implements CommandExecutor
{
	/**
	 * The function that runs and this command is called
	 *
	 * @param sender
	 * @param command
	 * @param label
	 * @parom args
	 */
	//TODO Function Descriptions
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (args.length == 0)
		{
			return false;
		}
		
		switch (args[0]) {
			case "get":
				return new CommandGet(sender,command,label,args).run();
			default:
				return false;
		}
	}

}
