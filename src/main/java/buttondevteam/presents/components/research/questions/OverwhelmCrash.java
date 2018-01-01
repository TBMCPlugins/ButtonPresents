package buttondevteam.presents.components.research.questions;

import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.components.research.Question;

@CommandClass(path="research crash overwhelm")
public class OverwhelmCrash extends Question {

	@Override
	public String question() {
		// TODO Auto-generated method stub
		return "Will sending 100 short messages to a player instantly crash their game?";
	}

	@Override
	public String answer() {
		// TODO Auto-generated method stub
		return "No.";
	}

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		// TODO Auto-generated method stub
		player.sendMessage(question());
		for (int x = 0; x < 100; x++){
			player.sendMessage("Hello World Motherfucker!");
		}
		player.sendMessage(answer());
		return false;
	}

}
