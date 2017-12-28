package buttondevteam.presents.components.research;

import buttondevteam.presents.architecture.commands.ModCommand;

public abstract class Question extends ModCommand {
	public abstract String question();
	public abstract String answer();
	protected String answer = "Undetermined";

}
