package buttondevteam.presents.metrics;

import java.util.Objects;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerLogins implements Listener {

	private JavaPlugin plugin;

	public PlayerLogins(JavaPlugin plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event){
		String[] array = {
				event.getPlayer().getName(),
				"login"
				};
		plugin.getConfig().set("metrics.logins." + Objects.toString(System.currentTimeMillis()), array);
		plugin.saveConfig();
	}

	@EventHandler
	public void onPlayerLogout(PlayerQuitEvent event){
		String[] array = {
				event.getPlayer().getName(),
				"logout"
				};
		plugin.getConfig().set("metrics.logins." + Objects.toString(System.currentTimeMillis()), array);
		plugin.saveConfig();
	}
}
