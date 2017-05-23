package buttondevteam.presents.rtp;

import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.PlayerCommand;

@CommandClass(path = "rtp")
public class Rtp extends PlayerCommand {
	final coordinate[] places = {
			new coordinate(-582,72),
			new coordinate(-772, 140),
			new coordinate(-838,226),
			new coordinate(-282, 444), //star island
			new coordinate(-654, 202),
			new coordinate(250, 542),
			new coordinate(370, 514),
			new coordinate(-317, 431),
			new coordinate(-273, 556),
			new coordinate(-737, 217)
			};
	int currentplace = 0;
	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		coordinate currentCoordinate = places[currentplace];
		
		player.teleport(player.getWorld().getHighestBlockAt(currentCoordinate.x, currentCoordinate.z).getLocation());
		
		currentplace = (int) (currentplace + Math.floor(Math.random()*4 - 1)) % places.length;
		return false;
	}

	private class coordinate{
		final int x;
		final int z;

		public coordinate(int x, int z){
			this.x = x;
			this.z = z;
		}
	}
}
