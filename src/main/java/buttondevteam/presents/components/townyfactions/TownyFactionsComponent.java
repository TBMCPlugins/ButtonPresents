package buttondevteam.presents.components.townyfactions;

import buttondevteam.lib.architecture.Component;
import buttondevteam.lib.architecture.ConfigData;
import buttondevteam.presents.ButtonPresents;
import com.massivecraft.factions.entity.BoardColl;
import com.massivecraft.factions.event.EventFactionsChunksChange;
import com.massivecraft.massivecore.ps.PS;
import com.palmergames.bukkit.towny.event.TownPreClaimEvent;
import com.palmergames.bukkit.towny.exceptions.NotRegisteredException;
import com.palmergames.bukkit.towny.object.Coord;
import com.palmergames.bukkit.towny.object.TownyUniverse;
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

	@EventHandler
	public void onFactionsClaim(EventFactionsChunksChange event) throws NotRegisteredException {
		if (event.getNewFaction().isNone())
			return; //Allow unclaiming
		for (PS chunk : event.getChunks()) {
			int x = chunk.getChunkX() * 16;
			int z = chunk.getChunkZ() * 16;
			int size = Coord.getCellSize();
			int amount = size / 16;
			World world = chunk.asBukkitWorld();
			int max = 0;
			for (int i = 0; i < amount; i++) {
				for (int j = 0; j < amount; j++) {
					Coord coord = Coord.parseCoord(new Location(world, x + i * size, 64, z + j * size));
					int dist = TownyUniverse.getDataSource().getWorld(world.getName())
							.getMinDistanceFromOtherTownsPlots(coord);
					if (dist > max) max = dist;
				}
			}
			int distance = max * amount;
			if (distance().get() >= distance) {
				event.setCancelled(true);
				event.getSender().sendMessage("§cYou are too close to a town! " + distance + " chunks away, " + distance().get() + " is allowed.");
			}
		}
	}

	@EventHandler
	public void onTownyClaim(TownPreClaimEvent event) {
		PS coord = PS.valueOf(getLocation(event.getTownBlock().getWorldCoord()));
		int distance = distance().get();
		for (int i = -distance; i <= distance; i++) {
			for (int j = -distance; j <= distance; j++) {
				if (i * i + j * j <= distance * distance) {
					PS chunk = PS.valueOf(coord.getChunkX(true) + i, coord.getChunkZ(true) + j)
							.withWorld(coord.getWorld());
					if (!BoardColl.get().getFactionAt(chunk).isNone()) {
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
