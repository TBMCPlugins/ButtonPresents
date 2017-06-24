package buttondevteam.presents;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StaticMain {
	public static void main(String[] args){


        

    	@SuppressWarnings("unused")
        class output{
			String ali = "pls";
        	String iie = "whaddap";
        	String norbipeti = "¯\\_(ツ)_/¯";
        }
		
    	GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        
		System.out.println(gson.toJson(new output()));
	}
}
