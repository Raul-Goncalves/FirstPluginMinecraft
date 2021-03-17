package br.com.volp.tutorial.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EventsClass implements Listener {

	@EventHandler
	private void onMove(PlayerMoveEvent event) {

		Player player = event.getPlayer();
		Inventory pIven = player.getInventory();
		ItemStack item = new ItemStack(Material.APPLE, 1);

//		if(!player.isOnGround()) {# CASO QUEIRA QUE O PLAYER RECEBA O ITEM QUANDO FAZ ALGUM PULO OU CAIR DE UM BLOCO
		player.sendMessage("&4Voc� est� se movendo!");
		pIven.addItem(item);

	}
}
