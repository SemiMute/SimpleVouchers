package me.semimute.simplevouchers.Managers;

import me.semimute.simplevouchers.SimpleVouchers;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigManager {
    private static File file;
    private static FileConfiguration customFile;


    public static void reloadConfig(){
        SimpleVouchers.config = YamlConfiguration.loadConfiguration(new File(SimpleVouchers.getPlugin().getDataFolder(), "config.yml"));
    }
    // generates config file
    public static void setup(){
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("SimpleVouchers").getDataFolder(), "config.yml");
        if(!file.exists()){
            try{
                file.createNewFile();
            } catch(IOException e){

            }
        }
        customFile = YamlConfiguration.loadConfiguration(file);
    }
    public static FileConfiguration get(){
        return customFile;
    }
    public static void save(){
        try{
            customFile.save(file);
        } catch(IOException e){
            System.out.println("Failed to save config.yml file. Sorry!");
        }
    }
    public static void reload(){
        customFile = YamlConfiguration.loadConfiguration(file);
    }
}
