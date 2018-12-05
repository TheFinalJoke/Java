/* nick shorter 1/24/2017
 *creating a program to read from a file and then read contents of and print in a colomn
 *java version 8 update 111
 * 2D Program - Calculate the payroll for lumberjack workforce
 */
 import java.util.*;
 import java.io.*;
 	public class L2{
 		public static void main(String[] args) throws IOException  {
 		File infile = new File("l2.txt");
 		Scanner fin = new Scanner(infile);

		String [][] matrix = new String[11][4];
		for(int row = 0; row< matrix.length; row++) {
			for(int column =0; column<matrix[row].length; column++){
				matrix[row][column] = fin.next();

			}// end for 1
			}// end for 2
			for(int row=0; row < matrix.length; row++) {
				System.out.println(matrix[row][2]);
			}// end for
					 	}// end main

 	}// end class