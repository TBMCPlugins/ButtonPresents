package buttondevteam.presents.dictionary.config;



import java.util.List;

import org.bukkit.command.CommandSender;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;

@CommandClass(path = "dictionary load")
public class LoadConfig extends UniversalCommand {

	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		if (args.length > 1 && args[0].toLowerCase().contains("debug")){
			sender.sendMessage("Data Type: " + this.getPlugin().getConfig().get("hellosave").getClass().toString());
		}
		List<String> mylist = this.getPlugin().getConfig().getStringList("hellosave");
		for(String string : mylist){
			sender.sendMessage(string);
		}
		return true;
	}
}
