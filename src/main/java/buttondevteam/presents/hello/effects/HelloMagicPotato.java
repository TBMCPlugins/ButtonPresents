package buttondevteam.presents.hello.effects;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import buttondevteam.presents.architecture.commands.ModCommand;

public class HelloMagicPotato extends ModCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		ItemStack potato = new ItemStack(Material.BAKED_POTATO);
		ItemMeta meta = potato.getItemMeta();
		
		potato.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Once upon a time");
		lore.add("There was a beautiful potato that ruled a fantastic kingdom. With its armies of french"
				+ "fries and cannons of hash browns, it was unstopple.");
		lore.add("Until one fateful day...");
		meta.setLore(lore);
		potato.setItemMeta(meta);
		player.getInventory().addItem(potato);
		return true;
	}
	public String GetCommandPath(){
		return "hello magicpotato";
	}
}
