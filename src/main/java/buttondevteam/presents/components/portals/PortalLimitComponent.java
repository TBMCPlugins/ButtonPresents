package buttondevteam.presents.components.portals;

import buttondevteam.lib.architecture.Component;
import buttondevteam.lib.architecture.ConfigData;
import buttondevteam.presents.ButtonPresents;
import com.google.common.collect.Lists;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;
import org.bukkit.event.player.PlayerPortalEvent;

import java.util.List;

public class PortalLimitComponent extends Component<ButtonPresents> implements Listener {
	@Override
	protected void enable() {
		registerListener(this);
	}

	@Override
	protected void disable() {

	}

	private ConfigData<List<String>> worlds() {
		return getConfig().getData("worlds", Lists.newArrayList("v1", "v2", "v3"));
	}

	@EventHandler(ignoreCancelled = true)
	public void onPortalEnter(PlayerPortalEvent event) {
		if (worlds().get().contains(event.getFrom().getWorld().getName()))
			event.setCancelled(true);
	}

	@EventHandler(ignoreCancelled = true)
	public void onPortalEnter(EntityPortalEvent event) {
		if (worlds().get().contains(event.getFrom().getWorld().getName()))
			event.setCancelled(true);
	}
}
