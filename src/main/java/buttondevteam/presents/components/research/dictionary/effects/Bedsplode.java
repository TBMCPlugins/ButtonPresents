package buttondevteam.presents.components.research.dictionary.effects;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class Bedsplode implements Listener {
	@EventHandler
	public void onSleep(PlayerBedEnterEvent event){
		Player player = event.getPlayer();
		if(event.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK) {
			player.sendMessage("[ButtonPresents] Nighty night " + player.getName().toLowerCase());
		}
		if (!player.getName().toLowerCase().equalsIgnoreCase("alisolarflare")) return;
		if (event.getBed().getType() == Material.BLUE_BED) return;

		player.getWorld().createExplosion(
				player.getLocation().getBlockX(),
				player.getLocation().getBlockY(),
				player.getLocation().getBlockZ(),
				4,      //power
				false,  //setfire
				false); //breakblocks
		
		player.sendMessage("HELLO MOTHERFUCKER!");
		player.sendMessage("WAKEY WAKEY!");
	}
}
