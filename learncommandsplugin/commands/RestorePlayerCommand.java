package me.ilgroggo.learncommandsplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RestorePlayerCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player p){

            if(p.isInvulnerable()){

                p.setFoodLevel(20);
                p.setHealth(20);
                p.sendMessage(ChatColor.GREEN + "Your health and hunger are now full!");

            }else{

                p.sendMessage(ChatColor.RED + "You cannot do that! you are not in GOD mode! Use /god to become a god and use this command!");

            }

        }

        return true;
    }
}
