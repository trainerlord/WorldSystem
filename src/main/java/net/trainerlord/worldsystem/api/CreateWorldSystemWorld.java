package main.java.net.trainerlord.worldsystem.api;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.WorldCreator;

import main.java.net.trainerlord.worldsystem.WorldSystem;
import main.java.net.trainerlord.worldsystem.configs.LanguageConfig;
import main.java.net.trainerlord.worldsystem.containers.PlayerWorldsContainer;
import main.java.net.trainerlord.worldsystem.objects.WorldGameRulesObject;
import main.java.net.trainerlord.worldsystem.objects.WorldObject;
import main.java.net.trainerlord.worldsystem.objects.WorldOwnersObject;

public class CreateWorldSystemWorld {

  private WorldObject world;

  public static void create(Player p, int WorldNumber) {
	  Bukkit.getScheduler().runTask(WorldSystem.getInstance(), () -> {
          PlayerWorldsContainer playerWorlds = new PlayerWorldsContainer();
          WorldOwnersObject playerData = playerWorlds.getWorldOwner(p);
          String worldname = playerData.getWorlds().get(WorldNumber).getWorldName();
          WorldCreator creator = new WorldCreator(worldname);

          String worlddir = "plugins/WorldSystem/Worlds"; //TODO

          File newworld = new File(worlddir + "/" + p.getUniqueId().toString() + "/" + worldname);

          //Templated World Code

          newworld.mkdirs();

          new BukkitRunnable() {
            @Override
            public void run() {
              WorldSystem.getInstance().getAdapter().create( /*event.getWorldCreator()*/ null , () -> {
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
          WorldObject w = new WorldObject(p.getUniqueId().toString() + ": " + playerWorlds.getOwnersWorldCount(p),
            false, null, 96351635, "NORMAL", "NORMAL", "", true, new WorldGameRulesObject());
          playerWorlds.addNewWorldToPlayer(p, w);
          playerWorlds.SaveData();

          create(p, WorldNumber);
        }
        
      }