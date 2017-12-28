package buttondevteam.presents.components.spawn;

import org.bukkit.Server;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;

@CommandClass(modOnly = false, path="spawn choosecolor")
public class ChooseColor extends UniversalCommand {

	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		if (!(sender instanceof BlockCommandSender)){
			sender.sendMessage("You must be a command block to use this command!");
			return false;
		}
		
		Server server = sender.getServer();
		server.broadcastMessage("Arg 0:" + args[0]);
		server.broadcastMessage("Arg 1:" + args[1]);
		
		Player player = server.getPlayer(args[0]);
		if (player != null){
			player.sendMessage("Attempting to change your name "+player.getName()+" to the color...");
			player.sendMessage(args[1]);
			player.sendMessage("Your new name: " +player.getName());
		}else{
			server.broadcastMessage("Error: Player is null");
		}
		
		server.broadcastMessage("ENDOFCOMMAND");
		return true;
	}

}
