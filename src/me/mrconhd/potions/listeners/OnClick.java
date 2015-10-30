package me.mrconhd.potions.listeners;

import me.mrconhd.potions.SettingsManager;
import me.mrconhd.potions.api.PotionInv;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;

/**
 * Created by Connor on 10/29/2015.
 */
public class OnClick implements Listener {


    PotionInv pinv = new PotionInv();

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getInventory().getName().equals(SettingsManager.getSettingsManager().getConfig().getString("inventoryTitle").replaceAll("&", "§"))) {
            if ((e.getCurrentItem().getType() != Material.STAINED_GLASS_PANE) || (e.getCurrentItem().getType() != Material.IRON_FENCE)) {
                e.setCancelled(true);
            }
            Player p = (Player) e.getWhoClicked();
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(SettingsManager.getSettingsManager().getConfig().getString("speedDisplayname").replaceAll("&", "§"))) {
                if (p.hasPotionEffect(PotionEffectType.SPEED)) {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("untoggleMessage").replaceAll("&", "§"));
                    p.removePotionEffect(PotionEffectType.SPEED);
                    pinv.setUnToggle(e.getCurrentItem());
                } else {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("toggleMessage").replaceAll("&", "§"));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
                    pinv.setToggle(e.getCurrentItem());
                }

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(SettingsManager.getSettingsManager().getConfig().getString("hasteDisplayname").replaceAll("&", "§"))) {
                if (p.hasPotionEffect(PotionEffectType.FAST_DIGGING)) {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("untoggleMessage").replaceAll("&", "§"));
                    p.removePotionEffect(PotionEffectType.FAST_DIGGING);
                    pinv.setUnToggle(e.getCurrentItem());
                } else {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("toggleMessage").replaceAll("&", "§"));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Integer.MAX_VALUE, 1));
                    pinv.setToggle(e.getCurrentItem());
                }

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(SettingsManager.getSettingsManager().getConfig().getString("strengthDisplayname").replaceAll("&", "§"))) {
                if (p.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("untoggleMessage").replaceAll("&", "§"));
                    p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
                    pinv.setUnToggle(e.getCurrentItem());
                } else {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("toggleMessage").replaceAll("&", "§"));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1));
                    pinv.setToggle(e.getCurrentItem());
                }

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(SettingsManager.getSettingsManager().getConfig().getString("jumpDisplayname").replaceAll("&", "§"))) {
                if (p.hasPotionEffect(PotionEffectType.JUMP)) {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("untoggleMessage").replaceAll("&", "§").replaceAll("&", "§"));
                    p.removePotionEffect(PotionEffectType.JUMP);
                    pinv.setUnToggle(e.getCurrentItem());
                } else {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("toggleMessage").replaceAll("&", "§").replaceAll("&", "§"));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 0));
                    pinv.setToggle(e.getCurrentItem());
                }

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(SettingsManager.getSettingsManager().getConfig().getString("fireDisplayname").replaceAll("&", "§"))) {
                if (p.hasPotionEffect(PotionEffectType.FIRE_RESISTANCE)) {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("untoggleMessage").replaceAll("&", "§"));
                    p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                    pinv.setUnToggle(e.getCurrentItem());
                } else {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("toggleMessage").replaceAll("&", "§"));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 0));
                    pinv.setToggle(e.getCurrentItem());
                }

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(SettingsManager.getSettingsManager().getConfig().getString("nightDisplayname").replaceAll("&", "§"))) {
                if (p.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("untoggleMessage").replaceAll("&", "§"));
                    p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                    pinv.setUnToggle(e.getCurrentItem());
                } else {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("toggleMessage").replaceAll("&", "§"));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 0));
                    pinv.setToggle(e.getCurrentItem());
                }

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(SettingsManager.getSettingsManager().getConfig().getString("saturationDisplayname").replaceAll("&", "§"))) {
                if (p.hasPotionEffect(PotionEffectType.SATURATION)) {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("untoggleMessage").replaceAll("&", "§"));
                    p.removePotionEffect(PotionEffectType.SATURATION);
                    pinv.setUnToggle(e.getCurrentItem());
                } else {
                    p.sendMessage(SettingsManager.getSettingsManager().getConfig().getString("toggleMessage").replaceAll("&", "§"));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, Integer.MAX_VALUE, 0));
                    pinv.setToggle(e.getCurrentItem());
                }

            }


        }
    }
}



