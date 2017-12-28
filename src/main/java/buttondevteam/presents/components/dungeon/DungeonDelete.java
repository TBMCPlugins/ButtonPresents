package buttondevteam.presents.components.dungeon;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.ModCommand;

@CommandClass(path="dungeon delete")
public class DungeonDelete extends ModCommand{

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		
		if (args.length < 1) return false;
		
		String dungeonName = args[0];
		FileConfiguration config = this.getPlugin().getConfig();
		
		if(!config.contains("dungeon." + dungeonName)){
			player.sendMessage("This dungeon does not exist!");
			String output = "Valid dungeons are:";
			for(String key : config.getConfigurationSection("dungeon").getKeys(false)){
				output += key;
				output += ", ";
			}
			player.sendMessage(output);
		}else{
			for(String key : config.getConfigurationSection("dungeon." + dungeonName).getKeys(true)){
				config.set("dungeon." + dungeonName + "." + key, null);
			}
			player.sendMessage("Dungeon " + dungeonName + " deleted.");
		}
		
		
		return true;
	}

}
