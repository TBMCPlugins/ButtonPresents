package buttondevteam.presents.components.townyfactions;

import buttondevteam.lib.architecture.Component;
import buttondevteam.lib.architecture.ConfigData;
import buttondevteam.presents.ButtonPresents;
import com.massivecraft.factions.Board;
import com.massivecraft.factions.FLocation;
import com.massivecraft.factions.event.LandClaimEvent;
import com.palmergames.bukkit.towny.TownyAPI;
import com.palmergames.bukkit.towny.event.TownPreClaimEvent;
import com.palmergames.bukkit.towny.exceptions.NotRegisteredException;
import com.palmergames.bukkit.towny.object.Coord;
import com.palmergames.bukkit.towny.object.WorldCoord;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class TownyFactionsComponent extends Component<ButtonPresents> implements Listener {
	@Override
	public void enable() {
		registerListener(this);
	}

	@Override
	protected void disable() {

	}

	/**
	 * Defines how many chunks should be between towns and factions
	 */
	private ConfigData<Integer> distance() {
		return getConfig().getData("distance", 5);
	}

	@EventHandler(ignoreCancelled = true)
	public void onFactionsClaim(LandClaimEvent event) throws NotRegisteredException {
		if (event.getFaction().isWilderness())
			return; //Allow unclaiming
		FLocation chunk = event.getLocation();
		long x = chunk.getX() << 4;
		long z = chunk.getZ() << 4;
		int size = Coord.getCellSize();
		int amount = 16 / size;
		World world = chunk.getWorld();
		int max = 0;
		if (amount < 1) amount = 1; //For plot sizes > 16
		for (int i = 0; i < amount; i++) {
			for (int j = 0; j < amount; j++) {
				Coord coord = Coord.parseCoord(new Location(world, x + i * size, 64, z + j * size));
				int dist = TownyAPI.getInstance().getDataSource().getWorld(world.getName())
						.getMinDistanceFromOtherTownsPlots(coord);
				if (dist > max) max = dist;
			}
		}
		int distance = max / amount;
		if (distance().get() >= distance) {
			event.setCancelled(true);
			event.getfPlayer().sendMessage("§cYou are too close to a town! " + (distance - 1) + " chunks away, " + distance().get() + " is allowed.");
		}
	}

	@EventHandler(ignoreCancelled = true)
	public void onTownyClaim(TownPreClaimEvent event) {
		FLocation coord = new FLocation(getLocation(event.getTownBlock().getWorldCoord()));
		int distance = distance().get();
		for (int i = -distance + 1; i <= distance - 1; i++) {
			for (int j = -distance + 1; j <= distance - 1; j++) {
				if (i * i + j * j <= distance * distance) {
					FLocation chunk = new FLocation(coord.getWorldName(), (int) coord.getX() + i, (int) coord.getZ() + j);
					if (!Board.getInstance().getFactionAt(chunk).isWilderness()) {
						event.setCancelMessage("§cYou are too close to a faction! " + (distance - 1) + " chunks away, " + distance().get() + " is allowed.");
						event.setCancelled(true);
					}
				}
			}
		}
	}

	//https://github.com/TownyAdvanced/Towny/blob/master/src/com/palmergames/bukkit/towny/tasks/DrawSmokeTask.java

	private Location getLocation(WorldCoord coord) { //Based on parseCoord() - needfix would be always false because the remainder is 0
		int cellSize = Coord.getCellSize();
		int xresult = coord.getX() * cellSize;
		int zresult = coord.getZ() * cellSize;
		return new Location(coord.getBukkitWorld(), xresult, 64, zresult);
	}
}
