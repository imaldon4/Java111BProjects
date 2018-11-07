import javax.swing.*;
import java.util.Scanner;
public class Thursday {
	//Static methods are for utility classes because perform operations, but do not store data.
	public static void main(String[] args) {
		//Create rectangle object
		Rectangle box = new Rectangle();
		
		String input = JOptionPane.showInputDialog("Enter a number for length: ");
		double var = Double.parseDouble(input);
		
		box.setLength(var);
		
		input = JOptionPane.showInputDialog("Enter a number for widtch: ");
		var = Double.parseDouble(input);
		
		box.setWidth(var);
		
		//Pass a reference to the object to the displayRectangle method
		displayRectangle(box);
	}
	
	/**
	 * The displayRectangle method displays the length and width of a rectangle

	 */
	public static void displayRectangle(Rectangle r) {
		System.out.println("Length : " + r.getLength() + 
				" Width : " + Rectangle.getWidth());
		JOptionPane.showMessageDialog(null, "Length equals " + r.getLength() + " Width equals : " +
				Rectangle.getWidth() + " Area equals : " + Rectangle.getArea());
	}
	
	
}
