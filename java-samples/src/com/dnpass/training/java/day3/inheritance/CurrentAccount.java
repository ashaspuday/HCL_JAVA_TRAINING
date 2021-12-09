package com.dnpass.training.java.day3.inheritance;

public class CurrentAccount extends Account{
	
		private static final int FREE_TRANSACTIONS=3;
		private static final double TRANSACTION_FEE =2.0;
		
		private double transactionCount;
		public CurrentAccount(int accountNumber,double initialBalance)
		{
			
			super(accountNumber,initialBalance);
			transactionCount=0;

		}
		
		
		public void deposit(double amount) {
			System.out.println("current account deposit called");
			transactionCount++;
			super.deposit(amount);
		}



		public void withdraw(double amount) {
			// TODO Auto-generated method stub
			transactionCount++;
			super.withdraw(amount);
		}

		
		public void deductFees() {
			// TODO Auto-generated method stub
			if(transactionCount > FREE_TRANSACTIONS) {
				double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
			
			super.withdraw(fees);
			}
			transactionCount =0;
		}
	}

