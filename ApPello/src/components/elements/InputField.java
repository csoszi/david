package components.elements;

import components.Component;


/**
 * Returns an Image object that can then be painted on the screen. 
 * The url argument must specify an absolute {@link URL}. The name
 * argument is a specifier that is relative to the url argument. 
 * <p>
 * This method always returns immediately, whether or not the 
 * image exists. When this applet attempts to draw the image on
 * the screen, the data will be loaded. The graphics primitives 
 * that draw the image will incrementally paint on the screen. 
 *
 * @param  url  an absolute URL giving the base location of the image
 * @param  name the location of the image, relative to the url argument
 * @return      the image at the specified URL
 * @see         Image
 */
public class InputField implements Component {

	public static final String INPUTTYPE = "<input type=\"";
	public static final String INPUTNAME = "\" name=\"";
	public static final String INPUTSIZE = "\" size=\"";
	public static final String INPUTEND =  "\"></input>";
	
	private String type;
	private String name;
	private int size;

	//Constructor to initialize the type,name and size fields
	public InputField(String type, String name, int size) {
		super();
		this.type = type;
		this.name = name;
		this.size = size;
	}

	@Override
	public String display()
	{
	return INPUTTYPE + type + INPUTNAME + name + INPUTSIZE + size +  INPUTEND ;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
