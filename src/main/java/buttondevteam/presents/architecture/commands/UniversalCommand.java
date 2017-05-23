package buttondevteam.presents.architecture.commands;

import buttondevteam.lib.chat.CommandClass;

@CommandClass(modOnly = false, excludeFromPath=true)
public abstract class UniversalCommand extends BaseCommand{
	@Override
	public String[] GetHelpText(String alias){
		return new String[] {
			"This command doesn't have help text.	",
			"If you're a player, ask a mod to write one",
			"If you're a mod, ask a dev to write one",
			"If you're a dev, write the help text you lazy bastard. -Ali"
		};
	}	
}
