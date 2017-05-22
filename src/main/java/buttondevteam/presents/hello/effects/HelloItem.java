package buttondevteam.presents.hello.effects;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.ModCommand;

@CommandClass(path = "hello item")
public class HelloItem extends ModCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		ItemStack potato = new ItemStack(Material.BAKED_POTATO);
		player.getInventory().addItem(potato);
		return true;
	}



}
