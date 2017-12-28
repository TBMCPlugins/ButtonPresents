package buttondevteam.presents;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.components.dictionary.DictionaryComponent;
import buttondevteam.presents.components.magic.MagicComponent;
import buttondevteam.presents.components.spawn.SpawnComponent;

public class Main extends JavaPlugin{
	public void onEnable(){
		PluginDescriptionFile pdfFile = getDescription();
		
		Logger logger = getLogger();
		logger.info(pdfFile.getName() + " has been started (V." + pdfFile.getVersion()+ ").");
		
		new DictionaryComponent().register(this);
		new SpawnComponent().register(this);
		new MagicComponent().register(this);
		
		logger.info(pdfFile.getName() + " has fully registered (V." + pdfFile.getVersion()+ ").");
	}
}
