package buttondevteam.presents.components.research.questions;

import java.io.File;
import java.io.IOException;

import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.components.research.Question;

@CommandClass(path="research info datafolder")
public class PluginDataFolderInfo extends Question {

	@Override
	public String question() {
		// TODO Auto-generated method stub
		return "What does the plugin data folder look like?";
	}

	@Override
	public String answer() {
		// TODO Auto-generated method stub
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
		
		player.sendMessage("[A]:" + this.answer());
		return true;
	}

}
