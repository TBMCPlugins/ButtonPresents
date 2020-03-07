package buttondevteam.presents.components.research.dictionary.commands;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.command.CommandSender;

@CommandClass(modOnly = false, path = "dictionary command")
public class SendMessage extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(CommandSender sender) {
		sender.sendMessage("Hello World!");
		return true;
	}
}
