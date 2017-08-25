package buttondevteam.presents.dungeon;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.ModCommand;

@CommandClass(path="dungeon create")
public class DungeonCreate extends ModCommand{

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		
		if(args.length < 1) return false;
		
		String dungeonName = args[0];
		FileConfiguration config = this.getPlugin().getConfig();
		
		if (config.contains("dungeons." + dungeonName)){
			player.sendMessage("There already exists a dungeon named " + dungeonName);
			player.sendMessage("Type /dungeon info [dungeonname] to get more information");
		}
		else{
			config.set("dungeon." + dungeonName, true);
			config.set("dungeon." + dungeonName + ".owner", player.getName());
			config.set("dungeon." + dungeonName + ".spawn", player.getLocation().toString());
			config.set("dungeon." + dungeonName + ".created", System.currentTimeMillis());
			this.getPlugin().saveConfig();
			
			assert(dungeonName == 
				this.getPlugin()
					.getConfig()
					.getString("dungeon." + dungeonName));
			
			player.sendMessage("New dungeon named " + dungeonName + " created.");
		}
		return true;
	}
	
	
	@Override
	public String[] GetHelpText(String alias){
		return new String[] {
			"/dungeon create [dungeonName]",
			"instantiates a new dungeon, setting the dungeon spawn to the player location"
		};
	}
}
