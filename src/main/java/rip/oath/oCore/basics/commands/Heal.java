package rip.oath.oCore.basics.commands;

import com.qrakn.honcho.command.CPL;
import com.qrakn.honcho.command.CommandMeta;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import rip.oath.oCore.utils.CC;


@CommandMeta(label = "heal", permission = "ocore.heal")

public class Heal {



    public void execute(Player player) {
        player.setHealth(20.0);
        player.updateInventory();
        player.sendMessage(CC.translate("&aYou have healed by yourself"));
    }

    public void execute(CommandSender sender, Player player) {
        if (player == null) {
            sender.sendMessage(CC.translate("&cPlayer not found!"));
            return;
        }

        player.setHealth(20.0);
        player.setFoodLevel(20);
        player.setSaturation(5.0F);
        player.updateInventory();
        player.sendMessage(CC.translate("&aYou have been healed by " + sender.getName()));
    }
}
