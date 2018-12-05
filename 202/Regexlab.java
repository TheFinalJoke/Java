/* Nick Shorter 2/21/2017
 *Purpose: Take the licence plates
 */
 	import java.util.*;
 	import java.io.*;

 		public class Regexlab {

 			public static void main (String[] args) throws IOException {
 				File infile = new File ("regexlab.txt");
 				Scanner fin = new Scanner(infile);


 				while(fin.hasNext()){
 					String St1= fin.nextLine();
 					//St1.matches("[A-Z0-9]{3} [A-Z0-9]{4}");
					if (St1.matches("[A-Z0-9]{3} [A-Z0-9]{4}")){
						System.out.println("it is valild");
					}
					else{
						System.out.println("not vaild");
					}

 			}//
 			fin.close();
 		}
 		}