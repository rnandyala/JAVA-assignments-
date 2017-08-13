// Author: R Pragnesh Reddy Nandyala 
// Assignment 4
// April 13, 2016

package pa4;

public class Pentagon extends Polygon {

	public Pentagon(double s) throws ZeroSizeForPolygonException {

		super(s);
		if (this.getSize() <= 0)
			throw new ZeroSizeForPolygonException("Size is less than or equal to zero");
	}

	@Override
	public double area() {

		double areaOfPentagon = Math.sqrt((25 + 10 * Math.sqrt(5))) * this.getSize() * this.getSize() * (0.25);
		return areaOfPentagon;
	}

	@Override
	public double perimeter() {

		double perimeterOfPentagon = 5 * this.getSize();
		return perimeterOfPentagon;
	}

	@Override
	public String toString() {

		return "size,area and perimeter Of Pentagon<" + this.getSize() + ", " + this.area() + ", " + this.perimeter()
				+ ">";
	}
}
