package buttondevteam.presents.components.spawn;

import buttondevteam.lib.architecture.Component;
import buttondevteam.presents.ButtonPresents;

public class SpawnComponent extends Component<ButtonPresents> {
	
	@Override
	public void enable() {
		this.registerCommand(new ChooseColor());
	}

	@Override
	protected void disable() {

	}

}
