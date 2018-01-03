package buttondevteam.presents.components.research.questions;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.components.research.Question;

@CommandClass(path="research info pluginconfig")
public class PluginConfigInfo extends Question {
	@Override
	public String question() {
		return "What is the filepath for the plugin " + this.getPlugin().getName() + "?";
	}

	
	public String answer() {
		return this.answer;
	}
	
	
	
	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		player.sendMessage("[Q]:" + question());
		
		player.sendMessage("---Plugin's Config Information---");
		FileConfiguration config = this.getPlugin().getConfig();
		
		if (args.length >= 1){
			switch(args[0].toLowerCase()){
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
				player.sendMessage("Usage: " + this.GetCommandPath() + "<subcommand>");
				player.sendMessage("Subcommands = name, path, root_name, root_path, root_keys, answer");
			}
		}else{ //args.length <= 0
			player.sendMessage("Usage: " + this.GetCommandPath() + "<subcommand>");
			player.sendMessage("Subcommands = name, path, root_name, root_path, root_keys, answer");
		}
		
		return false;
	}
	

}
