package buttondevteam.presents.hello.commands;



import java.util.List;

import org.bukkit.command.CommandSender;

import buttondevteam.presents.architecture.commands.BaseCommand;

public class HelloLoad extends BaseCommand {

	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		if (args.length > 1 && args[0].toLowerCase().contains("debug")){
			sender.sendMessage("Data Type: " + this.getPlugin().getConfig().get("hellosave").getClass().toString());
		}
		List<String> mylist = this.getPlugin().getConfig().getStringList("hellosave");
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
