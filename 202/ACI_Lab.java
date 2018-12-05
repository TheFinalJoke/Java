/*Purpose:  to learn about Interfaces
 *
 *input:  none - hard coded into the program
 *
 *outout:  to the screen
 *
 *Sample run:
 *		Coloring the Circle object!
		Color purple inside the circle!
		Coloring the Rectangle object!
		Color purple inside the rectangle!

		Coloring the GeoObjects!
		Color purple inside the circle!
		Color purple inside the rectangle!

		The two objects have the same area? false
		GeometricObject Circle
		The area is 78.53981633974483
		The perimeter is 31.41592653589793

		GeometricObject Rectangle
		The area is 15.0
		The perimeter is 16.0
 *
 */
 import java.util.*;
 import java.io.*;

public class ACI_Lab {
  /** Main method */
  public static void main(String[] args) {

    // Declare and initialize 1 Circle object and 1 Rectangle object

		Circle C = new Circle(3);
		Rectangle R = new Rectangle(3, 4);
    // Colorable interface method howToColor
    System.out.println("Coloring the objects!");
	String st = "purple";

	System.out.println();

    GeometricObject2 geoCir= new Circle(5);
    GeometricObject2 geoRect = new Rectangle(5, 3);

    // Colorable interface method howToColor
    System.out.println("Coloring the GeoObjects!");
		if(geoCir instanceof Colorable)
		((Colorable)geoCir).howToColor(st);

    System.out.println();

    System.out.println("The two objects have the same area? " +
    equalArea(geoCir, geoRect));

    // Display circle
    System.out.println("GeometricObject Circle");
    displayGeometricObject2(geoCir);

    System.out.println();

    // Display rectangle
    System.out.println("GeometricObject Rectangle");
    displayGeometricObject2(geoRect);


  }// end main

  /** A method for comparing the areas of two geometric objects */
  public static boolean equalArea(GeometricObject2 object1, GeometricObject2 object2) {
    return object1.getArea() == object2.getArea();
  }

  /** A method for displaying a geometric object */
  public static void displayGeometricObject2(GeometricObject2 object) {
    System.out.println("The area is " + object.getArea());
    System.out.println("The perimeter is " + object.getPerimeter());
  }
}// end ACI_Lab

