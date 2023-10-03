package me.ilgroggo.learncommandsplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] strings) {

        if(commandSender instanceof Player p){

            if(p.isInvulnerable()){

                p.setInvulnerable(false);
                p.sendMessage(ChatColor.RED + "You are no more invincible!");

            }else{

                p.setInvulnerable(true);
                p.sendMessage(ChatColor.GREEN + "You are now invincible!");

            }
        }

        return true;
    }
}
