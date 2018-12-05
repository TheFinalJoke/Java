/* nick shorter
 *
 */

 import java.util.*;
 import java.io.*;

 	public class IllegalTriangleException extends Exception {
 	private double side1, side2, side3;

 		public IllegalTriangleException(double side1, double side2, double side3, String s){

 			super(s);
 			this.side1 = side1;
 			this.side2 = side2;
 			this.side3 = side3;
 		}
 		public double getSide1(){
 			return side1;
 		}// side 1
 		public double getSide2() {
 			return side2;
 		}// side 2
 		public double getSide3() {
 			return side3;
 		}// side three
 	}//end class