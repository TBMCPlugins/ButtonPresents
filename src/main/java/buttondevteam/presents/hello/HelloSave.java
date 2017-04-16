package buttondevteam.presents.hello;

import java.util.Arrays;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.commands.BaseCommand;

public class HelloSave extends BaseCommand {
	JavaPlugin plugin;

	public HelloSave(JavaPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		if (args.length < 1){
			sender.sendMessage("Can't save an empty string, Type /hellosave <message>");
		}else{
			try{
				plugin.getConfig().set("hellosave", Arrays.asList(args));
				plugin.saveConfig();
				sender.sendMessage("Message saved!");
			}catch (Exception e){
				sender.sendMessage("Error when saving message:");
				sender.sendMessage(e.toString());
			}
		}
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
	public String GetCommandPath(){
		return "hello save";
	}
}
