package net.trainerlord.worldsystem.configs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;


import net.trainerlord.worldsystem.WorldSystem;

public class LanguageConfig 
{
	private static File file;

	/**
	 * Checks and makes Sure the Language File Exists
	 * and If Not it creates a new one
	 * 
	 * @param f The specified Language File
	 */
	public static void checkLanguageConfig(File f) {
		file = f;
		if(!file.exists()) {
			try {
				InputStream in = WorldSystem.getInstance().getResource("languages/" + f.getName());
				
				if (in == null) {
					in = WorldSystem.getInstance().getResource("custom.yml");
				}
				
				Files.copy(in, file.toPath());
			}
			catch (IOException e) {
				System.err.println("Wasn't able to create Language file");
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * The Data inside the Langage yaml File
	 * 
	 * @return Returns the YAML data from the language File
	 */
	private static YamlConfiguration getConfig() {
		try {
			return YamlConfiguration.loadConfiguration(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
