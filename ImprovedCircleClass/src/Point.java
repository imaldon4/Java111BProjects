/**
 * The modified Point class takes in x and y values and offers
 * methods for retrieving them.
 * @author Ike Maldonado
 * @author Jason Schatz
 * @version 10/16/18
 *
 */
public class Point
{
	//Fields
	private double x;
	private double y;

	/**
	 * Constructor to set values of x and y
	 * @param xValue
	 * @param yValue
	 */
	public Point(double xValue, double yValue)
	{
		x = xValue;
		y = yValue;
	}

	/**
	 * Constructor that accepts Point object
	 * and sets the values of x and y
	 * @param p
	 */
	public Point(Point p) {
		this(p.x, p.y);
	}

	/**
	 * Default no-arg constructor
	 */
	public Point() {
		this(0, 0);
	}

	/**
	 * Sets the value of the x component
	 * @param xValue
	 */
	public void setX(double xValue)
	{
		x = xValue;
	}

	/**
	 * Returns the value of the x component
	 * @return x The value of x
	 */
	public double getX()
	{
		return x;
	}

	/**
	 * Sets the value of the y component
	 * @param yValue
	 */
	public void setY(double yValue)
	{
		y = yValue;
	}

	/**
	 * Returns the value of the y component
	 * @return y The value of y
	 */
	public double getY()
	{
		return y;
	}

	/**
	 * Compares two Point objects
	 * @param otherPoint
	 * @return "(" + x + ", " + y + ")" Returns the coordinates
	 */
	public boolean equals(Point otherPoint)
	{
		return (this.x == otherPoint.x) && (this.y == otherPoint.y);
	}

	/**
	 * toString method
	 * @return "(" + x + ", " + y + ")" Returns the coordinates
	 */
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	/**
	 * This distance formula will compare the referred coordinates to
	 * the original one.
	 * @param other
	 * @return result Returns value of distance formula 
	 */
	public double distance(Point other) {
		double result = Math.sqrt(Math.pow((other.x - this.x), 2) + 
				Math.pow((other.y - this.y), 2));
		return result;
	}
}