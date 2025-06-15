package test;

public class RecursionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displayMessage(5);
		System.out.println(sumOf(6));
	}
	
	public static int sumOf(int n) {
		if(n==1)
			return 1;
		else{
			return n + sumOf(n-1);
		}
	}
	
	
	public static void displayMessage(int n) {
		if(n==1) {
			System.out.println(n + " Java ");
			System.out.println("Programing is fun");
		}
			
		else
		{
			System.out.println(n + " Java ");
			System.out.println("Programing is fun");
			displayMessage(n-1); 
		}
	}

}
