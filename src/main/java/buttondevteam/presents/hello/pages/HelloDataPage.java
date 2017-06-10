package buttondevteam.presents.hello.pages;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class HelloDataPage extends Page{
	private final int data = 1234561;

	@Override
	public String GetName() {
		return "ali/hello/data";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		String responseString = 
			"<h1>Come check out this data!</h1>"
			+ "<p>" + data + "</p>"
			+ "<p>This is not suspicious shit at all</p>";
		
		return new Response(200, responseString, exchange);
	}

}
