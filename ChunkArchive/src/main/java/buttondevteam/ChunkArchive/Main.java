package buttondevteam.ChunkArchive;

import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_12_R1.CraftChunk;
import org.bukkit.craftbukkit.v1_12_R1.CraftServer;
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.lib.TBMCCoreAPI;
import net.minecraft.server.v1_12_R1.ChunkRegionLoader;
import net.minecraft.server.v1_12_R1.ExceptionWorldConflict;

public class Main extends JavaPlugin implements Listener {
	public void onEnable() {
		TBMCCoreAPI.RegisterEventsForExceptions(this, this);
	}
	/*------------------------------------------------------------*/

	private final ChunkRegionLoader chunkRegionLoader =

			new ChunkRegionLoader(this.getDataFolder(),
					((CraftServer) Bukkit.getServer()).getServer().dataConverterManager);

	/*------------------------------------------------------------*/

	@EventHandler
	public void onChunkPopulate(ChunkPopulateEvent event) throws IOException, 
																 ExceptionWorldConflict
	{
		if (event.getWorld().getName().equals("world"))
			chunkRegionLoader.saveChunk(((CraftWorld) event.getWorld()).getHandle(),
								((CraftChunk) event.getChunk()).getHandle(), false);
	}
}
