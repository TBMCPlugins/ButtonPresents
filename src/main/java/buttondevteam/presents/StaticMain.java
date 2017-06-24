package buttondevteam.presents;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StaticMain {
	public static void main(String[] args){
    	GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        
		System.out.println(gson.toJson(new output()));
	}
    static class output{
		public String ali = "pls";
    	public String iie = "whaddap";
    	public String norbipeti = "¯\\_(ツ)_/¯";
    }
	
}
