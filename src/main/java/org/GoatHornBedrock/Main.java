package org.GoatHornBedrock;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;

public class Main extends JavaPlugin{
    FileConfiguration config = this.getConfig();
    public static float volume = 1f;
    public static float pitch = 1f;
    public void onEnable() {
        config.options().setHeader(Collections.singletonList("Configure the volume and pitch of the goat horns below"));
        config.addDefault("volume", volume);
        config.addDefault("pitch", pitch);
        config.options().copyDefaults(true);
        saveConfig();
        getServer().getPluginManager().registerEvents(new HornListener(), this);

        volume = (float) config.getDouble("volume");
        volume = (float) config.getDouble("volume");
    }
}