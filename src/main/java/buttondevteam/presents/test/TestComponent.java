package buttondevteam.presents.test;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;

public class TestComponent extends Component{

	@Override
	public void register(JavaPlugin plugin) {
		this.registerCommand(plugin, new PersistenceTest());
		
	}

}
