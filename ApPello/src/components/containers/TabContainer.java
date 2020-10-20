package components.containers;

public class TabContainer extends Container {
	public static final String TABCONTAINERSTART = "<table><tr><td>";
	public static final String TABCONTAINEREND = "</td></tr></table>";
	
	@Override
	public String display() {
		return TABCONTAINERSTART + super.display() + TABCONTAINEREND;
	}
}
