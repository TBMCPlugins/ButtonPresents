package buttondevteam.presents.components.research.questions;

import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.components.research.Question;
import org.bukkit.entity.Player;

@CommandClass(path = "research crash overwhelm", modOnly = true)
public class OverwhelmCrash extends Question {

	@Override
	public String question() {
		// TODO Auto-generated method stub
		return "Will sending 500 short messages to a player instantly crash their game?";
	}

	@Override
	public String answer() {
		// TODO Auto-generated method stub
		return "No.";
	}

	@Command2.Subcommand
	public boolean def(Player player) {
		// TODO Auto-generated method stub
		for (int x = 0; x < 500; x++) {
			player.sendMessage("Hello World Motherfucker!");
		}
		player.sendMessage(question());
		player.sendMessage(answer());
		return false;
	}

}
