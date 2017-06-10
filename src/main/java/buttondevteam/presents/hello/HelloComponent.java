package buttondevteam.presents.hello;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;
import buttondevteam.presents.hello.commands.HelloCommand;
import buttondevteam.presents.hello.commands.HelloLoad;
import buttondevteam.presents.hello.commands.HelloSave;
import buttondevteam.presents.hello.commands.HelloTime;
import buttondevteam.presents.hello.effects.HelloBedsplode;
import buttondevteam.presents.hello.effects.HelloBlock;
import buttondevteam.presents.hello.effects.HelloCow;
import buttondevteam.presents.hello.effects.HelloItem;
import buttondevteam.presents.hello.effects.HelloMagicPotato;
import buttondevteam.presents.hello.effects.HelloParticle;
import buttondevteam.presents.hello.effects.HelloSound;
import buttondevteam.presents.hello.pages.HelloDataPage;
import buttondevteam.presents.hello.pages.HelloPlayersPage;
import buttondevteam.presents.hello.pages.HelloWorldPage;

public class HelloComponent extends Component{

	@Override
	public void register(JavaPlugin plugin) {
		this.registerCommand(plugin, new HelloCommand());
		this.registerListener(plugin, new HelloBedsplode());
		this.registerCommand(plugin, new HelloCow());
		this.registerCommand(plugin, new HelloItem());
		this.registerCommand(plugin, new HelloMagicPotato());
		this.registerCommand(plugin, new HelloSave());
		this.registerCommand(plugin, new HelloLoad());
		this.registerCommand(plugin, new HelloTime());
		this.registerCommand(plugin, new HelloBlock());
		this.registerCommand(plugin, new HelloParticle());
		this.registerCommand(plugin, new HelloSound());
		
		this.addPage(plugin, new HelloWorldPage());
		this.addPage(plugin, new HelloDataPage());
		this.addPage(plugin, new HelloPlayersPage(plugin));
	}
}
