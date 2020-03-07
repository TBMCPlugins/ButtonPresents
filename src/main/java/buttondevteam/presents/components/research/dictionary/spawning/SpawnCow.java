package buttondevteam.presents.components.research.dictionary.spawning;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

@CommandClass(path = "dictionary cow", modOnly = true)
public class SpawnCow extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player) {
		player.getWorld().spawnEntity(
				player.getLocation(),
				EntityType.COW
		);
		return true;
	}
}
