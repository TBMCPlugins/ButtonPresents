package buttondevteam.presents.architecture.commands;

import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.lib.chat.PlayerCommandBase;

@CommandClass(modOnly = false)
public abstract class PlayerCommand extends PlayerCommandBase{
	
	public abstract boolean OnCommand(Player player, String alias, String[] args);
	
	@Override
	public String[] GetHelpText(String alias){
		return new String[] {
			"This command doesn't have help text.	",
			"If you're a player, ask a mod to write one",
			"If you're a mod, ask a dev to write one",
			"If you're a dev, write the help text you lazy bastard. -Ali"
		};
	}
	
}
