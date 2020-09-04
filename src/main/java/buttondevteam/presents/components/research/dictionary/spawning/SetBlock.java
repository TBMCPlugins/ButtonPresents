package buttondevteam.presents.components.research.dictionary.spawning;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

@CommandClass(path = "dictionary block", modOnly = true)
public class SetBlock extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player) {
		Block blockAtPlayer = player.getWorld().getBlockAt(player.getLocation());

		blockAtPlayer.setType(Material.CAKE);

		return true;
	}

}
