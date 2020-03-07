package buttondevteam.presents.components.research.dictionary.config;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

@CommandClass(path = "dictionary save")
public class SaveConfig extends UniversalCommand {
	@Command2.Subcommand
	public boolean def(CommandSender sender, String... message) {
		if (message.length < 1) {
			sender.sendMessage("Can't save an empty string, Type /hellosave <message>");
		} else {
			try {
				this.getPlugin().getConfig().set("hellosave", Arrays.asList(message));
				this.getPlugin().saveConfig();
				sender.sendMessage("Message saved!");
			} catch (Exception e) {
				sender.sendMessage("Error when saving message:");
				sender.sendMessage(e.toString());
			}
		}
		return true;
	}
}
