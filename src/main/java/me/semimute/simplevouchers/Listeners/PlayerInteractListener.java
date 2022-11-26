package me.semimute.simplevouchers.Listeners;

import me.semimute.simplevouchers.SimpleVouchers;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

public class PlayerInteractListener implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        String prefix = SimpleVouchers.config.getString("prefix");
        Player player = event.getPlayer();
        if(event.getHand().equals(EquipmentSlot.HAND)){
            if(!player.getInventory().getItemInMainHand().getType().equals(Material.AIR)){
                if(event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){

                }
            }
        }
    }
}
