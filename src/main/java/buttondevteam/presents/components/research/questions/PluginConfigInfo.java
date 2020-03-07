package buttondevteam.presents.components.research.questions;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.components.research.Question;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

@CommandClass(path = "research info pluginconfig", modOnly = true, helpText = {
		"Subcommands = name, path, root_name, root_path, root_keys, answer"
})
public class PluginConfigInfo extends Question {
	@Override
	public String question() {
		return "What is the filepath for the plugin " + this.getPlugin().getName() + "?";
	}


	public String answer() {
		return this.answer;
	}


	@Command2.Subcommand
	public boolean def(Player player, String subcommand) {
		player.sendMessage("[Q]:" + question());

		player.sendMessage("---Plugin's Config Information---");
		FileConfiguration config = this.getPlugin().getConfig();

		switch (subcommand.toLowerCase()) {
			case "name":
				player.sendMessage("Name:");
				player.sendMessage(" - " + config.getName());
				break;

			case "path":
				player.sendMessage("Current Path:");
				player.sendMessage(" - " + config.getCurrentPath());
				break;

			case "root_name":
				player.sendMessage("Name of Root:");
				player.sendMessage(" - " + config.getRoot().getName());
				break;

			case "root_path":
				player.sendMessage("Path of Root:");
				player.sendMessage(" - " + config.getRoot().getCurrentPath());
				break;

			case "root_key":
			case "root_keys":
				player.sendMessage("Keys of Root (Deep = true)");
				player.sendMessage(" - " + config.getRoot().getKeys(true).toString());
				break;

			case "answer":
				player.sendMessage("[A]:" + this.answer());
				break;

			default:
				return false;
		}

		return false;
	}


}
