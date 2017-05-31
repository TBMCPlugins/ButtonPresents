package buttondevteam.presents.servlet;

import buttondevteam.presents.architecture.serverlets.WebPage;

public class AliHelloPage extends WebPage {

	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return "AliHello";
	}

	@Override
	public String GetData(){
		return "HELLO WORLD";
	}

}
