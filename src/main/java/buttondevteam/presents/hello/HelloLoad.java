package buttondevteam.presents.hello;



import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.commands.BaseCommand;

public class HelloLoad extends BaseCommand {
	JavaPlugin plugin;

	public HelloLoad(JavaPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		if (args.length > 1 && args[0].toLowerCase().contains("debug")){
			sender.sendMessage("Data Type: " + plugin.getConfig().get("hellosave").getClass().toString());
		}
		List<String> mylist = plugin.getConfig().getStringList("hellosave");
		for(String string : mylist){
			sender.sendMessage(string);
		}
		return true;
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
	public String GetCommandPath(){
		return "hello load";
	}
}
