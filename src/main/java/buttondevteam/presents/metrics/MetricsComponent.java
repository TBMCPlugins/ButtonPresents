package buttondevteam.presents.metrics;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;

public class MetricsComponent extends Component{

	@Override
	public void register(JavaPlugin plugin) {
		registerListener(plugin, new PlayerLogins(plugin));
		addPage(plugin, new PlayerLoginsPage(plugin));
	}
	
}
