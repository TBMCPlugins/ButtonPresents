package buttondevteam.presents.servlet;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;
import buttondevteam.website.ButtonWebsiteModule;

public class ServletComponent extends Component {

	@Override
	public void register(JavaPlugin plugin) {
		ButtonWebsiteModule.addPage(new AliHelloPage());

	}

}
