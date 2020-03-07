package buttondevteam.presents.components.magic.tricks;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.entity.Player;

//HEHEHHEHEH EAASSSTER EGGS
@CommandClass(helpText = {
		"Rule settings: boomDecay, healthReduction, endCrystal, localized"
})
public class BoomBowRule extends UniversalCommand {
	public static boolean boomDecay;
	public static boolean healthReduction;
	public static boolean endCrystal;
	public static boolean localized;

	@Command2.Subcommand
	public boolean def(Player player, @Command2.OptionalArg String name, @Command2.OptionalArg Boolean value) {
		if (!player.getName().equals("alisolarflare")) {
			player.sendMessage("You must be alisolarflare to use this command");
			return false;
		}
		if (name == null || value == null) {
			player.sendMessage("Rules:");
			player.sendMessage("boomDecay" + boomDecay);
			player.sendMessage("healthReduction" + healthReduction);
			player.sendMessage("endCrystal" + endCrystal);
			player.sendMessage("localized" + localized);
			return false;
		}
		/*if(!(args[1].startsWith("t")|| args[1].startsWith("f"))){
			return false;
		}
		boolean gameRule = false;
		if(args[1].startsWith("t") || args[1].startsWith("T")){
			gameRule = true;
		}*/
		switch (name) {
			case "boomDecay":
				boomDecay = value;
				break;
			case "healthReduction":
				healthReduction = value;
				break;
			case "endCrystal":
				endCrystal = value;
				break;
			case "localized":
				localized = value;
				break;
			default:
				player.sendMessage("Error: " + name + " not defined as a rule");
				return false;
		}

		return true;
	}
}
