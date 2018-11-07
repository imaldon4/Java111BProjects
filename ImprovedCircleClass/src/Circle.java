/**
 * This class will provide tools for using
 * Point class for circle formulas.
 * @author Ike Maldonado
 * @version 10/16/18
 *
 */
public class Circle {
	//Fields
	private Point center;
	private double radius;
	
	
	/**
	 * Circle constructor
	 * @param o
	 * @param r
	 */
	public Circle(Point o, double r) {
		center = new Point(o);
		radius = r;
	}
	
	
	/**
	 * Circle constructor
	 * @param xValue
	 * @param yValue
	 * @param r The radius
	 */
	public Circle(double xValue, double yValue, double r) {
		center = new Point(xValue,yValue);
		radius = r;
	}
	
	
	/**
	 * No-arg constructor.
	 * @param none
	 */
	public Circle() {
		center = new Point();
		radius = 0.0;
	}
	
	
	/**
	 * This is a copy constructor.
	 * @param c The circle object copied from
	 */
	public Circle(Circle c) {
		center = c.center;
		radius = c.radius;
	}
	
	
	/**
	 * @return center Returns a copy of the center object
	 */
	public Point getCenter() {
		return new Point(center);
	}
	
	
	/**
	 * Sets center to Point object passed in.
	 * @param p The Point object copied
	 */
	public void setCenter(Point p) {
		center = new Point(p);
	}
	
	
	/**
	 * Returns toString method with values for x,y,radius.
	 * @param none
	 */
	public String toString() {
		String str = "\nThe x-value is: " + this.getX() +
				"\nThe y-value is: " + this.getY() +
				"\nThe radius is: " + radius;
		return str;
	}
	
	/**
	 * Compares this Circle class object to another and returns 
	 * true if they are the same.
	 * @param c The circle object being compared
	 * @return status True if the same
	 */
	public boolean equals(Circle c) {
		boolean status;
		if (this.center.equals(c.center) && this.radius == c.radius) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
	
	
	/**
	 * Sets the value of x for Point center object
	 * @param xValue
	 */
	public void setX(double xValue)
	{
		center.setX(xValue);
	}

	
	/**
	 * Returns the value of x from Point center object
	 * @return
	 */
	public double getX()
	{
		return this.center.getX();
	}

	
	/**
	 * Sets the value of y to Point center object
	 * @param yValue
	 */
	public void setY(double yValue)
	{
		center.setY(yValue);
	}

	
	/**
	 * Returns the value of y from Point center object
	 * @return
	 */
	public double getY()
	{
		return this.center.getY();
	}
	
	
	/**
	 * This method checks to see whether the two circles, based on their points
	 * on a coordinate plane, intersect. 
	 * @param otherCircle
	 * @return status Boolean value returns true if circles intersect.
	 */
	public boolean doesOverlap(Circle c) {
		boolean status;
		//Sets the sum of this radius and c radius
		double radiiTotal = radius + c.radius;				
		//Uses distance method to calculate distance between two 
		//provided objects.
		double distance = center.distance(c.center);
		//Test if distance is larger than the sum of two radiuses.
		//If larger return true (they intersect)
		if (distance < radiiTotal) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
	
	
	/**
	 * Returns the sum of the radii and distance for the two objects.
	 * @param c A circle object
	 * @return radiiTotal The sum of both radii
	 */
	public double radiiTotal(Circle c) {
		double radiiTotal = radius + c.radius;		//Sets the sum of two radii
		return radiiTotal;
	}
	
	
	/**
	 * Returns the distance between the two circles using the
	 * distance method of the Point class
	 * @param c A circle object
	 * @return totDistance The distance between this circle and
	 * circle c
	 */
	public double totDistance(Circle c) {
		double totDistance = center.distance(c.center);
		return totDistance;
	}
}
