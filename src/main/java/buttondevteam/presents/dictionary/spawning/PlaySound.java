package buttondevteam.presents.dictionary.spawning;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.PlayerCommand;

@CommandClass(path = "dictionary sound")
public class PlaySound extends PlayerCommand{

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		int volume = 0;
		int pitch = 0;
		
		//parse arguments
		if (args.length >= 2){
			try{
				volume = Integer.parseInt(args[0]);
				pitch = Integer.parseInt(args[1]);
			}catch(NumberFormatException e){
				
				volume = pitch = 0;
				
				player.sendMessage("Incorrect input:");
				player.sendMessage(args[0] + " must be an int.");
				player.sendMessage(args[1] + " must be an int.");
			}catch(Exception e){
				player.sendMessage("Incorrect Input");
				player.sendMessage(e.toString());
			}
			
		}
		
		player.playSound(
				player.getLocation(),
				Sound.ENTITY_BLAZE_DEATH,
				volume,  //Volume
				pitch); //Pitch
		
		return true;
		
	}

}
