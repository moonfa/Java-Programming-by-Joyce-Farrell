package cH123practice;

import javax.swing.JOptionPane;

public class Ch3pr {
	/**
	 * main method
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double INTERST_RATE = 7.5; //declare constant
		
		//add();
		String fValStr = JOptionPane.showInputDialog(null, "Enter first value");
		double fVal = Double.parseDouble(fValStr);
		
		String sValStr = JOptionPane.showInputDialog(null, "Enter second value");
		double sVal = Double.parseDouble(sValStr);
		
		double res = add(fVal, sVal);
		JOptionPane.showMessageDialog(null, "The sum is " + res);
	
		
		add(44,66);
		add(44.5, 77);
		
		

	}
	/**
	 * @return 
	 * 
	 */
	public static double add(int fVal, int sVal) {
		double result = fVal + sVal;
		//System.out.println("the sum is " + result);
		JOptionPane.showMessageDialog(null,"The sum is " + result);
		return result;
	}
	/**
	 * @return 
	 * 
	 */
	public static double add(double fVal, double sVal) {
		double result = fVal + sVal;
		//System.out.println("the sum is " + result);
		JOptionPane.showMessageDialog(null,"The sum is " + result);
		return result;
	}
	/**
	 * this is add method to add two values
	 */
	public static void add() {
		String fValStr = JOptionPane.showInputDialog(null, "Enter first value");
		double fVal = Double.parseDouble(fValStr);
		
		String sValStr = JOptionPane.showInputDialog(null, "Enter second value");
		double sVal = Double.parseDouble(sValStr);
		
		double result = fVal + sVal;
		//System.out.println("the sum is " + result);
		JOptionPane.showMessageDialog(null,"The sum is " + result);
	}

}
