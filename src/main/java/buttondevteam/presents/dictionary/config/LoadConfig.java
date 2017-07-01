package buttondevteam.presents.dictionary.config;



import java.util.List;

import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.ModCommand;

@CommandClass(modOnly=true, path = "dictionary load")
public class LoadConfig extends ModCommand {

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		if (args.length > 1 && args[0].toLowerCase().contains("debug")){
			player.sendMessage("Data Type: " + this.getPlugin().getConfig().get("hellosave").getClass().toString());
		}
		List<String> mylist = this.getPlugin().getConfig().getStringList("hellosave");
		for(String string : mylist){
			player.sendMessage(string);
		}
		return true;
	}
}
