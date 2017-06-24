package buttondevteam.presents;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;

public class StaticMain {
	public static void main(String[] args){

		JsonBuilderFactory factory = Json.createBuilderFactory(null);
		JsonObject value = factory.createObjectBuilder()
				.add("Ali", "pls")
				.add("iie", "whaddap")
				.add("norbi", "nice")
				.build();
		
		System.out.println(value.toString());
	}
}
