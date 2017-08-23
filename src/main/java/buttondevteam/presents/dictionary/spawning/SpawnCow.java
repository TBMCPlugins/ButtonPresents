package buttondevteam.presents.dictionary.spawning;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.PlayerCommand;
@CommandClass(path = "dictionary cow", modOnly=true)
public class SpawnCow extends PlayerCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		player.getWorld().spawnEntity(
				player.getLocation(),
				EntityType.COW
				);
		return true;
	}
}
