package buttondevteam.presents.components.research.dictionary.pages;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class PlayersOnlinePage extends Page{
	private JavaPlugin plugin;

	public PlayersOnlinePage(JavaPlugin plugin){
		this.plugin = plugin;
	}

	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "ali/hello/players";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		String playerList = "Players Online: "+ plugin.getServer().getOnlinePlayers().size() +"<br />";
		for(Player player : plugin.getServer().getOnlinePlayers()){
			playerList += player.getPlayerListName() + "<br />";
		}
		return new Response(200, playerList, exchange);
	}

}
