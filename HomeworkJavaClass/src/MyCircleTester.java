import java.text.DecimalFormat;

/**
 * This main method will set and test the three circle objects for overlapping
 * circles. 
 * @author Ike Maldonado
 * @version 10/01/18
 */
public class MyCircleTester {
	
	/**
	 * The main method 
	 * @param args
	 */
	public static void main(String[]args) {
		//To produce attractive decimal formatting
		DecimalFormat df = new DecimalFormat("#.##");
		
		
		//Initialize circle objects
		MyCircle a = new MyCircle();
		MyCircle b = new MyCircle();
		MyCircle c = new MyCircle();
		
		
		//Set first circle
		a.setX(0.00);
		a.setY(0.00);
		a.setRadius(5.0);

		//Set second circle
		b.setX(10.00);
		b.setY(0.00);
		b.setRadius(6.50);		//This should overlap with circle a by 1.50
		
		//Set third circle
		c.setX(-10.50);
		c.setY(2.50);
		c.setRadius(3.25); 		//This circle should not overlap any circles
		

		//Print coordinates
		System.out.println("Circle a has coordinates (" + a.getX() + "," + a.getY() + ")" +
				" with radius " + a.getRadius());
		System.out.println("Circle b has coordinates (" + b.getX() + "," + b.getY() + ")" +
				" with radius " + b.getRadius());
		System.out.println("Circle c has coordinates (" + c.getX() + "," + c.getY() + ")" +
				" with radius " + c.getRadius());

		
		System.out.println();
		//Display area of three circles
		System.out.println("Circle a has an area of " + df.format(a.getArea()));
		System.out.println("Circle b has an area of " + df.format(b.getArea()));
		System.out.println("Circle c has an area of " + df.format(c.getArea()));
		
		
		System.out.println();
		//Test circle a with b, and test a with c for overlapping
		//The showOverlap method will take objects as parameters and return 
		//an statement of overlapping or not.
		System.out.println("Circles a and b " + a.showOverlap(b) + ".");
		System.out.println();
		System.out.println("Circles a and c " + a.showOverlap(c) + ".");
	}
}
