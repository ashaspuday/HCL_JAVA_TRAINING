package com.dnpass.training.transaction;
import java.util.*;
import com.dnpass.training.java.streams.Person;

public class DataLoader {
	
	public static List<Transaction> newTransactions() {
		List<Transaction> Transaction = new ArrayList<Transaction>();
		Transaction.add(new Transaction(123,ProductType.FUEL,33.33,"LONDON","GBP"));
		Transaction.add(new Transaction(124,ProductType.ELECTRIC,100.0,"BANGALORE","INR"));
		Transaction.add(new Transaction(125,ProductType.GROCERIES,50.5,"CHENNAI","INR"));
		return Transaction;
	}
	
	
	public static List<Person> newPersons() {
		return Arrays.asList(new  Person("ted", "neward", 42), new Person("charlotte", "neward", 39),
				new Person("michal", "neward", 19), new Person("mathew", "newton", 13), new Person("naal", "ford", 45),
				new Person("candy", "ford", 39), new Person("jeff", "brown", 43), new Person("betsy", "brown", 39));
	}



}