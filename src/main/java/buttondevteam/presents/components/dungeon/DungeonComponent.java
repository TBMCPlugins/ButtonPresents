package buttondevteam.presents.components.dungeon;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;

public class DungeonComponent extends Component{

	@Override
	public void register(JavaPlugin plugin) {
		this.registerCommand(plugin, new DungeonCreate());
		this.registerCommand(plugin, new DungeonDelete());
		
	}
	
}
