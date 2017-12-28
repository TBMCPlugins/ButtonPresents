package buttondevteam.presents.components.dictionary.commands;

import org.bukkit.command.CommandSender;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;

@CommandClass(modOnly = false, path="dictionary command")
public class SendMessage extends UniversalCommand {

	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		sender.sendMessage("Hello World!");
		return true;
	}
}
