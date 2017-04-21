package buttondevteam.presents.hello.effects;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import buttondevteam.presents.architecture.commands.PlayerCommand;

public class HelloBlock extends PlayerCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		player.getWorld().getBlockAt(player.getLocation()).setType(Material.CAKE_BLOCK);
		return false;
	}
	public String GetCommandPath(){
		return "hello block";
	}

}
