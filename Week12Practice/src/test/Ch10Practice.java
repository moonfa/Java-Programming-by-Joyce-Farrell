package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch10Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner input= new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			try {
				System.out.println("Enter an element");
				arr[i] = input.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Wrong input");
			}
			input.nextLine();

			
			
		}

		
		int numertar, denominator,result = 0;
		try {
			System.out.println("Enter numerator");
			numertar = input.nextInt();
			System.out.println("Enter demoninator");
			denominator = input.nextInt();
			result = numertar/denominator;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch(Exception ex) {
			System.out.println("an exceptione");
		} finally {
			System.out.println("result: "+result);
		}
		
		System.out.println("rest of the code");
		

	}

}
