package buttondevteam.presents.components.chunkarchive;

import buttondevteam.lib.TBMCCoreAPI;
import buttondevteam.presents.architecture.Component;
import net.minecraft.server.v1_12_R1.ChunkRegionLoader;
import net.minecraft.server.v1_12_R1.ExceptionWorldConflict;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_12_R1.CraftChunk;
import org.bukkit.craftbukkit.v1_12_R1.CraftServer;
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

// @formatter:off
public class ChunkArchiveComponent extends Component implements Listener {
    private final File dataFolder = new File("plugins", "ChunkArchive");
    @Override
    public void register(JavaPlugin plugin) {
        try {
            this.registerListener(plugin, this);
            File testFolder = new File(dataFolder, "test");
            testFolder.mkdirs();
            Logger logger = plugin.getLogger();
            logger.info("Starting chunk save test...");
            ChunkRegionLoader testcrl = new ChunkRegionLoader(testFolder,
                    ((CraftServer) Bukkit.getServer()).getServer().dataConverterManager);
            CraftWorld mainWorld=(CraftWorld) Bukkit.getWorlds().get(0);
            testcrl.saveChunk(mainWorld.getHandle(),
                    ((CraftChunk) mainWorld.getLoadedChunks()[0]).getHandle(), false);
            logger.info("Test complete");
        }
        catch(Exception e) {
            TBMCCoreAPI.SendException("ChunkArchive loading/testing failed!", e);
        }
    }
    /*------------------------------------------------------------*/

    private final ChunkRegionLoader chunkRegionLoader =

            new ChunkRegionLoader(dataFolder,
                    ((CraftServer) Bukkit.getServer()).getServer().dataConverterManager);

    /*------------------------------------------------------------*/

    @EventHandler
    public void onChunkPopulate(ChunkPopulateEvent event) throws IOException, ExceptionWorldConflict
    {
        if (event.getWorld().getName().equals("world"))
            chunkRegionLoader.saveChunk(((CraftWorld) event.getWorld()).getHandle(),
                    ((CraftChunk) event.getChunk()).getHandle(), false);
    }
}
