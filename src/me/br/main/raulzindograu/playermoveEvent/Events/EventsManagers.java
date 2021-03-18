package me.br.main.raulzindograu.playermoveEvent.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EventsManagers implements Listener {

    private void OnMove(PlayerMoveEvent e) {

        Player p = e.getPlayer();
        Inventory Inv = p.getInventory();
        ItemStack item = new ItemStack(Material.GOLD_BLOCK, 1);

        // if(! p.isOnGround()){ } IsOnGround  pode se falar que so quando o jogar pular ira fazer o evento  que está em cima!

        p.sendRawMessage(" §4Você está se movendo !!");
        Inv.addItem(item);
    }
}
