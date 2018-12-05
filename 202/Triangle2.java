/**
 *
 */


public class Triangle2 extends GeometricObject2 {

  private double side1, side2, side3;

  /** Constructor */
  public Triangle2(double side1, double side2, double side3, boolean filled, String color)  {

    	setFilled(filled);
    	setColor(color);
    	this.side1 = side1;
    	this.side2 = side2;
    	this.side3 = side3;

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
