package me.semimute.simplevouchers;

import me.semimute.simplevouchers.Commands.VoucherCommand;
import me.semimute.simplevouchers.Listeners.PlayerInteractListener;
import me.semimute.simplevouchers.Managers.DataManager;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleVouchers extends JavaPlugin {
    private static SimpleVouchers plugin;
    public static DataManager data;
    public static FileConfiguration config;
    public static String format(final String string){
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getConfig().options().copyDefaults(true);
        config = getConfig();

        // Event Registers
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);

        // Command Registers
        getCommand("voucher").setExecutor(new VoucherCommand());

    }

    @Override
    public void onDisable() {
    }
    public static SimpleVouchers getPlugin(){
        return plugin;
    }
}
