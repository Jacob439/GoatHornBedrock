package org.GoatHornBedrock;

import org.bukkit.Material;
import org.bukkit.MusicInstrument;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.MusicInstrumentMeta;
import org.geysermc.api.Geyser;

import static org.bukkit.Bukkit.getLogger;
import static org.GoatHornBedrock.Main.volume;
import static org.GoatHornBedrock.Main.pitch;

public class HornListener implements Listener {
    @EventHandler
    public void onGoatHornPickup(EntityPickupItemEvent event) {
        ItemStack item = event.getItem().getItemStack();
        if (item.getType().equals(Material.GOAT_HORN) && event.getEntity() instanceof Player && Geyser.api().isBedrockPlayer(event.getEntity().getUniqueId())) {
            MusicInstrumentMeta meta = (MusicInstrumentMeta) item.getItemMeta();
            if (meta != null && meta.getInstrument() == null) {
                //Could implement logic here to randomize the horn effect
                meta.setInstrument(MusicInstrument.SEEK_GOAT_HORN);
                item.setItemMeta(meta);
            }
        }
    }
    @EventHandler
    public void onGoatHornSound(PlayerInteractEvent event) {
        ItemStack item = event.getItem();
        Player player = event.getPlayer();
        if (Geyser.api().isBedrockPlayer(player.getUniqueId()) && item != null && item.getType() == Material.GOAT_HORN && !player.hasCooldown(Material.GOAT_HORN)) {
            MusicInstrumentMeta meta = (MusicInstrumentMeta) item.getItemMeta();
            if (meta != null) {
                MusicInstrument horn = meta.getInstrument();
                if (horn == null) {
                    return;
                }
                org.bukkit.Location loc = player.getLocation();
                switch (horn.getKey().getKey()){
                    case "ponder_goat_horn":
                        player.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_0, volume, pitch);
                        break;
                    case "sing_goat_horn":
                        player.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_1, volume, pitch);
                        break;
                    case "seek_goat_horn":
                        player.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_2, volume, pitch);
                        break;
                    case "feel_goat_horn":
                        player.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_3, volume, pitch);
                        break;
                    case "admire_goat_horn":
                        player.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_4, volume, pitch);
                        break;
                    case "call_goat_horn":
                        player.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_5, volume, pitch);
                        break;
                    case "yearn_goat_horn":
                        player.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_6, volume, pitch);
                        break;
                    case "dream_goat_horn":
                        player.playSound(loc, Sound.ITEM_GOAT_HORN_SOUND_7, volume, pitch);
                        break;
                    default:
                        getLogger().warning("INVALID GOAT HORN");
                }
            }
        }

    }
}
