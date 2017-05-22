package buttondevteam.presents.architecture.commands;

import buttondevteam.lib.chat.CommandClass;

@CommandClass(modOnly = true, excludeFromPath=true)
public abstract class ModCommand extends PlayerCommand{

	@Override
	public String[] GetHelpText(String alias){
		return new String[] {
				"This command doesn't have help text, ask a dev to add one",
				"If you're a dev, write the help text you lazy bastard. -Ali"
		};
	}
}
