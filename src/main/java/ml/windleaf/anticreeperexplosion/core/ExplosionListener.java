package ml.windleaf.anticreeperexplosion.core;

import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class ExplosionListener implements Listener {
    @EventHandler
    public void explosion(EntityExplodeEvent e) {
        if (e.getEntity() instanceof Creeper) {
            e.setCancelled(true);
        }
    }
}
