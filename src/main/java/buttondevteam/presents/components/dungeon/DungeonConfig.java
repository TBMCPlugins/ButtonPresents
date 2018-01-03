package buttondevteam.presents.components.dungeon;

import org.bukkit.configuration.file.FileConfiguration;

public class DungeonConfig {
	private FileConfiguration config;
	
	public enum SETTING {
		NAME   ("dungeon.name"),   
		OWNER  ("dungeon.owner"),  
		SPAWN  ("dungeon.spawn"),  
		STATE  ("dungeon.state"),
		CREATED("dungeon.created"); //creation date in miliseconds
		
		public String path;
		private SETTING(String path){
			this.path = path;
		}
	}
	public enum dungeonState {
		INVALID, //something is wrong with the file
		VALID
	}
	public DungeonConfig(FileConfiguration config){
		this.config = config; 
	}
	public void set(SETTING setting, Object value){
		this.config.set(setting.path, value);
	}
}
