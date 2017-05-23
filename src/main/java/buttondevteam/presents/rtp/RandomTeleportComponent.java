package buttondevteam.presents.rtp;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;

public class RandomTeleportComponent extends Component {

	@Override
	public void register(JavaPlugin plugin) {
		this.registerCommand(plugin, new Rtp());
	}

}
