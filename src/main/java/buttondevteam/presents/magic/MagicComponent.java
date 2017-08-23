package buttondevteam.presents.magic;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.presents.architecture.Component;
import buttondevteam.presents.magic.tricks.AliArrowListener;
import buttondevteam.presents.magic.tricks.BoomBowDeathListener;
import buttondevteam.presents.magic.tricks.BoomBowListener;
import buttondevteam.presents.magic.tricks.CannonBowListener;
import buttondevteam.presents.magic.tricks.CannonBowSettings;

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
