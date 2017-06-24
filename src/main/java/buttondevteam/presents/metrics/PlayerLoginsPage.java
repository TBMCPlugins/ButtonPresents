package buttondevteam.presents.metrics;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public class PlayerLoginsPage extends Page {



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
