package me.mrconhd.potions.commands;

import me.mrconhd.potions.api.PotionInv;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Connor on 10/29/2015.
 */
public class PermaPotions implements CommandExecutor {

    PotionInv pinv = new PotionInv();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("permapotions")) {
            if (sender instanceof Player) {
             Player p = (Player) sender;
                if (p.hasPermission("totalpots.use")) {
                    pinv.openInv(p);
                } else {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR: &r&c&oreloYou do not have permission to use this command!"));
                }

            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR: &r&c&oYou do not have permission to run this command"));
            }
        }
        return true;
    }
}
