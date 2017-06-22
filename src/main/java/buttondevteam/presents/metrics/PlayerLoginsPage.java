package buttondevteam.presents.metrics;

import org.bukkit.plugin.java.JavaPlugin;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class PlayerLoginsPage extends Page {

	private JavaPlugin plugin;

	public PlayerLoginsPage(JavaPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "/ali/metrics/logins";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		return new Response(200, responseString(), exchange);
	}

	private String responseString() {
		String outputString = "<h1>Player Login Metrics Screen</h1>";
		return outputString;
	}

}
