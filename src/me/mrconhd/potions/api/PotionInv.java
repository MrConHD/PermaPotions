package me.mrconhd.potions.api;

import me.mrconhd.potions.SettingsManager;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Connor on 10/29/2015.
 */
public class PotionInv {

    public static Inventory inv;

    public void createPotionGUI() {
        inv = Bukkit.createInventory(null, 27, SettingsManager.getSettingsManager().getConfig().getString("inventoryTitle").replaceAll("&", "§"));

        ItemStack speed = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 3);
        ItemStack haste = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 4);
        ItemStack strength = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 14);
        ItemStack jumpBoost = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 5);
        ItemStack fireResistance = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 1);
        ItemStack nightVision = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 15);
        ItemStack saturation = new ItemStack(Material.STAINED_GLASS_PANE,1, (short) 12);
        ItemStack border = new ItemStack(Material.IRON_FENCE);

        ItemMeta speedMeta = speed.getItemMeta();
        speedMeta.setDisplayName(SettingsManager.getSettingsManager().getConfig().getString("speedDisplayname").replaceAll("&", "§"));
        speedMeta.setLore(Arrays.asList(SettingsManager.getSettingsManager().getConfig().getString("untoggleLore").replaceAll("&", "§")));
        speed.setItemMeta(speedMeta);

        ItemMeta hasteMeta = haste.getItemMeta();
        hasteMeta.setDisplayName(SettingsManager.getSettingsManager().getConfig().getString("hasteDisplayname").replaceAll("&", "§"));
        hasteMeta.setLore(Arrays.asList(SettingsManager.getSettingsManager().getConfig().getString("untoggleLore").replaceAll("&", "§")));
        haste.setItemMeta(hasteMeta);

        ItemMeta strengthMeta = strength.getItemMeta();
        strengthMeta.setDisplayName(SettingsManager.getSettingsManager().getConfig().getString("strengthDisplayname").replaceAll("&", "§"));
        strengthMeta.setLore(Arrays.asList(SettingsManager.getSettingsManager().getConfig().getString("untoggleLore").replaceAll("&", "§")));
        strength.setItemMeta(strengthMeta);

        ItemMeta jumpMeta = jumpBoost.getItemMeta();
        jumpMeta.setDisplayName(SettingsManager.getSettingsManager().getConfig().getString("jumpDisplayname").replaceAll("&", "§"));
        jumpMeta.setLore(Arrays.asList(SettingsManager.getSettingsManager().getConfig().getString("untoggleLore").replaceAll("&", "§")));
        jumpBoost.setItemMeta(jumpMeta);

        ItemMeta fireMeta = fireResistance.getItemMeta();
        fireMeta.setDisplayName(SettingsManager.getSettingsManager().getConfig().getString("fireDisplayname").replaceAll("&", "§"));
        fireMeta.setLore(Arrays.asList(SettingsManager.getSettingsManager().getConfig().getString("untoggleLore").replaceAll("&", "§")));
        fireResistance.setItemMeta(fireMeta);


        ItemMeta nightMeta = nightVision.getItemMeta();
        nightMeta.setDisplayName(SettingsManager.getSettingsManager().getConfig().getString("nightDisplayname").replaceAll("&", "§"));
        nightMeta.setLore(Arrays.asList(SettingsManager.getSettingsManager().getConfig().getString("untoggleLore").replaceAll("&", "§")));
        nightVision.setItemMeta(nightMeta);

        ItemMeta saturationMeta = saturation.getItemMeta();
        saturationMeta.setDisplayName(SettingsManager.getSettingsManager().getConfig().getString("saturationDisplayname").replaceAll("&", "§"));
        saturationMeta.setLore(Arrays.asList(SettingsManager.getSettingsManager().getConfig().getString("untoggleLore").replaceAll("&", "§")));
        saturation.setItemMeta(saturationMeta);

        ItemMeta borderMeta = border.getItemMeta();
        borderMeta.setDisplayName(" ");
        border.setItemMeta(borderMeta);

        inv.setItem(0, border);
        inv.setItem(1, border);
        inv.setItem(2, border);
        inv.setItem(3, border);
        inv.setItem(4, border);
        inv.setItem(5, border);
        inv.setItem(6, border);
        inv.setItem(7, border);
        inv.setItem(8, border);
        inv.setItem(9, border);
        inv.setItem(10, speed);
        inv.setItem(11, haste);
        inv.setItem(12, strength);
        inv.setItem(13, jumpBoost);
        inv.setItem(14, fireResistance);
        inv.setItem(15,nightVision);
        inv.setItem(16, saturation);
        inv.setItem(17, border);
        inv.setItem(18, border);
        inv.setItem(19, border);
        inv.setItem(20, border);
        inv.setItem(21, border);
        inv.setItem(22, border);
        inv.setItem(23, border);
        inv.setItem(24, border);
        inv.setItem(25, border);
        inv.setItem(26, border);


    }

    public void openInv(Player p) {
        p.openInventory(inv);
    }

    public void setToggle(ItemStack is) {
            ItemMeta im = is.getItemMeta();
        im.setLore(Arrays.asList(SettingsManager.getSettingsManager().getConfig().getString("toggleLore").replaceAll("&", "§")));
            is.setItemMeta(im);
        }

    public void setUnToggle(ItemStack is) {
        ItemMeta im = is.getItemMeta();
        im.setLore(Arrays.asList(SettingsManager.getSettingsManager().getConfig().getString("untoggleLore").replaceAll("&", "§")));
                is.setItemMeta(im);
    }
    }

