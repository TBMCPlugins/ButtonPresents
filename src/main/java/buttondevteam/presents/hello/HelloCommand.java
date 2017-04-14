package buttondevteam.presents.hello;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.commands.BaseCommand;

public class HelloCommand extends BaseCommand {
	JavaPlugin plugin;
	public HelloCommand(JavaPlugin plugin) {
		this.plugin = plugin;
	}

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
