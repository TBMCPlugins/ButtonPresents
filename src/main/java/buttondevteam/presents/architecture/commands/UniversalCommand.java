package buttondevteam.presents.architecture.commands;

public abstract class UniversalCommand extends BaseCommand{
	@Override
	public String[] GetHelpText(String alias){
		return new String[] {
			"This command doesn't have help text.	",
		};
	}
	
	public boolean GetPlayerOnly() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean GetModOnly() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
