package rip.oath.oCore;

import com.qrakn.honcho.Honcho;
import lombok.Getter;
import rip.oath.oCore.basics.commands.Clear;
import rip.oath.oCore.basics.commands.Heal;
import rip.oath.oCore.basics.commands.Help;
import rip.oath.oCore.utils.CC;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

/**
 * Discord : Voyagers#4132
 * Date : 8/5/2021 1:46 CN Timezone
 */

public final class oCore extends JavaPlugin     {

    @Getter
    private Honcho honcho;

    @Override
    public void onEnable() {

        honcho = new Honcho(this);


        Arrays.asList(
                new Heal(),
                new Clear(),
                new Help()


        ).forEach(honcho::registerCommand);




        Bukkit.getConsoleSender().sendMessage(CC.translate(" "));
        Bukkit.getConsoleSender().sendMessage(CC.translate("&eoCore loaded"));
        Bukkit.getConsoleSender().sendMessage(CC.translate("&eAuthor : &fOath Development / voyagers258"));
        Bukkit.getConsoleSender().sendMessage(CC.translate("&eDiscord : &f Voyagers#4132 "));
        Bukkit.getConsoleSender().sendMessage(CC.translate(" "));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(CC.translate("&c&loCore disabled"));
    }

}