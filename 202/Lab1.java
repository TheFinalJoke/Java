// Nick Shorter
import java.util.*;
import java.io.*;


	public class Lab1 {
		public static void main(String[] args) throws IOException {
			String [] ary = new String[3];
			File infile = new File("lab1.txt");
			File outF = new File("lab1Out.txt");

			try (
				Scanner in = new Scanner(infile);
				PrintWriter outPW = new PrintWriter(outF);
		){//read and assign values
			for(int i=0; i<ary.length; i++){
				ary[i] = in.next();
		}//write values to file using the print writer
		for(int i=0; i <ary.length; i++){
			// system.out.print(ary[i]+ "");
			 outPW.print(ary[i] + " ");
		}

		}// end try
		}// end main
	}// end class
