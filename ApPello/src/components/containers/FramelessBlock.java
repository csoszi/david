package components.containers;

public class FramelessBlock extends Container {
	public static final String FRAMELESSBLOCKSTART = "<frameset><noframes>";
	public static final String FRAMELESSBLOCKEND = "</frameset></noframes>";
	
	@Override
	public String display() {
		return FRAMELESSBLOCKSTART + super.display() + FRAMELESSBLOCKEND;
	}

}
