package buttondevteam.presents.components.dictionary;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;
import buttondevteam.presents.components.dictionary.commands.SendJSON;
import buttondevteam.presents.components.dictionary.commands.SendMessage;
import buttondevteam.presents.components.dictionary.config.LoadConfig;
import buttondevteam.presents.components.dictionary.config.SaveConfig;
import buttondevteam.presents.components.dictionary.config.TimePersistence;
import buttondevteam.presents.components.dictionary.effects.Bedsplode;
import buttondevteam.presents.components.dictionary.pages.DataPage;
import buttondevteam.presents.components.dictionary.pages.HelloPage;
import buttondevteam.presents.components.dictionary.pages.JSONPage;
import buttondevteam.presents.components.dictionary.pages.LocationPage;
import buttondevteam.presents.components.dictionary.pages.POSTPage;
import buttondevteam.presents.components.dictionary.pages.PlayersOnlinePage;
import buttondevteam.presents.components.dictionary.spawning.PlaySound;
import buttondevteam.presents.components.dictionary.spawning.SetBlock;
import buttondevteam.presents.components.dictionary.spawning.SpawnCow;
import buttondevteam.presents.components.dictionary.spawning.SpawnItem;
import buttondevteam.presents.components.dictionary.spawning.SpawnMagicPotato;
import buttondevteam.presents.components.dictionary.spawning.SpawnParticle;

public class DictionaryComponent extends Component{

	@Override
	public void register(JavaPlugin plugin) {
		
		this.registerCommand(plugin, new SendMessage());
		this.registerCommand(plugin, new SendJSON());
		this.registerCommand(plugin, new SaveConfig());
		this.registerCommand(plugin, new LoadConfig());
		this.registerCommand(plugin, new TimePersistence());
		
		this.registerListener(plugin, new Bedsplode());
		this.registerCommand(plugin, new SpawnCow());
		this.registerCommand(plugin, new SpawnItem());
		this.registerCommand(plugin, new SpawnMagicPotato());
		this.registerCommand(plugin, new SetBlock());
		this.registerCommand(plugin, new SpawnParticle());
		this.registerCommand(plugin, new PlaySound());
		
		this.addPage(plugin, new HelloPage());
		this.addPage(plugin, new DataPage());
		this.addPage(plugin, new PlayersOnlinePage(plugin));
		this.addPage(plugin, new LocationPage(plugin));
		this.addPage(plugin, new POSTPage(plugin));
		this.addPage(plugin, new JSONPage());
	}
}
