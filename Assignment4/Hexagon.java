// Author: R Pragnesh Reddy Nandyala
// Assignment 4
// April 13, 2016

package pa4;
// The class Hexagon overrides the abstract methods 
public class Hexagon extends Polygon {
// The purpose of this constructor is to override and throw an error  
	public Hexagon(double s) throws ZeroSizeForPolygonException {

		super(s);
		if (this.getSize() <= 0) {
			throw new ZeroSizeForPolygonException("Side is less than or equal to zero");
		}
	}
// The purpose of this method is calculate area 
	@Override
	public double area() {

		double areaOfHexagon = 3 * Math.sqrt(3) * this.getSize() * this.getSize() * (0.5);
		return areaOfHexagon;
	}
// The purpose of this method is to calculate perimeter
	@Override
	public double perimeter() {

		double perimeterOfHexagon = 6 * this.getSize();
		return perimeterOfHexagon;
	}
// The purpose of this method is concatenate the details 
	@Override
	public String toString() {

		return "size,area and perimeterOfHexagon<" + this.getSize() + ", " + this.area() + ", " + this.perimeter()
				+ ">";
	}
}
