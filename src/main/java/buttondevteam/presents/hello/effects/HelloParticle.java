package buttondevteam.presents.hello.effects;

import org.bukkit.Particle;
import org.bukkit.entity.Player;

import buttondevteam.presents.architecture.commands.PlayerCommand;

public class HelloParticle extends PlayerCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		player.getWorld().spawnParticle(Particle.CLOUD, player.getLocation(), 10);
		return false;
	}

}
