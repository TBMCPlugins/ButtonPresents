package buttondevteam.presents.hello;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;

public class Hello extends Component{

	@Override
	public void register(JavaPlugin plugin) {
		this.registerCommand(plugin, new HelloCommand(plugin));
		this.registerListener(plugin, new HelloBedsplode());
		this.registerCommand(plugin, new HelloCow());
		this.registerCommand(plugin, new HelloItem());
		this.registerCommand(plugin, new HelloMagicPotato());
		this.registerCommand(plugin, new HelloSave(plugin));
		this.registerCommand(plugin, new HelloLoad(plugin));
	}
}
