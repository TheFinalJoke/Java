/* Nick Shorter 1/26/2017 java version 8 update 111
 *Purpose: To calculate the how many hours he or she has worked, calculate the gross pay, and calculate the net pay
 *the source I will be using is twoDdata.txt
 *output source twoDpayroll.txt
 *
 *Sample Run:
 *	Employee 	 Pay Rate 	 Hours 	 Gross Pay 	 Net Pay
		0 		 7.50 		 17 	 127.50 	 114.75
		1 		 7.50 		 19 	 142.50 	 128.25
		2 		 7.50 		 20 	 150.00 	 135.00
		3 		 7.50 		 19 	 142.50 	 128.25
 *
 */
 import java.util.*;
 import java.io.*;

 public class Payroll{
 		public static void main(String[] args) throws IOException  {

 		double RATE = 7.5;
 		File infile = new File("twoDdata.txt");
 		Scanner fin = new Scanner(infile);

		File outF = new File("twoDpayroll.txt");

			//Scanner in = new Scanner(infile);
		PrintWriter outPW = new PrintWriter(outF);
		int noe = fin.nextInt();
		int [][] matrix = new int[noe][7];
		for(int row = 0; row< matrix.length; row++) {
			for(int column =0; column<matrix[row].length; column++){
				matrix[row][column] = fin.nextInt();

			}// end for 1 - row
			}// end for 2 - columns
		fin.close();
		outPW.printf("Employee \t Pay Rate \t Hours \t Gross Pay \t Net Pay");
		outPW.println();
		for(int row = 0; row <matrix.length; row++){
			int total = 0;
		for (int column = 0; column < matrix[row].length; column++) {

			total+= matrix[row][column];
		}// end for - end row totaling the columns
			double gross = total * RATE;
			double tax = gross *.1;
			double net = gross - tax;
			outPW.printf("%d \t\t %4.2f \t\t %d \t %6.2f \t %6.2f " , row, RATE, total, gross, net);
			outPW.println();
			}// end 2nd for - ends processing the rows 1 by 1
		outPW.close();
 		}// end main
 }// end class