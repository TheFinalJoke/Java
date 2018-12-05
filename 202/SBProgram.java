/* Nick Shorter 02/7/2017
 *purpose: Reads in words one by one
 */
import java.io.*;
import java.util.*;

	public class SBProgram {
		public static void main (String[] args) throws IOException {
			File infile1 = new File("sbOne.txt");
			Scanner fin = new Scanner(infile1);

			File infile2 = new File("sbTwo.txt");
			Scanner din = new Scanner(infile2);

			File outF = new File("sbOut.txt");

			PrintWriter outPW = new PrintWriter(outF);

			String st1, st2;
			StringBuilder sb;
				outPW.println("Part one: ");
				for(int i = 0; i < 10; i++){
					sb= new StringBuilder(fin.next());
					st2 = din.next();
					sb.append(st2);
					outPW.print(sb + " ");
					sb=null;
				}
				outPW.println();
			outPW.println("part 2");
			for(int i= 0; i < 5; i++){
				sb= new StringBuilder(fin.next());
				st2 = din.next();
				sb.insert(1, st2);
				outPW.print(sb + " ");
				sb= null;
			}
			outPW.println();
			outPW.print("3rd Part ");
				for(int i=0; i<5; i++){
					sb= new StringBuilder(fin.next());
					st2 = din.next();
					sb.replace(1, sb.length(),st2);
					outPW.print(sb + " ");
					sb = null;
				}
				outPW.println();
			outPW.print("4th Part ");
				for(int i=0; i<5; i++){
					st1=fin.next();
					sb = new StringBuilder(st1);
					sb.reverse();
					outPW.print(sb + " ");
					sb = null;
				}
				fin.close();
				din.close();
				outPW.close();
		}// end main
	}// end class