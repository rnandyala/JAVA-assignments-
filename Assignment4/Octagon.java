// Author: R Pragnesh Reddy Nandyala
// Assignment 4
// April 13, 2016

package pa4;
//The purpose of this class is to override methods in abstract class
public class Octagon extends Polygon {
// The purpose of this constructor to throw exception if size is zero or -ve
	public Octagon(double s) throws ZeroSizeForPolygonException {

		super(s);
		if (this.getSize() <= 0) {
			throw new ZeroSizeForPolygonException("Size is less than or equal to zero");
		}
	}
//The purpose of this method is to calculate area
	@Override
	public double area() {

		double areaOctagon = (2 + 2 * Math.sqrt(2)) * this.getSize() * this.getSize();
		return areaOctagon;
	}
//The purpose of this 
	@Override
	public double perimeter() {

		double perimeterOctagon = 8 * this.getSize();
		return perimeterOctagon;
	}

	@Override
	public String toString() {

		return "Octagon<" + this.getSize() + ", " + this.area() + ", " + this.perimeter() + ">";
	}

}
