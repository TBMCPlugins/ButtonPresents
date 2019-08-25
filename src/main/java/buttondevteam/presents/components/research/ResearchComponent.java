package buttondevteam.presents.components.research;

import buttondevteam.lib.architecture.Component;
import buttondevteam.presents.ButtonPresents;
import buttondevteam.presents.components.research.questions.OverflowCrash;
import buttondevteam.presents.components.research.questions.OverwhelmCrash;
import buttondevteam.presents.components.research.questions.PluginConfigInfo;
import buttondevteam.presents.components.research.questions.PluginDataFolderInfo;

public class ResearchComponent extends Component<ButtonPresents> {

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		this.registerCommand(new PluginConfigInfo());
		this.registerCommand(new PluginDataFolderInfo());
		this.registerCommand(new OverwhelmCrash());
		this.registerCommand(new OverflowCrash());

	}

	@Override
	protected void disable() {

	}

}
