package buttondevteam.presents.components.research.dictionary.config;

import java.util.Arrays;

import org.bukkit.command.CommandSender;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;

@CommandClass(path = "dictionary save")
public class SaveConfig extends UniversalCommand {
	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		if (args.length < 1){
			sender.sendMessage("Can't save an empty string, Type /hellosave <message>");
		}else{
			try{
				this.getPlugin().getConfig().set("hellosave", Arrays.asList(args));
				this.getPlugin().saveConfig();
				sender.sendMessage("Message saved!");
			}catch (Exception e){
				sender.sendMessage("Error when saving message:");
				sender.sendMessage(e.toString());
			}
		}
		return true;
	}
}
