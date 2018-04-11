import java.util.*;

enum transactionType {
	withdraw, deposit, cancel
};

class ATM {
	int totalCash;
	Map<Integer,Integer> bills = null;
	
	boolean verifyUser(Person p) {
		return true;
	}
	
	void insertDebitCard(Person p) {
		if(verifyUser(p)) {
			giveMenuOptions(p);
		} else {
			cancelTransaction(p);
		}
	}
	
	void giveMenuOptions(Person p) {
		Transaction t = receiveOptions();
		if(t.t == transactionType.withdraw) {
			if(!p.withdraw(t.cash)) {
				p.cancel();
			}
		} else if(t.t == transactionType.deposit) {
			p.deposit(t.cash);
		}
	}
	
	void cancelTransaction(Person p) {
		p.cancel();
	}
	
	Transaction receiveOptions() {
		Transaction t = new Transaction(transactionType.withdraw,100);
		return t;
	}
}

class Transaction {
	Date date;
	transactionType t;
	int cash;
	
	public Transaction(transactionType t,int cash) {
		this.date = new Date();
		this.t = t;
		this.cash = cash;
	}
}

class Person {
	int id;
	int accountBalance;
	List<Transaction> history;
	
	boolean withdraw(int cash) {
		if(accountBalance >= cash) {
			this.accountBalance -= cash;
			history.add(new Transaction(transactionType.withdraw,cash));
			return true;
		} else {
			return false;
		}
	}
	
	boolean deposit(int cash) {
		this.accountBalance += cash;
		history.add(new Transaction(transactionType.deposit,cash));
		return true;
	}
	
	void cancel() {
		history.add(new Transaction(transactionType.cancel,0));
	}

}


