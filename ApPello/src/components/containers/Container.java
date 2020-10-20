package components.containers;

import java.util.ArrayList;
import java.util.List;

import components.Component;
import components.elements.NewLine;

public abstract class Container implements Component {
	private List<Component> cointainers;

	//Constructor to create the List of Components
	public Container() {
		cointainers = new ArrayList<Component>();
	}

	//Call each Component's display method
	@Override
	public String display() {
		String returnHTML = "";
		for (Component item : cointainers) {
			returnHTML += item.display();
		}
		return returnHTML;
	}

	//add Component next to other Component
	public Container add(Component cont) {
		this.cointainers.add(cont);
		return this;
	}

	//add Component below to other Component
	public Container addNextLine(Component cont) {
		this.cointainers.add(new NewLine());
		this.cointainers.add(cont);
		return this;
	}

}
