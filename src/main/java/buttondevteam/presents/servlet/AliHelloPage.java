package buttondevteam.presents.servlet;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class AliHelloPage extends Page {

	@Override
	public String GetName() {
		return "ali";
	}

	@Override
	public Response handlePage(HttpExchange exchange) {
		return new Response(200, "Hello World! -Ali", exchange);
	}

}
