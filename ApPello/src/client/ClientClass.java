package client;

import components.Engine;
import components.containers.FramedBlock;
import components.containers.TabContainer;
import components.elements.Button;
import components.elements.Combo;
import components.elements.InputField;

public class ClientClass {
	public static void main(String args[]) {
		
		Engine engine = new Engine();

		InputField inputField = new InputField("text", "nev", 10);
		System.out.println(engine.display(inputField));
	
		Button button3 = new Button("empty", "AAAAAAAAAAAAAAAAAAAA");
		Button button4 = new Button("empty", "BBBBBBBBBBBBBBBBBBBB");
		FramedBlock framedb2 = new FramedBlock(10);
		//framedb2.addNextLine(button3).addNextLine(button4);
		//System.out.println(engine.display(framedb2));

		//framedb2.add(button3).add(button4);
		
		Button button5 = new Button("text", "---------");
		Button button6 = new Button("empty", "_____Click me_____");
		framedb2.add(button5);
		framedb2.add(button6);
		framedb2.addNextLine(button3).add(button5);
		System.out.println(engine.display(framedb2));
		
		//display the combo element
		Combo combo  = new Combo("cars", "volvo", "Volvo", "saab", "Saab");
		System.out.println("display the combo element: " + engine.display(combo));
		
		TabContainer tabContainer = new TabContainer();
		tabContainer.addNextLine(button3).add(combo);
		System.out.println(engine.display(tabContainer));
		
	}

}
