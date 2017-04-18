package buttondevteam.presents.hello;

import java.util.Arrays;

import org.bukkit.command.CommandSender;

import buttondevteam.presents.architecture.commands.BaseCommand;

public class HelloSave extends BaseCommand {
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
