package buttondevteam.presents.servlet;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;

public class ServletComponent extends Component {

	@Override
	public void register(JavaPlugin plugin) {
		new AliHelloPage();
		

	}

}
