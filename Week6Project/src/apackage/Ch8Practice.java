package apackage;

import java.util.Scanner;

public class Ch8Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] scores = new int[10];
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter score or enter 999 to quit");
		int score = input.nextInt();
		while(score != 999 && count < scores.length) {
			scores[count++] = score;
			System.out.println("Enter score or enter 999 to quit");
			score = input.nextInt();
		}
		System.out.println("count is " + count);
		System.out.println("Scores entered");
		int su=0;
		for(int i=0;i<count;i++) {
			su= su + scores[i];
			System.out.print(scores[i] + " ");
		}
		System.out.println("Sum is " + su);
		
		int size = 6;
		int[] intArr = new int[size];
		intArr[0] = 15;
		intArr[5] = 56;
		System.out.println(intArr[1]);
		
		double[] dArr = {4.5,3.4,12,7,9.5};
		for(int i=0;i<dArr.length;i++) {
			dArr[i] += 5;
			//System.out.print(dArr[i]+ " ");
		}
		//System.out.println();
		//finding average
		int sum =0;
		for(int i=0;i<dArr.length;i++) {
			sum += dArr[i];
			
		}
		System.out.println("The average is " + (sum/dArr.length));
		//finding the max value in the array
		double value = dArr[0];
		for(int i=0;i<dArr.length;i++) {
			if(value < dArr[i])
				value = dArr[i];
		}
		System.out.println("Max value " + value);
		
		for(double val : dArr) {
			val += 1;
			//System.out.print(val+ " ");
		}
		
		
		//enhanced for loop
		for(double val : dArr)
			System.out.print(val+ " ");
		System.out.println();*/
		int[] values = {78,12,123,400,56};
		findMax(values);
		System.out.println(values[4]);
		
	}
	
	public static void findMax(int[] arr) {
		//finding the max value in the array
				int value = arr[0];
				for(int i=0;i<arr.length;i++) {
					if(value < arr[i])
						value = arr[i];
				}
				System.out.println("Max value " + value);
				arr[4] = 1000;
				
	}

}







