package buttondevteam.presents.components.research.questions;

import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.components.research.Question;

@CommandClass(path="research crash overflow")
public class OverflowCrash extends Question {

	@Override
	public String question() {
		// TODO Auto-generated method stub
		return "Will sending a message over 70000 characters long, to a player, crash their game?";
	}

	@Override
	public String answer() {
		// TODO Auto-generated method stub
		return "No.";
	}

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		// TODO Auto-generated method stub
		String overflowMessage = "";
		for (int i = 0; i < 100; i++){
			overflowMessage += "Did you ever hear the tragedy of Darth Plagueis The Wise? I thought not. It’s not a story the Jedi would tell you. It’s a Sith legend. Darth Plagueis was a Dark Lord of the Sith, so powerful and so wise he could use the Force to influence the midichlorians to create life… He had such a knowledge of the dark side that he could even keep the ones he cared about from dying. The dark side of the Force is a pathway to many abilities some consider to be unnatural. He became so powerful… the only thing he was afraid of was losing his power, which eventually, of course, he did. Unfortunately, he taught his apprentice everything he knew, then his apprentice killed him in his sleep. Ironic. He could save others from death, but not himself.";
		}
		player.sendMessage(overflowMessage);
		player.sendMessage(question());
		player.sendMessage(answer());
		return false;
	}

}
