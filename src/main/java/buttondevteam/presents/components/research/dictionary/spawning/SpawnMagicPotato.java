package buttondevteam.presents.components.research.dictionary.spawning;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

@CommandClass(path = "dictionary magicpotato", modOnly = true)
public class SpawnMagicPotato extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player) {
		ItemStack potato = new ItemStack(Material.BAKED_POTATO);
		ItemMeta meta = potato.getItemMeta();

		meta.addEnchant(Enchantment.DURABILITY, 10, true);

		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Once upon a time");
		lore.add("There was a beautiful potato");
		lore.add("that ruled a fantastic kingdom.");
		lore.add("With its armies of french fries");
		lore.add("and cannons of hash browns,");
		lore.add("it was unstopple.");
		lore.add("Until one fateful day...");
		
		meta.setLore(lore);
		potato.setItemMeta(meta);
		player.getInventory().addItem(potato);
		
		return true;
	}
}
