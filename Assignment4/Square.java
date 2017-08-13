// Author: R Pragnesh Reddy Nandyala
// Assignment 4
// April 13, 2016

package pa4;
// The purpose of this class is to calculate area and perimeter of a square
public class Square extends Polygon {
// The purpose of this method is check whether the size is less than zero or not
	public Square(double s) throws ZeroSizeForPolygonException {

		super(s);
		if (this.getSize() <= 0) {
			throw new ZeroSizeForPolygonException("Size is less or equals to zero");
		}
	}
// The purpose of this method is to override abrstact method in  polygon and calcuate are of a square 
	@Override
	public double area() {

		double areaSquare = this.getSize() * this.getSize();
		return areaSquare;
	}
// The purpose of this method is to calculate perimeter of a square
	@Override
	public double perimeter() {

		double perimeterOfSquare = 4 * this.getSize();
		return perimeterOfSquare;
	}
// The purpose of this method is to concat all the above value into a String.  
	@Override
	public String toString() {

		return "size,area,perimeter of a Square<" + this.getSize() + ", " + this.area() + ", " + this.perimeter() + ">";
	}

}
