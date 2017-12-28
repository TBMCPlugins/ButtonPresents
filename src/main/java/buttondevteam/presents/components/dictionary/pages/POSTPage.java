package buttondevteam.presents.components.dictionary.pages;

import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class POSTPage extends Page {
	JavaPlugin plugin;
	String saveFilePath = "hello.pages.hellopostpage.saved";
	public POSTPage(JavaPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public String GetName() {
		return "ali/hello/post";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		String responseString = "";
		if(exchange.getRequestMethod() == "post"){
			int c;
			try {
				while((c = exchange.getRequestBody().read()) != -1){
					responseString += (char) c;
				}
			} catch (IOException e) {
				responseString += "Error! Reading message failed";
				return new Response(200, responseString, exchange);
				
			}
			plugin.getConfig().set(saveFilePath, responseString);
			plugin.saveConfig();
		}else{
			responseString += plugin.getConfig().getString(saveFilePath);
		}
		return new Response(200, responseString, exchange);
	}

}
