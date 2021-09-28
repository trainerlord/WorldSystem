package net.trainerlord.worldsystem.api;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import net.trainerlord.worldsystem.WorldSystem;
import net.trainerlord.worldsystem.configs.LanguageConfig;
import net.trainerlord.worldsystem.containers.PlayerWorldsContainer;
import net.trainerlord.worldsystem.events.WorldCreationEvent;
import net.trainerlord.worldsystem.objects.WorldGameRulesObject;
import net.trainerlord.worldsystem.objects.WorldObject;
import net.trainerlord.worldsystem.objects.WorldOwnersObject;

import org.bukkit.WorldCreator;

public class WSWorlds {

  private WorldObject world;

  public static void create(Player p, int WorldNumber) {
	  Bukkit.getScheduler().runTask(WorldSystem.getInstance(), () -> {
		  
		 
		  
		  
          PlayerWorldsContainer playerWorlds = new PlayerWorldsContainer();
          System.out.println(playerWorlds);
          WorldOwnersObject playerData = playerWorlds.getWorldOwner(p);
          System.out.println(playerData);
          String worldname = playerData.getWorlds().get(WorldNumber).getWorldName();
          WorldCreator creator = new WorldCreator(worldname);

          WorldCreationEvent event = new WorldCreationEvent(p.getUniqueId(), creator);
	        Bukkit.getPluginManager().callEvent(event);
	        if (event.isCancelled())
	            return;
          
          
          String worlddir = "plugins/WorldSystem/Worlds"; //TODO

          File newworld = new File(worlddir + "/" + p.getUniqueId().toString() + "/" + worldname);

          //Templated World Code

          newworld.mkdirs();
          new BukkitRunnable() {
            @Override
            public void run() {
              WorldSystem.getInstance().getAdapter().create( event.getWorldCreator() , () -> {
                // Fix for #16
                new BukkitRunnable() {
                  @Override
                  public void run() {
                    if (p != null && p.isOnline()) {
                      p.sendMessage(LanguageConfig.getWorldCreated());
                      /*SettingsConfig.getCommandsonGet().stream()
                        .map(s -> s.replace("%player", p.getName()).replace("%world", sw.getName())
                          .replace("%uuid", p.getUniqueId().toString()))
                        .forEach(s -> Bukkit.dispatchCommand(Bukkit.getConsoleSender(), s));*/
                    }
                  }
                }.runTask(WorldSystem.getInstance());
              });
            }
          }.runTaskLater(WorldSystem.getInstance(), 1);
	  });

        }

        public static void createNew(Player p, int WorldNumber) {
          PlayerWorldsContainer playerWorlds = new PlayerWorldsContainer();
          playerWorlds.AddPlayerOwner(p);
          WorldObject w = new WorldObject(p.getUniqueId().toString() + "-" + playerWorlds.getOwnersWorldCount(p),
            false, null, 96351635, "NORMAL", "NORMAL", "", true, new WorldGameRulesObject());
          playerWorlds.addNewWorldToPlayer(p, w);
          playerWorlds.SaveData();

          create(p, WorldNumber);
        }
        
        public static void tryUnloadLater(World w) {
        	
        }
        
      }