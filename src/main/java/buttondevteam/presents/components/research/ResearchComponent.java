package buttondevteam.presents.components.research;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;
import buttondevteam.presents.components.research.questions.OverflowCrash;
import buttondevteam.presents.components.research.questions.OverwhelmCrash;
import buttondevteam.presents.components.research.questions.PluginDataFolderInfo;
import buttondevteam.presents.components.research.questions.PluginConfigInfo;

public class ResearchComponent extends Component {

	@Override
	public void register(JavaPlugin plugin) {
		// TODO Auto-generated method stub
		this.registerCommand(plugin, new PluginConfigInfo());
		this.registerCommand(plugin, new PluginDataFolderInfo());
		this.registerCommand(plugin, new OverwhelmCrash());
		this.registerCommand(plugin, new OverflowCrash());

	}

}
