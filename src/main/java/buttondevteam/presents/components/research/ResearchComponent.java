package buttondevteam.presents.components.research;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;
import buttondevteam.presents.components.research.questions.PluginFilePath;

public class ResearchComponent extends Component {

	@Override
	public void register(JavaPlugin plugin) {
		// TODO Auto-generated method stub
		this.registerCommand(plugin, new PluginFilePath());

	}

}
