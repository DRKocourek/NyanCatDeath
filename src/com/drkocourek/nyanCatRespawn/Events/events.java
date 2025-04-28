package com.drkocourek.nyanCatRespawn.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class events implements Listener {

    @EventHandler
    public static void onPlayerDeath(PlayerDeathEvent event){
        Player player = event.getEntity();
        player.playSound(player.getLocation(), "custom.nyan-cat", 1.0f, 1.0f);
    }

}
