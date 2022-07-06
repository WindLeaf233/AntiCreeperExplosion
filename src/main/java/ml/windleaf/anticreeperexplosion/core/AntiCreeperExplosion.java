package ml.windleaf.anticreeperexplosion.core;

import ml.windleaf.api.logging.PluginLogger;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.ChatColor.*;

public final class AntiCreeperExplosion extends JavaPlugin {

    public static PluginLogger logger = new PluginLogger(AntiCreeperExplosion.class.getSimpleName());
    public static String version = "1.0.0";

    @Override
    public void onEnable() {
        logger.setLoggerColor(GREEN);
        logger.logConsole("%sLoading %sAntiCreeperExplosion%s...".formatted(GREEN, DARK_GREEN, GREEN));

        logger.logConsole("%sYou are on version %s%s".formatted(GREEN, AQUA, version));
    }

    @Override
    public void onDisable() {

    }
}
