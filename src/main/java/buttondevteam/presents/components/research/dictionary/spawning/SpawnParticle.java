package buttondevteam.presents.components.research.dictionary.spawning;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

@CommandClass(path = "dictionary particle", modOnly = true)
public class SpawnParticle extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player) {
		player.getWorld().spawnParticle(Particle.CLOUD, player.getLocation(), 10);
		return true;
	}

}
