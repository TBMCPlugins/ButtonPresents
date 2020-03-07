package buttondevteam.presents.architecture.commands;

import buttondevteam.lib.chat.CommandClass;
import buttondevteam.lib.chat.ICommand2MC;

@CommandClass(modOnly = false, excludeFromPath = true, helpText = {
		"This command doesn't have help text.	",
		"If you're a player, ask a mod to write one",
		"If you're a mod, ask a dev to write one",
		"If you're a dev, write the help text you lazy bastard. -Ali"
})
public abstract class UniversalCommand extends ICommand2MC {
}
