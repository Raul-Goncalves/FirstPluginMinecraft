package br.com.volp.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

import br.com.volp.tutorial.events.EventsClass;

public class Tutorial extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§aplugin ativo");
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§4plugin desativado");
	}

}
