package buttondevteam.presents.components.dungeon;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

@CommandClass(path = "dungeon delete")
public class DungeonDelete extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player, String dungeonName) {

		FileConfiguration config = this.getPlugin().getConfig();

		if (!config.contains("dungeon." + dungeonName)) {
			player.sendMessage("This dungeon does not exist!");
			String output = "Valid dungeons are:";
			for (String key : config.getConfigurationSection("dungeon").getKeys(false)) {
				output += key;
				output += ", ";
			}
			player.sendMessage(output);
		} else {
			for (String key : config.getConfigurationSection("dungeon." + dungeonName).getKeys(true)) {
				config.set("dungeon." + dungeonName + "." + key, null);
			}
			player.sendMessage("Dungeon " + dungeonName + " deleted.");
		}
		
		
		return true;
	}
}
