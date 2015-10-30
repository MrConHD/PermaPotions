package me.mrconhd.potions;

import com.sun.scenario.Settings;
import me.mrconhd.potions.api.PotionInv;
import me.mrconhd.potions.commands.PermaPotions;
import me.mrconhd.potions.listeners.OnClick;
import me.mrconhd.potions.listeners.OnJoin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Connor on 10/29/2015.
 */
public class Core extends JavaPlugin {

    PotionInv pinv = new PotionInv();

    @Override
    public void onEnable() {
        SettingsManager.getSettingsManager().setup(this);
        pinv.createPotionGUI();
        this.getCommand("permapotions").setExecutor(new PermaPotions());
        getServer().getPluginManager().registerEvents(new OnClick(),this);
        getServer().getPluginManager().registerEvents(new OnJoin(), this);
    }
}
