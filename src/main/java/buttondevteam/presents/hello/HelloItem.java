package buttondevteam.presents.hello;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import buttondevteam.presents.architecture.commands.PlayerCommand;

public class HelloItem extends PlayerCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		ItemStack potato = new ItemStack(Material.BAKED_POTATO);
		player.getInventory().addItem(potato);
		return true;
	}

	@Override
	public boolean GetModOnly() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String GetCommandPath(){
		return "hello item";
	}

}
