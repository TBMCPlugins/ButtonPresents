package buttondevteam.presents.components.dungeon;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.ModCommand;
import buttondevteam.presents.components.dungeon.DungeonConfig.SETTING;

@CommandClass(path="dungeon create")
public class DungeonCreate extends ModCommand{

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		//Creates a new dungeon
		
		if(args.length < 1) return false;
		
		String dungeonName = args[0];
		FileConfiguration plugin_config = this.getPlugin().getConfig();
		
		if (plugin_config.contains("dungeons." + dungeonName)){
			player.sendMessage("There already exists a dungeon named " + dungeonName);
			player.sendMessage("Type /dungeon info [dungeonname] to get more information");
			return true;
		}
		
		DungeonConfig config = new DungeonConfig(plugin_config);
		
		config.set(SETTING.NAME, true);
		config.set(SETTING.OWNER, player.getName());
		config.set(SETTING.SPAWN, player.getLocation().toString());
		config.set(SETTING.CREATED, System.currentTimeMillis());
		
		this.getPlugin().saveConfig();
		
		if (this.getPlugin().getConfig().contains("dungeon." + dungeonName)){
			player.sendMessage("New dungeon named " + dungeonName + " saved.");
		}else{
			player.sendMessage("Error in saving the dungeon " + dungeonName);
			player.sendMessage("Current Config does not contain a path named dungeon." + dungeonName );
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
