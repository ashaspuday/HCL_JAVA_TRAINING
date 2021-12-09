package com.dnpass.training.transaction;
import java.util.*;

public class TransactionService {
	static List<Transaction> transactionsDatabase = new ArrayList<Transaction>();
	static {
		transactionsDatabase = DataLoader.newTransactions();

	}

	public void create(Transaction tran) {

		transactionsDatabase.add(tran);
	}

	public void delete(Transaction tran) {
		transactionsDatabase.remove(tran);
	}

	public boolean find(Transaction tran) {

		return transactionsDatabase.contains(tran);
	}

	public boolean update(Transaction tran) {
		int flag = 0;
		for (Transaction s : transactionsDatabase) {

			if ((int) s.getId() == (int) tran.getId()) {
				System.out.print("Update id :" + tran.getId() + s.getId());
				s.setType(tran.getType());
				s.setAmount(tran.getAmount());
				s.setCity(tran.getCity());
				s.setCurrency(tran.getCurrency());
				flag = 1;

			}
		}
		if (flag == 1)
			return true;
		else
			return false;
	}

	public void ShowTransactions() {
		for (Transaction e : transactionsDatabase) {
			System.out.println(e.id + " " + e.type + " " + e.amount + " " + e.city + " " + e.currency);
		}
	}

	public boolean removeDuplicate() {
		Set<Transaction> set = new HashSet<Transaction>(transactionsDatabase);
		transactionsDatabase.clear();
		transactionsDatabase.addAll(set);
		return true;
	}

	public boolean swapTransactions(Integer initial, Integer Final) {
		Collections.swap(transactionsDatabase, initial, Final);
		return true;
	}

	public boolean findById(Integer id) {
		for (Transaction s : transactionsDatabase) {
			if ((int) s.getId() == (int) id) {
				System.out.println(s.id + " " + s.type + " " + s.amount + " " + s.city + " " + s.currency);
			}
		}
		return false;
	}

	public boolean newTransaction(Integer initial, Integer Final) {
		List<Transaction> newTransactiondb = new ArrayList<Transaction>();
		newTransactiondb.addAll(transactionsDatabase.subList(initial, Final + 1));
		for (Transaction e : newTransactiondb) {
			System.out.println(e.id + " " + e.type + " " + e.amount + " " + e.city + " " + e.currency);
		}
		return true;
	}

	public boolean replaceProductType(ProductType prod, ProductType prod1) {
		for (Transaction s : transactionsDatabase) {
			if ((ProductType) s.getType() == prod) {
				System.out.println("found");
				s.setType(prod1);
			}
		}
		return true;
	}

	public boolean DeleteByCity(String city) {
		transactionsDatabase.removeIf(s -> city == s.getCity());
		return false;
	}


	public boolean binarySearch(Transaction tran) {
		Collections.sort(transactionsDatabase);
		System.out.println(Collections.binarySearch(transactionsDatabase, tran));
		return true;
	}
	

	public boolean sortByAmount() {
		Collections.sort(transactionsDatabase, new AmountComparator());
		return true;
	}

	public boolean sortByCity() {
		Collections.sort(transactionsDatabase, new CityComparator());
		return true;
	}

	public List<Transaction> findByProductType(ProductType prod) {
		for (Transaction s : transactionsDatabase) {
			if ((ProductType) s.getType() == prod) {
				System.out
						.print("Update id :" + s.id + " " + s.type + " " + s.amount + " " + s.city + " " + s.currency);

			} else
				return null;
		}

		return null;
	}

	public List<Transaction> findByIdAndProductType(Integer id, ProductType prod, String city) {
		for (Transaction s : transactionsDatabase) {
			if (s.getType() == prod && (int) s.getId() == (int) id) {
				System.out
						.print("Update id :" + s.id + " " + s.type + " " + s.amount + " " + s.city + " " + s.currency);
			}
		}
		return null;
	}

}