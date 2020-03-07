package buttondevteam.presents.components.dungeon;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import buttondevteam.presents.components.dungeon.DungeonConfig.SETTING;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

@CommandClass(path = "dungeon create", modOnly = true, helpText = {
		"instantiates a new dungeon, setting the dungeon spawn to the player location"
})
public class DungeonCreate extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player, String dungeonName) {
		//Creates a new dungeon

		FileConfiguration plugin_config = this.getPlugin().getConfig();

		if (plugin_config.contains("dungeons." + dungeonName)) {
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
}
