package buttondevteam.presents.components.spawn;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.entity.Player;

@CommandClass(modOnly = true, path = "spawn choosecolor")
public class ChooseColor extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player, String color) {
//     //Code to make it so that command blocks can fire this command
//
//		if (!(sender instanceof BlockCommandSender)){
//			sender.sendMessage("You must be a command block to use this command!");
//			return false;
//		}
//		
//		Server server = sender.getServer();
//		server.broadcastMessage("Arg 0:" + args[0]);
//		server.broadcastMessage("Arg 1:" + args[1]);


		player.sendMessage("Attempting to change your name " + player.getName() + " to the color..." + color);

		//TODO:INSERT NAME CHANGING CODE HERE


		player.sendMessage("Your new name: " + player.getName());

		return true;
	}

}
