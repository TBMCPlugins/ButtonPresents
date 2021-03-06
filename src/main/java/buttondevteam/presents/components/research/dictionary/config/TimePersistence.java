package buttondevteam.presents.components.research.dictionary.config;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@CommandClass(path = "dictionary time")
public class TimePersistence extends UniversalCommand {
	final String path = "hellotime.lastincident";

	@Command2.Subcommand
	public boolean def(CommandSender sender) {

		FileConfiguration config = this.getPlugin().getConfig();

		if (config.contains(path) && config.isLong(path)) {
			sender.sendMessage("Last Time Incident: " + MillisToString(config.getLong(path)));
		} else {
			sender.sendMessage("Time Incident Occoured!");
			sender.sendMessage("Setting...");

			long time = System.currentTimeMillis();
			config.set(path, time);

			sender.sendMessage("Time set to" + MillisToString(time));
		}
		return true;
	}
	public String MillisToString(long time){
		Date dateTime = new Date(time);
		SimpleDateFormat dateformatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss z");
		return dateformatter.format(dateTime);
	}

}
