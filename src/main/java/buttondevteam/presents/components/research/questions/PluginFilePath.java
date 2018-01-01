package buttondevteam.presents.components.research.questions;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.components.research.Question;

@CommandClass(path="research pluginfilepath")
public class PluginFilePath extends Question {
	@Override
	public String question() {
		return "What is the filepath for the plugin " + this.getPlugin().getName() + "?";
	}

	
	public String answer() {
		return this.answer;
	}
	
	
	
	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		player.sendMessage("[Q]:" + this.question());
		
		player.sendMessage("---Plugin's Data Folder Information---");
		File dataFolder = this.getPlugin().getDataFolder();
		
		if 		(dataFolder == null)	player.sendMessage("Data Folder is null");
		else if (!dataFolder.exists())	player.sendMessage("Data Folder does not exist");
		else{  
			player.sendMessage("Absolute path: ");
			player.sendMessage(dataFolder.getAbsolutePath());
			
			player.sendMessage("Canonical Path:");
			try {
				player.sendMessage(dataFolder.getCanonicalPath());
			} catch (IOException e) {
				player.sendMessage("I/O Exception when getting Canonical Path!");
				player.sendMessage(e.getMessage());
				e.printStackTrace();
				
			} catch (SecurityException e){
				player.sendMessage("Security exception when getting Canonical Path!");
				player.sendMessage(e.getMessage());
				e.printStackTrace();				
			}
		}
		
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
