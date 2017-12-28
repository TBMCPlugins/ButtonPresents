package buttondevteam.presents.components.magic;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;
import buttondevteam.presents.components.magic.tricks.AliArrowListener;
import buttondevteam.presents.components.magic.tricks.BoomBowDeathListener;
import buttondevteam.presents.components.magic.tricks.BoomBowListener;
import buttondevteam.presents.components.magic.tricks.CannonBowListener;
import buttondevteam.presents.components.magic.tricks.CannonBowSettings;


public class MagicComponent extends Component{
	
	@Override
	public void register(JavaPlugin plugin) {
		registerCommand(plugin, new CannonBowSettings());
		registerListener(plugin, new AliArrowListener(plugin));
		registerListener(plugin, new BoomBowDeathListener());
		registerListener(plugin, new BoomBowListener(plugin));
		registerListener(plugin, new CannonBowListener(plugin));
	}
}
