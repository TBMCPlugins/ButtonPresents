package buttondevteam.presents.hello.pages;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;

import org.bukkit.plugin.java.JavaPlugin;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class HelloJSONPage extends Page {

	@Override
	public String GetName() {
		return "ali/hello/json";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		return new Response(200, getResponseString(), exchange);
	}

	private String getResponseString() {
		JsonBuilderFactory factory = Json.createBuilderFactory(null);
		JsonObject value = factory.createObjectBuilder()
				.add("Ali", "pls")
				.add("iie", "whaddap")
				.add("norbi", "nice")
				.build();
		
		return value.toString();
	}

}
