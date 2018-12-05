/* nick shorter
 *
 */
 	// write it

 	import java.util.*;
 	import java.io.*;

 		public class TestLoans {

			public static void main(String[] args) throws IOException{

        	Scanner fin = new Scanner(new File("loansIn.txt"));

        PrintWriter outPW = new PrintWriter("loansOut.txt");

        while(fin.hasNextLine()){
            String string1 = fin.nextLine();
            String[] split = string1.split(" ");
            double num1 = Double.parseDouble(split[0]);
            int num2 = Integer.parseInt(split[1]);
            double num3 = Double.parseDouble(split[2]);
            outPW.print("Creating Loan: ");
            outPW.println(num1 + " Annual Precentage Rate, " + "for " + num2 + " years " + " with a loan amount of " + num3);
        try{
          Loan loan = new Loan(num1,num2,num3);
          outPW.println("You Created a Loan");

        }

        catch (IllegalArgumentException ex){
            outPW.println(ex);

        }
        }
        fin.close();
        outPW.close();

			}// end main
 		}// end class