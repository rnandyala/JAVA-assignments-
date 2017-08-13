// Author: R Pragnesh Reddy Nandyala
// Assignment 4
// April 13, 2016

package pa4;
// The purpose of this class is to override methods in polygon class  
public class Triangle extends Polygon{
// The purpose of this constructor is to check given size is less or equal to zero 
	public Triangle(double s) throws ZeroSizeForPolygonException {
		
		super(s);
		if(this.getSize() <= 0) {
			throw new ZeroSizeForPolygonException("Size is less than or equal to zero");
		}
	}
//The purpose of this constructor is to calculate the are of triangle
	@Override
	public double area() {
		
		double areaOfTriangle = Math.sqrt(3) * this.getSize() * this.getSize() * (0.5) ;
		return areaOfTriangle;
	}
// The purpose of this method is to calculate perimeter of triangle
	@Override
	public double perimeter() {
		
		double perimeterOfTriangle = 3 * this.getSize();
		return perimeterOfTriangle;
	}
// The purpose of this method is to concatenate  all the details into string
	@Override
	public String toString() {
		
		return "size,area and perimeter of Triangle<" + this.getSize() + ", " + this.area() + ", " + this.perimeter() + ">" ;
	}

}
