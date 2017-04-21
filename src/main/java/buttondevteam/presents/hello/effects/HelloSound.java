package buttondevteam.presents.hello.effects;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

import buttondevteam.presents.architecture.commands.PlayerCommand;

public class HelloSound extends PlayerCommand{

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		int volume = 0;
		int pitch = 0;
		if (args.length >= 2){
			try{
				volume = Integer.parseInt(args[0]);
				pitch = Integer.parseInt(args[1]);
			}catch(NumberFormatException e){
				volume = 0;
				pitch = 0;
				player.sendMessage("Incorrect input:");
				player.sendMessage(args[0] + " must be an int.");
				player.sendMessage(args[1] + " must be an int.");
			}catch(Exception e){
				player.sendMessage("Incorrect Input");
				player.sendMessage(e.toString());
			}
			
		}
		player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_FALL, volume, pitch);
		return false;
		
	}
	public String GetCommandPath(){
		return "hello sound";
	}

}
