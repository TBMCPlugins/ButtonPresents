package buttondevteam.presents.hello.commands;

import org.bukkit.command.CommandSender;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;

@CommandClass(modOnly = false, path="hello command")
public class HelloCommand extends UniversalCommand {

	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		sender.sendMessage("Hello World!");
		return false;
	}
}
