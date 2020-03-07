package buttondevteam.presents.components.research.dictionary.config;


import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.entity.Player;

import java.util.List;

@CommandClass(modOnly = true, path = "dictionary load")
public class LoadConfig extends UniversalCommand {

	@Command2.Subcommand
	public boolean OnCommand(Player player, @Command2.OptionalArg String debug) {
		if (debug != null && debug.toLowerCase().contains("debug")) {
			player.sendMessage("Data Type: " + this.getPlugin().getConfig().get("hellosave").getClass().toString());
		}
		List<String> mylist = this.getPlugin().getConfig().getStringList("hellosave");
		for (String string : mylist) {
			player.sendMessage(string);
		}
		return true;
	}
}
