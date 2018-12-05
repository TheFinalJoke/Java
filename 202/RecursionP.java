/*nick shorter
 *
 */


import java.util.*;
import java.io.*;

		public class RecursionP {
			public static void main(String[] args){
				int out;
					System.out.println("Computing r");
					out =R.r(1);
					System.out.println("For n=1, r(n)= " + out);
					System.out.println();
					out = R.r(2);
					System.out.println("for n= 2, r(n) = " + out);
					System.out.println();
					out = R.r(-55);
					System.out.println("For n = -55, r(n) " + out);
					System.out.println();
					out= R.r(24);
					System.out.println("for n = 24, r(n) " + out);
					System.out.println();
					out= R.r(10);
					System.out.println("for n = 10, r(n) " + out);
					System.out.println();
			}
		}