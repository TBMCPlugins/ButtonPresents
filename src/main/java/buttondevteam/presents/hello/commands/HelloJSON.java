package buttondevteam.presents.hello.commands;


import org.bukkit.entity.Player;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.presents.architecture.commands.ModCommand;

@CommandClass(modOnly = true, path="hello json")
public class HelloJSON extends ModCommand{

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {


    	
    	GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        
		player.sendMessage(gson.toJson(new output()));
		return true;
	}
    class output{
		String ali = "pls";
    	String iie = "whaddap";
    	String norbipeti = "¯\\_(ツ)_/¯";
    }

}
