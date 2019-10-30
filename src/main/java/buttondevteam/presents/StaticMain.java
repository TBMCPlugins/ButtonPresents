package buttondevteam.presents;

public class StaticMain {
	public static void main(String[] args){
    	/*GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        
		System.out.println(gson.toJson(new output()));*/

		int distance = 5;
		for (int i = -distance; i <= distance; i++) {
			for (int j = -distance; j <= distance; j++) {
				//if(i*i+j*j<=distance*distance) {
				double dist = Math.sqrt(Math.pow((double) (i), 2.0D) + Math.pow((double) (j), 2.0D));
				if (dist < distance) {
					System.out.print("X");
				} else
					System.out.print("-");
			}
			System.out.println();
		}
	}
    static class output{
		public String ali = "pls";
    	public String iie = "whaddap";
    	public String norbipeti = "¯\\_(ツ)_/¯";
    }
	
}
