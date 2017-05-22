package buttondevteam.presents.hello.commands;

import org.bukkit.command.CommandSender;

import buttondevteam.presents.architecture.commands.UniversalCommand;

public class HelloCommand extends UniversalCommand {

	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		sender.sendMessage("Hello World!");
		return false;
	}
	@Override
	public String GetCommandPath(){
		return "hello command";
		
	}
}
