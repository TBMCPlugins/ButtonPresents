package buttondevteam.presents.components.research;

import buttondevteam.presents.architecture.commands.UniversalCommand;

public abstract class Question extends UniversalCommand {
	public abstract String question();

	public abstract String answer();

	protected String answer = "Undetermined";
}
