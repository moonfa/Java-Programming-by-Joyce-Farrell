//This program is written by Mehwish Bashir
package ch123practice;

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
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user input for console applications
		//GUI input
		System.out.println(79.0/2);
		
		String grade = JOptionPane.showInputDialog(null,"Enter your grade");
		
		String marks = JOptionPane.showInputDialog(null,"Enter your marks");
		int intMarks = Integer.parseInt(marks); //convert string to int 
		double dMarks = Double.parseDouble(marks);
		
		JOptionPane.showMessageDialog(null, "The grade is " + grade + 
				" and marks are " + intMarks);
		
		int response = JOptionPane.showConfirmDialog(null, 
				"Would you like to go on World tour?","A question",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(response == 0)
			System.out.println("You choose yes");
		
		Scanner keyb = new Scanner(System.in);
		
		System.out.println("Enter your salary");
		double salary = keyb.nextDouble();
		keyb.nextLine(); //is to get rid of enter key from the buffer
		
		System.out.println("Enter your name");
		String name = keyb.nextLine();
		System.out.println("Welcome " + name);
				
		System.out.println(name  + " salary is " + salary);
		
		keyb.close();
		
		System.out.println("Week 2 practice");
		byte bVal = 23;
		int iVal = (int)4656.67;
		Integer v = 67;
		double dVal =6787;
		
		
		Double d = 45.45;
		long lVal = 4565765767877L;
		System.out.println("lVal is " + lVal);
		boolean isChecked = true;
		boolean isBigger = (7 > 2);
		char ch = '$';
		char ch1 = 45;
		System.out.println("The char is "  + ch1);
		int val = '%';
		System.out.println("The val is " + val);
		
		float fVar = 45.45F;
		String nam = new String("DC");
		String n = "Douglas College";
		System.out.println("My school is \n" + n + 
				" which is in BC \n"
				+ "in Canada");
		String s = """
					My school is DC 
					is in
					Bc
					is in 
					Canada.
				""";
		System.out.println(s);
	}

}






