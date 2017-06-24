package buttondevteam.presents.hello.commands;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;

import org.bukkit.entity.Player;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.ModCommand;

@CommandClass(modOnly = true, path="hello json")
public class HelloJSON extends ModCommand{

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {

		JsonBuilderFactory factory = Json.createBuilderFactory(null);
		JsonObject value = factory.createObjectBuilder()
				.add("Ali", "pls")
				.add("iie", "whaddap")
				.add("norbi", "nice")
				.build();
		
		player.sendMessage(value.toString());
		return true;
	}

}
