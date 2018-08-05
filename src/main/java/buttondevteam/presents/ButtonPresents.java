package buttondevteam.presents;

import buttondevteam.presents.components.chunkarchive.ChunkArchiveComponent;
import buttondevteam.presents.components.magic.MagicComponent;
import buttondevteam.presents.components.research.ResearchComponent;
import buttondevteam.presents.components.research.dictionary.DictionaryComponent;
import buttondevteam.presents.components.spawn.SpawnComponent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ButtonPresents extends JavaPlugin{

	public void onEnable(){
		PluginDescriptionFile pdfFile = getDescription();
		
		Logger logger = getLogger();
		logger.info(pdfFile.getName() + " has been started (V." + pdfFile.getVersion()+ ").");
		
		 
		new DictionaryComponent().register(this);
		new SpawnComponent().register(this);
		new MagicComponent().register(this);
		new ResearchComponent().register(this);
        new ChunkArchiveComponent().register(this);
		
		logger.info(pdfFile.getName() + " has fully registered (V." + pdfFile.getVersion()+ ").");
	}
}
