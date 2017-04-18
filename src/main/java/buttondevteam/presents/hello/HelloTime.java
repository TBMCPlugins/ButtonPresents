package buttondevteam.presents.hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

import buttondevteam.presents.architecture.commands.BaseCommand;

public class HelloTime extends BaseCommand {

	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		String path = "hellotime.lastincident";
		FileConfiguration config = this.getPlugin().getConfig();
		if(!config.contains(path) || !config.isLong(path)){
			
			sender.sendMessage("Time Incident Occoured!");
			sender.sendMessage("Setting...");
			
			long time = System.currentTimeMillis();
			config.set(path, time);
			
			sender.sendMessage("Time set to" + MillisToString(time));
		}
		sender.sendMessage("Days since last Time Incident: " + MillisToString(config.getLong(path)));
		return true;
	}
	public String MillisToString(long time){
		Date dateTime = new Date(time);
		SimpleDateFormat dateformatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss z");
		return dateformatter.format(dateTime);
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
		return "hello time";
	}

}
