package buttondevteam.presents.hello.pages;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class HelloPlayersPage extends Page{
	private JavaPlugin plugin;

	public HelloPlayersPage(JavaPlugin plugin){
		this.plugin = plugin;
	}

	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "ali/hello/players";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		String playerList = "";
		for(Player player : plugin.getServer().getOnlinePlayers()){
			playerList += player.getPlayerListName() + "<br>";
		}
		return new Response(200, playerList, exchange);
	}

}
