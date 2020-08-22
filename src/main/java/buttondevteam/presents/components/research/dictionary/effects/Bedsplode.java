package buttondevteam.presents.components.research.dictionary.effects;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class Bedsplode implements Listener {
	@EventHandler
	public void onSleep(PlayerBedEnterEvent event){
		Player player = event.getPlayer();
		player.sendMessage("[ButtonPresents] Nighty night " + player.getName().toLowerCase());
		if (!player.getName().toLowerCase().equalsIgnoreCase("alisolarflare")) return;
		player.sendMessage("Your Bed's Material is: " + event.getBed().getBlockData().getMaterial().toString());
		
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
