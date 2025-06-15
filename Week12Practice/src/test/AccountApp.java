package test;

public class AccountApp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int acc = 4545;
		CustomAccount cAcc;
		double balance = 6000;
		try {
			cAcc = new CustomAccount(acc, balance);

		}catch(LowBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("balance is "+ balance);

	}

}
