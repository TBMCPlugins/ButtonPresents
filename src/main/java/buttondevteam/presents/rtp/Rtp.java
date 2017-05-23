package buttondevteam.presents.rtp;

import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.PlayerCommand;

@CommandClass(path = "rtp")
public class Rtp extends PlayerCommand {
	private int currentplace = 0;
	private final coordinate[] teleportLocations = {
			new coordinate(-582,72),
			new coordinate(-838,226),
			new coordinate(-282, 444), //star island
			new coordinate(-654, 202),
			new coordinate(250, 542),
			new coordinate(370, 514),
			new coordinate(-317, 431),
			new coordinate(-273, 556),
			new coordinate(-737, 217)
			};
	
	private class coordinate{
		final int x;
		final int z;

		coordinate(int x, int z){
			this.x = x;
			this.z = z;
		}
	}
	
	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		player.sendMessage("Teleporting...");
		coordinate currentCoordinate = teleportLocations[currentplace];
		
		player.teleport(player.getWorld().getHighestBlockAt(currentCoordinate.x, currentCoordinate.z).getLocation());

		currentplace = (int) (currentplace + Math.floor(Math.random()*5 - 1)) % teleportLocations.length;
		return true;
	}


}
