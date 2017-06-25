package buttondevteam.presents.dictionary;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;
import buttondevteam.presents.dictionary.commands.SendMessage;
import buttondevteam.presents.dictionary.config.LoadConfig;
import buttondevteam.presents.dictionary.config.SaveConfig;
import buttondevteam.presents.dictionary.config.TimePersistence;
import buttondevteam.presents.dictionary.commands.SendJSON;
import buttondevteam.presents.dictionary.effects.Bedsplode;
import buttondevteam.presents.dictionary.pages.DataPage;
import buttondevteam.presents.dictionary.pages.JSONPage;
import buttondevteam.presents.dictionary.pages.LocationPage;
import buttondevteam.presents.dictionary.pages.POSTPage;
import buttondevteam.presents.dictionary.pages.PlayersOnlinePage;
import buttondevteam.presents.dictionary.spawning.PlaySound;
import buttondevteam.presents.dictionary.spawning.SetBlock;
import buttondevteam.presents.dictionary.spawning.SpawnCow;
import buttondevteam.presents.dictionary.spawning.SpawnItem;
import buttondevteam.presents.dictionary.spawning.SpawnMagicPotato;
import buttondevteam.presents.dictionary.spawning.SpawnParticle;
import buttondevteam.presents.dictionary.pages.HelloPage;

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
