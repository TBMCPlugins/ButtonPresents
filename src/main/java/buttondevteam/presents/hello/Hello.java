package buttondevteam.presents.hello;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;
import buttondevteam.presents.hello.commands.HelloCommand;
import buttondevteam.presents.hello.commands.HelloLoad;
import buttondevteam.presents.hello.commands.HelloSave;
import buttondevteam.presents.hello.commands.HelloTime;
import buttondevteam.presents.hello.effects.HelloBedsplode;
import buttondevteam.presents.hello.effects.HelloCow;
import buttondevteam.presents.hello.effects.HelloItem;
import buttondevteam.presents.hello.effects.HelloMagicPotato;

public class Hello extends Component{

	@Override
	public void register(JavaPlugin plugin) {
		this.registerCommand(plugin, new HelloCommand(plugin));
		this.registerListener(plugin, new HelloBedsplode());
		this.registerCommand(plugin, new HelloCow());
		this.registerCommand(plugin, new HelloItem());
		this.registerCommand(plugin, new HelloMagicPotato());
		this.registerCommand(plugin, new HelloSave());
		this.registerCommand(plugin, new HelloLoad());
		this.registerCommand(plugin, new HelloTime());
	}
}
