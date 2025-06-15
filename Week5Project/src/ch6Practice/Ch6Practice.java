package ch6Practice;

import java.util.Scanner;

public class Ch6Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i=10000;i>0;i--);
		//for(int i=0;i>10000;i++);
		
		for(int r=0;r<4;r++) {
			for(int c=0;c<5;c++) {
				System.out.print("r"+r+ "" + "c"+c + " ");
			}
			System.out.println();
		}
		
		for(int cnt = 1, a = 5 ; cnt<10 && a <10;cnt++,a++) {
			System.out.println(cnt);
		}
		int cnt = 10;
		System.out.println(cnt);
		
		int v = 56;
		System.out.println(v++);
		System.out.println(++v);
		//++v;
		
		//data validation loop
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value less than 100");
		int value = input.nextInt();
		while(value > 100 || value < 0) {
			System.out.println("The value is invalid");
			System.out.println("Enter a valid value");
			value = input.nextInt();
		}
		System.out.println("The valid value is " + value);
		//Event controlled loop
		final double INT_RATE = 0.04;
		
		System.out.println("Enter current balance");
		double balance = input.nextDouble();
		System.out.println("Would you like to see next year balance "
				+ "enter 1 for yes or any other number for no");
		int response = input.nextInt();
		while(response == 1) {
			balance = balance + (balance * INT_RATE);
			System.out.println("New balance would be " + balance);
			System.out.println("Would you like to see next year balance "
					+ "enter 1 for yes or any other number for no");
			response = input.nextInt();
		}
		//do while loop
		System.out.println("Enter current balance for do while");
		balance = input.nextDouble();
		do {
			balance = balance + (balance * INT_RATE);
			System.out.println("New balance would be " + balance);
			System.out.println("Would you like to see next year balance "
					+ "enter 1 for yes or any other number for no");
			response = input.nextInt();
		}
		while(response == 1); 
		
		System.out.println("after loop execution");
		//example counted loop
		int iVal = 4;
		int eVal = 9;
		int num = 5;
		while(iVal <= eVal) {
			System.out.println(num + " + " + iVal + " = " + (num + iVal));
			iVal++;
		}
		
	}

}
