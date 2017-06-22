package buttondevteam.presents;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.hello.HelloComponent;
import buttondevteam.presents.metrics.MetricsComponent;
import buttondevteam.presents.rtp.RandomTeleportComponent;

public class Main extends JavaPlugin{
	public void onEnable(){
PluginDescriptionFile pdfFile = getDescription();
		
		Logger logger = getLogger();
		logger.info(pdfFile.getName() + " has been started (V." + pdfFile.getVersion()+ ").");
		
		new HelloComponent().register(this);
		new RandomTeleportComponent().register(this);
		new MetricsComponent().register(this);
		
		logger.info(pdfFile.getName() + " has fully registered (V." + pdfFile.getVersion()+ ").");
	}
}
