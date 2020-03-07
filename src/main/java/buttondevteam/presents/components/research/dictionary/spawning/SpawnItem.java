package buttondevteam.presents.components.research.dictionary.spawning;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@CommandClass(path = "dictionary item", modOnly = true)
public class SpawnItem extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player) {
		ItemStack potato = new ItemStack(Material.BAKED_POTATO);
		player.getInventory().addItem(potato);
		return true;
	}
}
