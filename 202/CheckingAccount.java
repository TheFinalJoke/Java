

	import java.util.*;
	import java.io.*;

			public class CheckingAccount extends Account {
			private double upInterestRate;
			private double withdraw;
			private double deposit;
			private double balance;
			private double idNumber;
			private double interestRate;

			public CheckingAccount() {
			}

			public CheckingAccount(double idNumber, double balance, double interestRate, double upInterestRate, double withdraw,
			double deposit){
				setIdNumber(idNumber);
				setBalance(balance);
				setInterestRate(interestRate);
				/*this.upInterestRate(upInterestRate);
				this.withdraw(withdraw);
				this.deposit(deposit);
				*/
			}
			public double getIdNumber(){
				return idNumber;
				}
				public void setIdNumber(double idNumber){
					this.idNumber = idNumber;
				}

				public double getBalance(){
					return balance;
				}
				public void setBalance(double balance){
					this.balance = balance;
				}
				public double getinterestRate(){
					return interestRate;
				}
				public void setInterestRate(double interestRate){
					this.interestRate = interestRate;
				}
			@Override
			public double getUpdatingInterest(){
				return upInterestRate * balance;
			}
			public void setUpDatingInterest(double upInterestRate){
				this.upInterestRate = upInterestRate;
			}
			@Override
			public double getWithdraw(){
				return balance - withdraw;
			}
			public void setWithdraw(double withdraw){
				this.withdraw = withdraw;
			}
			@Override
			public double getDeposit(){
				return deposit + balance;
			}
			public void setDeposit(double deposit){
				this.deposit = deposit;
			}

			@Override
			public String toString(){
				return super.toString() + " the ID number is " + idNumber + " with the balence is " + balance +
			" with the interest rate is " + interestRate;
			}
		}