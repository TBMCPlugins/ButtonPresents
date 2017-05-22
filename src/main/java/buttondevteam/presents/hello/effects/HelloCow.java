package buttondevteam.presents.hello.effects;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import buttondevteam.presents.architecture.commands.PlayerCommand;

public class HelloCow extends PlayerCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		player.getWorld().spawnEntity(
				player.getLocation(),
				EntityType.COW
				);
		return true;
	}

	@Override
	public boolean GetModOnly() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String GetCommandPath(){
		return "hello cow";
	}
}
