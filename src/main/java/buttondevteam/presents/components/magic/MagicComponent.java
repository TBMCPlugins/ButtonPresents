package buttondevteam.presents.components.magic;

import buttondevteam.lib.architecture.Component;
import buttondevteam.presents.ButtonPresents;
import buttondevteam.presents.components.magic.tricks.*;
import org.bukkit.plugin.java.JavaPlugin;


public class MagicComponent extends Component<ButtonPresents> {
	
	@Override
	public void enable() {
		JavaPlugin plugin = getPlugin();
		registerCommand(new CannonBowSettings());
		registerListener(new AliArrowListener(plugin));
		registerListener(new BoomBowDeathListener());
		registerListener(new BoomBowListener(plugin));
		registerListener(new CannonBowListener(plugin));
	}

	@Override
	protected void disable() {

	}
}
