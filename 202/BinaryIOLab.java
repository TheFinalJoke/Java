/* nick shorter
 *
 */
 import java.util.*;
 import java.io.*;

 	public class BinaryIOLab {
 		public static void main(String[] args) throws IOException {
 			try (
 				RandomAccessFile input = new RandomAccessFile("bioLab.txt", "rw");
 				){


 					input.writeUTF("Nick Shorter");

 					input.seek(3);
 					input.writeUTF("name");

 					input.seek(0);


					System.out.println(input.readLine());

					input.seek(input.length());
					input.writeUTF("the End");

					input.seek(0);
					System.out.println("the whole thing " + input.readLine());



 				}// end try
 		}// end main
 	}// end class