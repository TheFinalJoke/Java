/**
 *
 */


public class Triangle extends GeometricObject {

  private double side1, side2, side3;

  /** Constructor */
  public Triangle(double side1, double side2, double side3, boolean filled, String color) throws IllegalTriangleException {
	if (side1 + side2 >= side3 && side1 + side3 >= side2 && side2 + side3 >= side1) {
		setFilled(filled);
		setColor(color);
    	this.side1 = side1;
    	this.side2 = side2;
    	this.side3 = side3;
	}
	else {
		throw new IllegalTriangleException(side1, side2, side3, "With these sides you can not create a triangle.");
	}
  }// end constructor

  /** Implement the abstract method findArea in GeometricObject */
  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  /** Implement the abstract method findCircumference in
   * GeometricObject
   **/
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public String toString() {
    // Implement it to return the three sides
    return super.toString() + "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }
}// end Triangle
