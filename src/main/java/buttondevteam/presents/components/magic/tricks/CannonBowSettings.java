package buttondevteam.presents.components.magic.tricks;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.apache.commons.lang3.math.NumberUtils;
import org.bukkit.entity.Player;

@CommandClass(path = "magic cannonbow settings")
public class CannonBowSettings extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player, String setting, @Command2.OptionalArg String value) {
		if (value != null || setting.equalsIgnoreCase("display")) {
			switch (setting.toLowerCase()) {
				case "force":
				case "speedmultiplier":
					CannonBowListener.setSpeedMultiplier(NumberUtils.toDouble(value, CannonBowListener.getSpeedMultiplier()));
					break;
				case "minimumforce":
				case "minforce":
				case "minimumdraw":
				case "mindraw":
					CannonBowListener.setMinforce(NumberUtils.toDouble(value, CannonBowListener.getMinforce()));
					break;
				case "fuse":
				case "fusetick":
				case "fuseticks":
					CannonBowListener.setFuseticks(NumberUtils.toInt(value, CannonBowListener.getFuseticks()));
					break;
				case "recoil":
					CannonBowListener.setRecoil(NumberUtils.toDouble((value), CannonBowListener.getRecoil()));
					break;
				case "isDestructive":
					CannonBowListener.setIsDestructive(value);
					break;
				case "display":
					player.sendMessage("Speed Multiplier: " + CannonBowListener.getSpeedMultiplier());
					player.sendMessage("Minimum Force: " + CannonBowListener.getMinforce());
					player.sendMessage("Fuseticks: " + CannonBowListener.getFuseticks());
					player.sendMessage("Recoil: " + CannonBowListener.getRecoil());
					player.sendMessage("isDestructive: " + CannonBowListener.getIsDestructive());
					break;
				default:
					player.sendMessage("That isn't a valid setting!");
					player.sendMessage("Valid Settings are: speedmultiplier, minforce, fuseticks, recoil");
					player.sendMessage("Use argument 'display' to disply current settings");
					return false;
			}
		}
		return true;
	}
}
