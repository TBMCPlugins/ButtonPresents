package buttondevteam.presents.components.dungeon;

import buttondevteam.lib.architecture.Component;
import buttondevteam.presents.ButtonPresents;

public class DungeonComponent extends Component<ButtonPresents> {

	@Override
	public void enable() {
		this.registerCommand(new DungeonCreate());
		this.registerCommand(new DungeonDelete());

	}

	@Override
	protected void disable() {

	}

}
