package buttondevteam.presents.dictionary.spawning;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.ModCommand;

@CommandClass(path = "dictionary item", modOnly=true)
public class SpawnItem extends ModCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		ItemStack potato = new ItemStack(Material.BAKED_POTATO);
		player.getInventory().addItem(potato);
		return true;
	}



}
