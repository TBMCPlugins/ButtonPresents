package buttondevteam.presents.components.research.dictionary;

import buttondevteam.lib.architecture.Component;
import buttondevteam.presents.ButtonPresents;
import buttondevteam.presents.components.research.dictionary.commands.SendJSON;
import buttondevteam.presents.components.research.dictionary.commands.SendMessage;
import buttondevteam.presents.components.research.dictionary.config.LoadConfig;
import buttondevteam.presents.components.research.dictionary.config.SaveConfig;
import buttondevteam.presents.components.research.dictionary.config.TimePersistence;
import buttondevteam.presents.components.research.dictionary.effects.Bedsplode;
import buttondevteam.presents.components.research.dictionary.spawning.*;
import org.bukkit.plugin.java.JavaPlugin;

public class DictionaryComponent extends Component<ButtonPresents> {

	@Override
	public void enable() {
		JavaPlugin plugin = getPlugin();

		this.registerCommand(new SendMessage());
		this.registerCommand(new SendJSON());
		this.registerCommand(new SaveConfig());
		this.registerCommand(new LoadConfig());
		this.registerCommand(new TimePersistence());

		this.registerListener(new Bedsplode());
		this.registerCommand(new SpawnCow());
		this.registerCommand(new SpawnItem());
		this.registerCommand(new SpawnMagicPotato());
		this.registerCommand(new SetBlock());
		this.registerCommand(new SpawnParticle());
		this.registerCommand(new PlaySound());

		/*ButtonWebsiteModule.addPage(new HelloPage());
		ButtonWebsiteModule.addPage(new DataPage());
		ButtonWebsiteModule.addPage(new PlayersOnlinePage(plugin));
		ButtonWebsiteModule.addPage(new LocationPage(plugin));
		ButtonWebsiteModule.addPage(new POSTPage(plugin));
		ButtonWebsiteModule.addPage(new JSONPage());*/
	}

	@Override
	protected void disable() {

	}
}
