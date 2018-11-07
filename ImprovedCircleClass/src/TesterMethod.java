import java.text.DecimalFormat;

/**
 * This is the Main class that will test my other classes.
 * @author Ike Maldonado
 * @version 10/16/18
 *
 */
public class TesterMethod {
	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("#.##"); //For formating decimals
		//Generate three Circle objects
		Circle a = new Circle(2.0, 4.5, 1.0); //Initialize Circle object
		Circle b = new Circle(a);			//Create a copy of the Circle object 'box'
		Point p = new Point();				//Create Point object to use below
		Circle c = new Circle(p,2.1);		//Initialize Circle object with Point object
		Circle def = new Circle();			//Uses default constructor
		

		//Tests methods Circle(x,y,r) and Circle(Circle c)
		System.out.print("**********************************************");
		System.out.println("\nTests the Circle(x,y,r) and Circle(Circle c) methods:");
		//Check to see if objects a & b overlap
		if (a.doesOverlap(b)){
			System.out.print(a);
			System.out.println();
			System.out.print(b);
			System.out.println();
			System.out.print("\nThe radii total is: " + a.radiiTotal(b));
			System.out.print("\nDistance: " + d.format(a.totDistance(b)));
			System.out.print("\nCircle a overlaps with circle b");
		} else {
			System.out.print(a);
			System.out.println();
			System.out.print(b);
			System.out.println();
			System.out.print("\nThe radii total is: " + a.radiiTotal(b));
			System.out.print("\nDistance: " + d.format(a.totDistance(b)));
			System.out.print("\nCircle a doesn't overlap with circle b");
		}
		//Check if objects a & b are equal
		if (a.equals(b)) {
			System.out.print("\nCircle a equals circle b");
		} else {
			System.out.print("\nCircle a does not equal circle b");
		}
		
		
		//Tests methods Circle() and Circle(Point,r)
		System.out.print("\n\n**********************************************");
		System.out.println("\nTests the Circle() and Circle(Point, r) methods:");
		//Check to see if objects def & c overlap
		if (def.doesOverlap(c)) {

			System.out.print(def);
			System.out.println();
			System.out.print(c);
			System.out.println();
			System.out.print("\nThe radii total is: " + def.radiiTotal(c));
			System.out.print("\nDistance: " + d.format(def.totDistance(c)));
			System.out.print("\nCircle def overlaps with circle c");
		} else {
			System.out.print(def);
			System.out.println();
			System.out.print(c);
			System.out.println();
			System.out.print("\nThe radii total is: " + def.radiiTotal(c));
			System.out.print("\nDistance: " + d.format(def.totDistance(c)));
			System.out.print("\nCircle def doesn't overlap with circle c");
		}
		//Check if objects def & c are equal
		if (def.equals(c)) {
			System.out.print("\nCircle def equals circle c");
		} else {
			System.out.print("\nCircle def does not equal circle c ");
		}
		
		
		//Compares circle a & c
		System.out.print("\n\n**********************************************");
		System.out.println("\nCompares the circle a & c:");
		//Check to see if objects a & c overlap
		if (a.doesOverlap(c)){
			System.out.print(a);
			System.out.println();
			System.out.print(c);
			System.out.println();
			System.out.print("\nThe radii total is: " + a.radiiTotal(c));
			System.out.print("\nDistance: " + d.format(a.totDistance(c)));
			System.out.print("\nCircle a overlaps with circle c");
		} else {
			System.out.print(a);
			System.out.println();
			System.out.print(c);
			System.out.println();
			System.out.print("\nThe radii total is: " + a.radiiTotal(c));
			System.out.print("\nDistance: " + d.format(a.totDistance(c)));
			System.out.print("\nCircle a doesn't overlap with circle c");
		}
		//Check if objects a & c are equal
		if (a.equals(c)) {
			System.out.print("\nCircle a equals circle c");
		} else {
			System.out.print("\nCircle a does not equal circle c");
		}
		
	}
}
