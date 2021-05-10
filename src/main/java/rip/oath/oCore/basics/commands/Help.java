package rip.oath.oCore.basics.commands;

import com.qrakn.honcho.command.CommandMeta;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import rip.oath.oCore.utils.CC;

@CommandMeta(label = "heal", permission = "ocore.heal")


public class Help {


    public void execute(Player player) {
        player.sendMessage(CC.translate("      &fServer Help"));
        player.sendMessage(CC.translate("&eTEST TEST TEST TEST TEST"));
        player.sendMessage(CC.translate("&eTEST TEST TEST TEST TEST"));
        player.sendMessage(CC.translate("&eTEST TEST TEST TEST TEST"));
        player.sendMessage(CC.translate("&eTEST TEST TEST TEST TEST"));
        player.sendMessage(CC.translate("&eTEST TEST TEST TEST TEST"));
        player.sendMessage(CC.translate("&eTEST TEST TEST TEST TEST"));
        player.sendMessage(CC.translate("&eTEST TEST TEST TEST TEST"));
        player.sendMessage(CC.translate("&eTEST TEST TEST TEST TEST"));
        player.sendMessage(CC.translate("&eTEST TEST TEST TEST TEST"));

    }
}
