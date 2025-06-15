package usingData;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int price;
		price = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		name = input.nextLine();
		System.out.println("Enter price");
		price = input.nextInt();
		
		System.out.println();
		System.out.println("Your name is: " + name + " the price is: " + price);
		
		System.out.printf("Your name is: %s, and the price is %s", name, price);
		input.close();

	}
	
	

}
