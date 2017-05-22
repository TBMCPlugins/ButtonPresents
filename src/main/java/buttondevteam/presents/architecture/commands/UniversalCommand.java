package buttondevteam.presents.architecture.commands;

import buttondevteam.lib.chat.CommandClass;

@CommandClass(modOnly = false)
public abstract class UniversalCommand extends BaseCommand{
	@Override
	public String[] GetHelpText(String alias){
		return new String[] {
			"This command doesn't have help text.	",
		};
	}	
}
