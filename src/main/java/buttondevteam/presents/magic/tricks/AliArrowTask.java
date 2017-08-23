package buttondevteam.presents.magic.tricks;

import org.bukkit.Particle;
import org.bukkit.entity.Arrow;
import org.bukkit.scheduler.BukkitRunnable;

public class AliArrowTask extends BukkitRunnable {
	static String[] permittedUsers = {"alisolarflare", "Zanthr", "NorbiPeti"};
	String name;
	Arrow arrow;
	int count = 0;

	public AliArrowTask(Arrow arrow, String name) {
		this.name = name;
		this.arrow = arrow;
	}

	@Override
	public void run() {
		count++;
		if (count > 400 ||arrow.isOnGround() || arrow.isDead()) {
			this.cancel();
		}
		
		switch(name.toLowerCase()){
		case "alisolarflare":
			arrow.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, arrow.getLocation(), 1);
			break;
			
		case "zanthr":
			arrow.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, arrow.getLocation(), 1);
			arrow.getWorld().spawnParticle(Particle.FLAME, arrow.getLocation(), 1);
			break;
			
		case "norbipeti":
			arrow.getWorld().spawnParticle(Particle.LAVA, arrow.getLocation(), 1);
			break;
			
		case "mayskam1995":
			arrow.getWorld().spawnParticle(Particle.DRIP_WATER, arrow.getLocation(), 2);
			break;
		}

	}

}
