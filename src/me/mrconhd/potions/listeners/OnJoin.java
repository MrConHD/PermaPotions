package me.mrconhd.potions.listeners;

import me.mrconhd.potions.api.PotionInv;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;

/**
 * Created by Connor on 10/29/2015.
 */
public class OnJoin implements Listener{
    PotionInv cInv = new PotionInv();

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        cInv.createPotionGUI();
        for (PotionEffect effect: p.getActivePotionEffects()) {
            p.removePotionEffect(effect.getType());
        }
    }
}
