package me.ilgroggo.learncommandsplugin;

import me.ilgroggo.learncommandsplugin.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class LearnCommandsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("god").setExecutor(new GodCommand());
        getCommand("hunger").setExecutor(new FeedCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("health").setExecutor(new HealthCommand());
        getCommand("restoreplayer").setExecutor(new RestorePlayerCommand());


    }
}
