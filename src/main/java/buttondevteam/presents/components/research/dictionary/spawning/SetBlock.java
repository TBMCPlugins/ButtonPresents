package buttondevteam.presents.components.research.dictionary.spawning;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.PlayerCommand;

@CommandClass(path = "dictionary block", modOnly=true)
public class SetBlock extends PlayerCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		Block blockAtPlayer = player.getWorld().getBlockAt(player.getLocation());
		
		blockAtPlayer.setType(Material.CAKE_BLOCK);
		
		return true;
	}

}
