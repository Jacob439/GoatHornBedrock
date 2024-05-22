package org.example;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandGoatSound implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            player.playSound(player.getLocation(), Sound.ITEM_GOAT_HORN_SOUND_2, 1f, 1f);
        }
        return true;
    }
}
