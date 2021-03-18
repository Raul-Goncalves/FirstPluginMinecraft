package me.br.main.raulzindograu.playermoveEvent;

import me.br.main.raulzindograu.playermoveEvent.Events.EventsManagers;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("§aPlugin está Funcionando!");
        getServer().getPluginManager().registerEvents(new EventsManagers(), this);

    }
}

