package buttondevteam.presents.spawn;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;

public class SpawnComponent extends Component{

	@Override
	public void register(JavaPlugin plugin) {
		this.registerCommand(plugin, new ChooseColor());
		
	}

}
