// Copyright (c) 2021, Aidan Young
//        All rights reserved.
//
//        This source code is licensed under the BSD-style license found in the
//        LICENSE file in the root directory of this source tree.

package me.gamzer.killkommand;

import me.gamzer.killkommand.commands.killCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class KillKommand extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        killCommand command = new killCommand();
        getCommand("kill").setExecutor(command);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[+] KillKommand: Plugin is enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[-] KillKommand: Plugin is disabled");
    }
}