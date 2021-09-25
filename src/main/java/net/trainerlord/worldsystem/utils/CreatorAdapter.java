package main.java.net.trainerlord.worldsystem.utils;

import org.bukkit.WorldCreator;

/**
 * @author Butzlabben
 * @since 07.06.2018
 */
public interface CreatorAdapter {

    void create(WorldCreator creator, Runnable sendPlayerMessageCallback);
}