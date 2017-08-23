package buttondevteam.presents.dictionary.spawning;

import org.bukkit.Particle;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.PlayerCommand;

@CommandClass(path = "dictionary particle", modOnly=true)
public class SpawnParticle extends PlayerCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		player.getWorld().spawnParticle(Particle.CLOUD, player.getLocation(), 10);
		return true;
	}

}
