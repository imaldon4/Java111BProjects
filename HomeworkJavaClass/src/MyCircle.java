import java.math.*;
import java.text.DecimalFormat;
import java.util.*;

/**
 * This class will provide an assortment of tools. 
 * @author Ike Maldonado
 * @version 10/01/18
 *
 */
public class MyCircle {
	//Set fields 
	private double x;
	private double y;
	private double radius;
	
	
	/**
	 * Sets the value of x for this object
	 * @param value
	 */
	public void setX(double value) {
		x = value;
	}
	
	
	/**
	 * Returns the value of x for this object
	 * @return
	 */
	public double getX() {
		return x;
	}
	
	
	/**
	 * Sets the value of y for this object
	 * @param value
	 */
	public void setY(double value) {
		y = value;
	}
	
	
	/**
	 * Returns the value of y for this object
	 * @return
	 */
	public double getY() {
		return y;
	}
	
	
	/**
	 * Sets the value of the radius for this object
	 * @param value
	 */
	public void setRadius(double value) {
		radius = value;
	}
	
	
	/**
	 * Returns the value of the radius for this object
	 * @return
	 */
	public double getRadius() {
		return radius;
	}
	
	
	/**
	 * Returns a string containing the object values.
	 * Not used in the main method.
	 * @param none No parameters accepted
	 */
	public String toString() {
		String str = "x = " + x + "\ny = " + y + "\nradius = " + radius;
		return str;
	}
	
	
	/**
	 * Returns the Area of the circle
	 * @return area Returns the area as a double
	 */
	public double getArea() {
		//Get radius value
		double r = getRadius();	
		//Utilize Math class for pi and exponents
		double area = Math.PI * (Math.pow(r, 2));
		return area;
	}
	
	
	/**
	 * This method can test whether two objects are equal
	 * @param object2
	 * @return status Returns true if x and y coordinates are the same
	 */
	public boolean equals(MyCircle object2) {
		//Set flag
		boolean status;
		//Test if fields from current object x & y values are equal to 
		//fields from object2's x & y values
		if (x == object2.x && y == object2.y) {
			System.out.println("The fields are the same");
			status = true;
		} else {
			System.out.println("The fields are not the same");
			status = false;
		}
		return status;
	}
	
	
	/**
	 * This method calculates and displays the distances between the two circles.
	 * It takes in doesOverlap() method and uses it to test an if statement.
	 * Not used by the main method in this practice.
	 * @param otherCircle 
	 */
	public void distanceBetween(MyCircle otherCircle) {
		//Calculate distance of two points using distance formula
		double distance = Math.sqrt((Math.pow((x - otherCircle.getX()), 2)) + 
				(Math.pow((y - otherCircle.getY()), 2)));
		//Test distance vs sum of the radiuses
		if (doesOverlap(otherCircle)) {
			System.out.println("The sum of the radiuses is: " + (radius + otherCircle.radius));
			System.out.println("The distance between the center points of the two circles is: " + distance);
			System.out.println("Therefore the two circles overlap by: " + (distance - (radius + otherCircle.radius)));
		} else {
			System.out.println("The sum of the radiuses is: " + (radius + otherCircle.radius));
			System.out.println("The distance between the center points of the two circles is: " + distance);
			System.out.println("Therefore they do not overlap");
		}
	}
	
	
	/**
	 * Calls the doesOverlap method with arguments
	 * @param otherCircle
	 */
	public String showOverlap(MyCircle otherCircle) {
		String str;
		//Tests doesOverlap for boolean value.
		if(doesOverlap(otherCircle)) {
			str = "overlap";
		} else {
			str = "don't overlap";
		}
		return str;
	}
	
	
	/**
	 * This method checks to see whether the two circles, based on their points
	 * on a coordinate plane, intersect. 
	 * @param otherCircle
	 * @return status Boolean value returns true if circles intersect.
	 */
	public boolean doesOverlap(MyCircle otherCircle) {
		DecimalFormat df = new DecimalFormat("#.##");
		boolean status;
		double sum = otherCircle.radius + radius;		//Sets the sum of two radii
		
		//Use distance formula. Use current object's values and other object's values.
		double distance = Math.sqrt((Math.pow((x - otherCircle.getX()), 2)) + 
				(Math.pow((y - otherCircle.getY()), 2)));
		
		//Test if distance is larger than the sum of two radiuses.
		//If larger return true (they intersect)
		System.out.println("Sum of radii: " + sum);
		if (distance < sum) {
			status = true;
			System.out.println("Distance: " + df.format(distance));

		} else {
			status = false;
			System.out.println("Distance: " + df.format(distance));
		}
		return status;
	}
	
	
	/**
	 * This retrieves user input as double
	 * @return Returns input double
	 */
	public double in() {
		Scanner keyboard = new Scanner(System.in);
		double input = keyboard.nextDouble();
		return input;
	}
}





	


