/* nick Shorter
 *
 */


 	import java.util.*;
 	import java.io.*;

 		public class TestBank {
 			public static void main(String[] args){
 				SavingsAccount sav = new SavingsAccount(1122, 2000, 4.5, 6.4, 5000.00, 10000.00);
 				System.out.println(sav);
 				CheckingAccount che = new CheckingAccount(1271, 150, 1.25, 0, 300, 500);
 				System.out.println(che);
 			}// main
 		}// class