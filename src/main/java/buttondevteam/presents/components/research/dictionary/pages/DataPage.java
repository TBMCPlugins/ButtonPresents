package buttondevteam.presents.components.research.dictionary.pages;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class DataPage extends Page{
	private final int data = 1234561;

	@Override
	public String GetName() {
		return "ali/hello/data";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		String responseString = String.valueOf(data);
		
		return new Response(200, responseString, exchange);
	}

}
