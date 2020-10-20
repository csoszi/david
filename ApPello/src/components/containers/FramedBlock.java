package components.containers;

public class FramedBlock extends Container {
	
	public static final String FRAMEDBLOCKSTART = "<frameset cols=\"";
	public static final String FRAMEDCOLS = "\">";
	public static final String FRAMEDBLOCKEND = "</frameset>";
	
	private int cols;
	
	//Constructor to initialize the cols field
	public FramedBlock(int cols) {
		super();
		this.cols = cols;
	}

	//
	@Override
	public String display() {
		return FRAMEDBLOCKSTART + cols + FRAMEDCOLS + super.display() + FRAMEDBLOCKEND;
	}


}