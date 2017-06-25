package buttondevteam.presents.dictionary.pages;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class LocationPage extends Page{
	JavaPlugin plugin;
	
	public LocationPage(JavaPlugin plugin){
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
		
		responseString += "<tr><th>Player</th><th>Location</th></tr>";
		for(Player player : plugin.getServer().getOnlinePlayers()){
			//Creates new row: Player Name|Location
			Location loc = player.getLocation();
			responseString += "<tr>";
			responseString += "<td>";
			responseString += player.getPlayerListName();
			responseString += "</td>";
			responseString += "<td>";
			responseString += loc.getBlockX() + " ";
			responseString += loc.getBlockY() + " ";
			responseString += loc.getBlockZ() + " ";
			responseString += "</td>";
			responseString += "</tr>";
		}
		responseString += "</table>";
		return new Response(200, responseString, exchange);
	}

}
