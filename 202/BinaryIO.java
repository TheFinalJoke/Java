/* nick shorter
 *
 */

 	import java.util.*;
 	import java.io.*;


 		public class BinaryIO {
 			public static void main(String[] args)
 				throws ClassNotFoundException, IOException {
 			 File infile1 = new File("inA.txt");
 			 Scanner fin1 = new Scanner(infile1);
			try (
			FileOutputStream output = new FileOutputStream("outInA.bin");
				){

 			int[] aryA = new int[6];
 			for(int i=0; i<aryA.length; i++){

 				aryA[i] = fin1.nextInt();
 				System.out.print(aryA[i]);
 				output.writeInt(aryA[i]);
 			} // end for
 			String stA = fin1.next();
 			//output.writeUTF(stA);
 			double numA = fin1.nextDouble();
 			System.out.println(stA);
 			//output.writeDouble(numA);
			fin1.close();

			}// end try



 		/*	////////////////////////////////////
 			 File infile2 = new File("inB.txt");
 			 Scanner fin2 = new Scanner(infile2);
 			 try (
				FileOutputStream output = new FileOutputStream("outInB.bin");
				){

 			int[] aryB = new int[6];
 			for(int i=0; i<aryB.length; i++){
 				aryA[i] = fin2.nextInt();
 				System.out.println(aryB[i]);
 				output.writeInt(aryB[i]);
 			} // end for
 			String stB = fin1.next();
 			output.writeUTF(stB);
 			double numB = fin2.nextDouble();
 			output.writeDouble(numB);

 			}
 			fin2.close();

				*/


 			}// end main
 		}// end class