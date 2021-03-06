package buttondevteam.presents;

import buttondevteam.lib.architecture.Component;
import buttondevteam.presents.components.magic.MagicComponent;
import buttondevteam.presents.components.portals.PortalLimitComponent;
import buttondevteam.presents.components.research.ResearchComponent;
import buttondevteam.presents.components.research.dictionary.DictionaryComponent;
import buttondevteam.presents.components.spawn.SpawnComponent;
import buttondevteam.presents.components.townyfactions.TownyFactionsComponent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ButtonPresents extends JavaPlugin{
	//Hello Norbs - Hello Ali
	public void onEnable(){
		PluginDescriptionFile pdfFile = getDescription();
		
		Logger logger = getLogger();
		logger.info(pdfFile.getName() + " has been started (V." + pdfFile.getVersion()+ ").");


		Component.registerComponent(this, new DictionaryComponent());
		Component.registerComponent(this, new SpawnComponent());
		Component.registerComponent(this, new MagicComponent());
		Component.registerComponent(this, new ResearchComponent());
		Component.registerComponent(this, new TownyFactionsComponent());
		Component.registerComponent(this, new PortalLimitComponent());
		
		logger.info(pdfFile.getName() + " has fully registered (V." + pdfFile.getVersion()+ ").");
	}
}
