package com.dnpass.training.java.day3.inheritance;

public class Account {

		
		private int accountNumber;
		private double accountBalance;
		private static int LastAssignedNumber= 0;

		public Account(int accountNumber,double accountBalance) {
			this.accountNumber = accountNumber;
			this.accountBalance = accountBalance;
		}

		public Account() {
			LastAssignedNumber++;
			accountNumber = LastAssignedNumber;
		}

		public Account(double accountBalance) {
			LastAssignedNumber++; 
			accountNumber = LastAssignedNumber;
			this.accountBalance = accountBalance;
		}

		public void showdata() { 
			System.out.println("Account Number" + accountNumber);
			System.out.println("Account Balance" + accountBalance);
		}
		public void deposit(double a) {
			System.out.println("account deposit called");
			if(a<0) {
				
			}else
				accountBalance = accountBalance + a;
		}
		public void withdraw(double a) {
			if(accountBalance < a) {
		}else
			accountBalance = accountBalance - a;

		}
		public void transfer(double amount,Account other) {
			withdraw(amount);
			other.deposit(amount);
			other = new Account(10,amount);
		}

		public int getAccountNumber() {
			return accountNumber;
			
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public double getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}



		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp=Double.doubleToLongBits(accountBalance);
			result = prime * result + (int) (temp^ (temp>>> 32));
			result = prime * result + accountNumber;
			return result;
		}



		@Override
		public boolean equals(Object obj) {
			if (this ==obj) {
				return true;
			}
			if(obj==null) {
				return false;
			}
			Account other = (Account) obj;
			if (Double.doubleToLongBits(accountBalance) !=Double.doubleToLongBits(other.accountBalance)) {
				return false;
			}
			if (accountNumber !=other.accountNumber ) {
				return false;
			}
			return true;
		}


		@Override
		public String toString() {
			return "Account [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + "]";
			
			
		}

	}

