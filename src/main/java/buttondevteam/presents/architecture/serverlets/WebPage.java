package buttondevteam.presents.architecture.serverlets;

import com.sun.net.httpserver.HttpExchange;

import buttondevteam.website.ButtonWebsiteModule;
import buttondevteam.website.io.Response;
import buttondevteam.website.page.Page;

public abstract class WebPage extends Page{	
	public WebPage(){
		ButtonWebsiteModule.addPage(this);
	}
	@Override
	public Response handlePage(HttpExchange exchange) {
		return new Response(200, GetData(), exchange);
	}
	public abstract String GetData();
}
