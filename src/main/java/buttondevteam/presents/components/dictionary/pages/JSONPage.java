package buttondevteam.presents.components.dictionary.pages;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class JSONPage extends Page {

	@Override
	public String GetName() {
		return "ali/hello/json";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		return new Response(200, getResponseString(), exchange);
	}
    class output{
		String ali = "pls";
    	String iie = "whaddap";
    	String norbipeti = "¯\\_(ツ)_/¯";
    }
	private String getResponseString() {
    	GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
		return gson.toJson(new output());
	}


}
