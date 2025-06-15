package test;

public class CustomAccount {
	private int cAcc;
	private double balance;
	
	public CustomAccount(int acc, double bal) throws LowBalanceException {
		cAcc = acc;
		balance =bal;
		if(balance <5000) {
			throw new LowBalanceException();
		}
	}

}
