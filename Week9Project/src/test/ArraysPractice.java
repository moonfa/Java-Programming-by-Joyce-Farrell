package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Month birthMonth;
		birthMonth = Month.FEB;
		System.out.println(birthMonth);
		
		String gradMonth = "JUNE";
		Month gradMon = Month.valueOf(gradMonth);
		System.out.println(gradMon);
		
		for(Month mon : Month.values())
			System.out.print(mon+ " ");
		System.out.println();
		
		int[] intArr = new int[7];
		intArr[0] = 100;
		System.out.println(intArr);
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(100);
		intList.add(67);
		intList.add(78);
		System.out.println(intList);
		intList.add(2,200);
		for(int i=0;i<intList.size();i++)
			System.out.print(intList.get(i)+ " ");
		System.out.println();
		intList.remove(1);
		System.out.println(intList);
		
		
		
		displayArr(intArr);
		Arrays.fill(intArr, 3);
		displayArr(intArr);
		intArr[2] = 10;
		intArr[5] = 20;
		intArr[6] = 34;
		displayArr(intArr);
		Arrays.sort(intArr);
		displayArr(intArr);
		System.out.println("The elem is at index " + 
				Arrays.binarySearch(intArr, 300));
		
		//int[][] twoDimArray = new int[3][4];
		int[][] twoDimArray = {
				{400,500,700,1200},
				{500,600,800,1300},
				{600,750,890,1600}
		};
		
		System.out.println(twoDimArray[1][2]);
		for(int floor=0;floor<twoDimArray.length;floor++) {
			for(int rooms=0;rooms<twoDimArray[floor].length;rooms++) {
				System.out.print("$" + twoDimArray[floor][rooms]+ " ");
			}
			System.out.println();
		}
		
		for(int rooms=0;rooms<twoDimArray[0].length;rooms++) {
			int sum=0;
			for(int floor=0;floor<twoDimArray.length;floor++) {
				sum+= twoDimArray[floor][rooms];
			}
			System.out.println("average is " + (sum/twoDimArray.length));
		}
		
		
	}
	
		public static void displayArr(int[] arr) {
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i] + " ");
			System.out.println();
		}

}










