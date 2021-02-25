// Copyright (c) 2021, Aidan Young
//        All rights reserved.
//
//        This source code is licensed under the BSD-style license found in the
//        LICENSE file in the root directory of this source tree.

package me.gamzer.killkommand.commands;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class killCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("kill")) {
            if (sender instanceof Player) {
                ((Player) sender).setHealth(0);
                sender.sendMessage(ChatColor.GREEN + "[*]" + ChatColor.RESET + " You killed yourself successfully!");
            } else {
                sender.sendMessage(ChatColor.RED + "[!]" + ChatColor.RESET +  " You cannot run this command as a non-player!");
            }
        }
        return true;
    }
}
