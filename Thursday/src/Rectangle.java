
public class Rectangle {
	private static double length;
	private static double width;
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public static void setLength(double l) {
		length = l;
	}
	
	public static void setWidth(double w) {
		width = w;
	}
	
	public static double getArea() {
		double area = length * width;
		return area;
	}
	
	public double getLength() {
		return length;
	}
	
	public static double getWidth() {
		return width;
	}
}
