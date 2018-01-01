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
		
		player.sendMessage("Name:");
		player.sendMessage(" - " + config.getName());
				
		player.sendMessage("Current Path:");
		player.sendMessage(" - " + config.getCurrentPath());
		
		player.sendMessage("Name of Root:");
		player.sendMessage(" - " + config.getRoot().getName());
		
		player.sendMessage("Path of Root:");
		player.sendMessage(" - " + config.getRoot().getCurrentPath());
		
		player.sendMessage("Keys of Root (Deep = true)");
		player.sendMessage(" - " + config.getRoot().getKeys(true).toString());
		
		player.sendMessage("[A]:" + this.answer());
		return false;
	}
	

}
