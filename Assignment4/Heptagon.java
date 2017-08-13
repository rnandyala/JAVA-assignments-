// Author: R Pragnesh Reddy Nandyala
// Assignment 4
// April 13, 2016

package pa4;
// The purpose of this class is to calculate area perimeter by overriding polygon class
public class Heptagon extends Polygon {
//The purpose of this constructor is to check side equal to zero and less than zero and throw an exception  
	public Heptagon(double s) throws ZeroSizeForPolygonException {
		super(s);
		if(this.getSize() <= 0) {
			throw new ZeroSizeForPolygonException("Size is negative to zero");
		}
	}
// calculate are of the heptagon
	@Override
	public double area() {
		double areaOfHeptagon = (7 * this.getSize() * this.getSize())  /4* Math.tan(Math.PI / 7);
		return areaOfHeptagon;
	}
// calculate perimeter of the heptagon
	@Override
	public double perimeter() {
		double perimeterOfHeptagon = 7 * this.getSize();
		return perimeterOfHeptagon;
	}
// concatenates into string
	@Override
	public String toString() {
		return "size,area and perimeter of a Heptagon is <" + this.getSize() + ", " + this.area() + ", " + this.perimeter() + ">" ;
	}

}
