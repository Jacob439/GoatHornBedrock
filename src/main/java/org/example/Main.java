package org.example;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    FileConfiguration config = getConfig();

    public void onEnable() {
        getLogger().info("onEnable is called!");
        getServer().getPluginManager().registerEvents(new HornListener(), this);
        this.getCommand("goat2").setExecutor(new CommandGoatSound());
    }
}