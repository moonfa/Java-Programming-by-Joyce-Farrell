package usingMethod;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary = 10000;
		double bonus = 5000;
		
		double monthlyPay = APlusB(salary, bonus);
		
		double productPay = Product(salary, bonus);
		

	}
	
	public static double APlusB(double a, double b)
	{
		return a+b;
	}
	
	public static double Product(double a, double b) {
		return a*b;
		
	}
	
	public static double Square(double s) {
		return Product(s, s);
	}

}
