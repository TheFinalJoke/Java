/* Nick Shorter
 *java verion 8 update 73
 *
 * purpose:  to practice recursion
 *
 * input:  from the user
 * output:  to the screen
 *
 * sample run:
 *		Enter a string: SFA
		SFA
		SAF
		FSA
		FAS
		ASF
		AFS
 */


import java.util.*;
import java.io.*;

public class PermutationLab {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("This program finds the permutations of Strings.");
    System.out.print("Please enter a string: ");
    String s = input.next();
    displayPermutation(s);
  }

  // recursion method
  public static void displayPermutation(String s) {
    displayPermutation("", s);
  }

  // recursion method helper
  public static void displayPermutation(String s1, String s2) {
    //type code here

    if (s2.length() >0){
    	for(int i=0; i<s2.length(); i++){
    		displayPermutation(s1 + s2.charAt(i), s2.substring(0,i) + s2.substring(i+1));
    	}
    }
    	else
   			System.out.println(s1);

  }

}// end PermutationLab