package buttondevteam.presents.hello.pages;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class HelloWorldPage extends Page {

	@Override
	public String GetName() {
		return "ali/hello/world";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		return new Response(200, "Hello World! -Ali", exchange);
	}

}