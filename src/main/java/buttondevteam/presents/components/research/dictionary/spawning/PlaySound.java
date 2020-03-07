package buttondevteam.presents.components.research.dictionary.spawning;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

@CommandClass(path = "dictionary sound")
public class PlaySound extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player, int volume, int pitch) {

		player.playSound(
				player.getLocation(),
				Sound.ENTITY_BLAZE_DEATH,
				volume,  //Volume
				pitch); //Pitch

		return true;

	}

}
