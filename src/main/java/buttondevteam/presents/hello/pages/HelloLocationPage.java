package buttondevteam.presents.hello.pages;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class HelloLocationPage extends Page{
	JavaPlugin plugin;
	
	public HelloLocationPage(JavaPlugin plugin){
		this.plugin = plugin;
	}
	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "ali/hello/location";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		//Returns the location of all players in table form
		String responseString = "<table>";
		for(Player player : plugin.getServer().getOnlinePlayers()){
			Location loc = player.getLocation();
			responseString += "<tr>";
			responseString += loc.getBlockX() + " ";
			responseString += loc.getBlockY() + " ";
			responseString += loc.getBlockZ() + " ";
			responseString += "</tr>";
		}
		responseString += "</table>";
		return new Response(200, responseString, exchange);
	}

}
