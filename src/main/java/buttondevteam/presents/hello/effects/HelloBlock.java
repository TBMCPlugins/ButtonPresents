package buttondevteam.presents.hello.effects;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.PlayerCommand;

@CommandClass(path = "hello block")
public class HelloBlock extends PlayerCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		Block blockAtPlayer = player.getWorld().getBlockAt(player.getLocation());
		
		blockAtPlayer.setType(Material.CAKE_BLOCK);
		
		return false;
	}

}
