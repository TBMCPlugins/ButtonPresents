package buttondevteam.presents.test;

import org.bukkit.command.CommandSender;

import buttondevteam.presents.architecture.commands.UniversalCommand;

public class PersistenceTest extends UniversalCommand {
	final private String path = "test.presistence.data";
	
	public PersistenceTest(){
		runTest();
	}
	
	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args) {
		if(runTest()){
			sender.sendMessage("Everything seems pretty fine");
			sender.sendMessage(path + " contains the String");
			sender.sendMessage(this.getPlugin().getConfig().getString(path));
			return true;
		}else{
			sender.sendMessage("[ButtonPresents] Persistence Test Failed! Button Presents may have an erased config.yml");
			return true;
		}
	}
	
	private boolean runTest(){
		boolean test = this.getPlugin().getConfig().contains(path);
		if(test){
			return true;
		}else{
			this.getPlugin().getConfig().set(path, "Lorem Ipsum");
			throw new AssertionError("[ButtonPresents] Persistence Test Failed! Button Presents may have an erased config.yml");
		}
	}

}
