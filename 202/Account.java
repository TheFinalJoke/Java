/* nick shorter
 *
 */


import java.util.*;
import java.io.*;

	public abstract class Account {
		private java.util.Date dateCreated;

	protected Account(){
		dateCreated = new java.util.Date();
	}// created a default account

	public java.util.Date getDateCreated(){
		return dateCreated;
	}


	public String toString(){
		return "This account is created on " + dateCreated;
	}
	public abstract double getUpdatingInterest();

	public abstract double getWithdraw();

	public abstract double getDeposit();

}// end abstract

