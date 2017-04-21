package buttondevteam.presents.hello.commands;

import org.bukkit.command.CommandSender;

import buttondevteam.presents.architecture.commands.BaseCommand;

public class HelloCommand extends BaseCommand {

	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		sender.sendMessage("Hello World!");
		return false;
	}

	@Override
	public boolean GetPlayerOnly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean GetModOnly() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String GetCommandPath(){
		return "hello command";
		
	}
}
