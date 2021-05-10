package rip.oath.oCore.basics.commands;

import com.qrakn.honcho.command.CommandMeta;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import rip.oath.oCore.utils.CC;

@CommandMeta(label = { "clearinv", "clear", "ci" }, permission = "ocore.clear")
public class Clear {

    public void execute(Player player) {
        player.getInventory().setContents(new ItemStack[36]);
        player.getInventory().setArmorContents(new ItemStack[4]);
        player.updateInventory();
        player.sendMessage(CC.translate("&aYou cleared the inventory by yourself"));
    }

    public void execute(CommandSender sender, Player player) {
        player.getInventory().setContents(new ItemStack[36]);
        player.getInventory().setArmorContents(new ItemStack[4]);
        player.updateInventory();
        player.sendMessage(CC.translate("&aYour inventory has cleared by" + sender.getName()));
    }

}