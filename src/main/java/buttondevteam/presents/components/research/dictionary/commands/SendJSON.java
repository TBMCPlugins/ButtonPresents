package buttondevteam.presents.components.research.dictionary.commands;


import buttondevteam.lib.chat.Command2;
import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.UniversalCommand;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.bukkit.entity.Player;

@CommandClass(modOnly = true, path = "dictionary json")
public class SendJSON extends UniversalCommand {

	@Command2.Subcommand
	public boolean def(Player player) {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();

		player.sendMessage(gson.toJson(new output()));
		return true;
	}

	class output {
		String ali = "pls";
		String iie = "whaddap";
		String norbipeti = "¯\\_(ツ)_/¯";
	}

}
