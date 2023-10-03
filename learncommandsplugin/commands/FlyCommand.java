package me.ilgroggo.learncommandsplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player p){

            if(p.isInvulnerable()){

                if(p.getAllowFlight()){

                    p.setAllowFlight(false);
                    p.sendMessage(ChatColor.RED + "You can no longer fly");

                }else{

                    p.setAllowFlight(true);
                    p.sendMessage(ChatColor.GREEN + "You can fly now!");

                }

            }else{

                p.sendMessage(ChatColor.RED + "You cannot do that! you are not in GOD mode! Use /god to become a god and use this command!");

            }

        }

        return true;
    }
}
