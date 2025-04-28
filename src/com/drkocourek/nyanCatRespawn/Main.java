package com.drkocourek.nyanCatRespawn;

import com.drkocourek.nyanCatRespawn.Events.events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new events(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Nyan cat respawn plugin enabled!");
    }

    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Nyan cat respawn plugin disabled!");
    }


}
