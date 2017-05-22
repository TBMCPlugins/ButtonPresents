package buttondevteam.presents.hello.effects;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.PlayerCommand;
@CommandClass(path = "hello cow")
public class HelloCow extends PlayerCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		player.getWorld().spawnEntity(
				player.getLocation(),
				EntityType.COW
				);
		return true;
	}
}
