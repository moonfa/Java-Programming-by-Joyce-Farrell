package test;

public class LowBalanceException extends Exception{
	
	public LowBalanceException() {
		super("The balance is lower than the limit");
	}

}       
