// Author: R Pragnesh Reddy Nandyala
// Assignment 4
// April 13, 2016

package pa4;
// The purpose of this class is to draw a shape of particular size
public abstract class Polygon {
// gives size like length, breadth, or height. 
	private double size;

	public double getSize() {

		return size;
	}
// The purpose of this method is to throw exception when size are equal to zero or less
	public Polygon(double s) throws ZeroSizeForPolygonException {

		this.size = s;
	}
// The purpose of this method is to calculate area of particular size
	public abstract double area();
// The purpose of this mehtod is to calculate perimeter of particular size
	public abstract double perimeter();
// The purpose of this method is to compare ploygon area and area of a square,tringle etc.
	public int compareTo(Polygon p) {

		if (this.area() > p.area())
			return 1;
		else if (this.area() < p.area())
			return -1;
		else
			return 0;
	}
//purpose of this method is to compare polygon area to the shape another  
	public boolean equals(Polygon p) {

		if (this.area() > p.area() || this.area() < p.area()) {
			return false;
		} else
			return true;
	}
// The purpose of this method is to convert data into a string format 
	public abstract String toString();

}

class ZeroSizeForPolygonException extends Exception {

	private static final double  VALUE = 1;

	public ZeroSizeForPolygonException(String readable)

	{
		super(readable);
	}

}