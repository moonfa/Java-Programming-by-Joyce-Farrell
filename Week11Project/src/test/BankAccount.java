package test;

public class BankAccount {
	private int accId;
	private double balance;
	
	public BankAccount(int id,double b) {
		accId = id;
		balance = b;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result;
		BankAccount secObj = (BankAccount)obj;
		if(accId == secObj.accId && balance==secObj.balance)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return accId + " " + balance;
	}
}
