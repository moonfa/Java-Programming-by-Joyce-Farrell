//This program is written by Menghua
package cH123practice;

import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 * This is example of javadoc comments in Java
 * This class is to practice ch1 and 2 and 3
 */
public class Ch1And2And3 {

	/**
	 * This is example of javadoc comments
	 * This is main method which is entry point of the program
	 * javadoc comment is to explain each class and each method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user input for console application
		//GUI input
		System.out.println(79.0/2);
		
		String grade = JOptionPane.showInputDialog(null, "Enter your grade");
		JOptionPane.showMessageDialog(null, "The grade is " + grade);
		
		String marks = JOptionPane.showInputDialog(null, "Enter your marks");
		int intMarks = Integer.parseInt(marks); //convert string to int
		double dMarks = Double.parseDouble(marks);
		
		JOptionPane.showMessageDialog(null, "The grade is " + grade +
				" and marks are "+ intMarks);
		
		int response = JOptionPane.showConfirmDialog(null, 
				"Would you like to go on World tour?","A question", 
				JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
		
		if(response == 0)
			System.out.println("You choose yes");
		
		Scanner keyb =new Scanner(System.in);
		System.out.println("Enter your salary: ");
		double salary = keyb.nextDouble();
		keyb.nextLine();//get rid of the enter key from the buffer
		
		System.out.println("Enter your name: ");		
		String name = keyb.nextLine();
		System.out.println("Welcome " + name);
		
		
		System.out.println(name + " salary is " + salary);
		
		keyb.close();
		
		System.out.println("Week 2 practice");
		byte bVal = 23;
		int iVal = 4656;
		int iVal2 =(int)4656.67;
		
		long lVal = 4565765767877L;
		System.out.println("lVal is " + lVal);
		boolean isChecked = true;
		boolean isBigger = (7 > 2);
		char ch = '$';
		char ch1 = 99;
		System.out.println("The char is " + ch1);
		int val = '%';
		System.out.println("The val is " + val);
		double dVal = 6787.56;
		
		float fCar = 45.45F;
		String name2 = new String("DC");
		String n = "Douglas College";
		System.out.println("My school is \n" + n +
				"which is in BC \n"
				+ "in Canada");
		String s = """
				My school is DC
				is in
				Bc
				is in
				Canada
				""";
		System.out.println(s);
		

	}

}
