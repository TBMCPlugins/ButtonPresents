package buttondevteam.presents.hello.effects;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class HelloBedsplode implements Listener {
	@EventHandler
	public void onSleep(PlayerBedEnterEvent event){
		Player player = event.getPlayer();
		if (player.getName().toLowerCase() != "alisolarflare") return;
		
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
