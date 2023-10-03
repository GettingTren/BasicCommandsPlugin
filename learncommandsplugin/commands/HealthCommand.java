package me.ilgroggo.learncommandsplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealthCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player p){

            if(p.isInvulnerable()){

                p.setHealth(20);
                p.sendMessage(ChatColor.GREEN + "Your health is now fully restored!");

            }else{

                p.sendMessage(ChatColor.RED + "You cannot do that! you are not in GOD mode! Use /god to become a god and use this command!");

            }

        }

        return true;
    }
}
