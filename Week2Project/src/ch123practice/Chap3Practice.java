package ch123practice;

import javax.swing.JOptionPane;

public class Chap3Practice {
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		add();
		final double INTERST_RATE = 7.5; //declare constants
		String fValStr =  JOptionPane.showInputDialog(null,
				"Enter first value");
		double fVal = Double.parseDouble(fValStr);
		
		String sValStr =  JOptionPane.showInputDialog(null,
				"Enter second value");
		double sVal = Double.parseDouble(sValStr);
		double res = add(fVal,sVal);
		add(45,45);
		res= add(56.6,34);
		JOptionPane.showMessageDialog(null, "The sum is " + res);
			
	}
	/**
	 * 
	 * @param fVal
	 * @param sVal
	 */
	public static double add(double fVal,double sVal) {
		
		double result = fVal + sVal;
		//System.out.println("the sum is " + result);
		//JOptionPane.showMessageDialog(null, "The sum is " + result);
		return result;
	}
	
	public static double add(int fVal,int sVal) {
		
		double result = fVal + sVal;
		//System.out.println("the sum is " + result);
		//JOptionPane.showMessageDialog(null, "The sum is " + result);
		return result;
	}
	
	/**
	 * this is add method to add two values
	 */
	public static void add() {
		String fValStr =  JOptionPane.showInputDialog(null,
				"Enter first value");
		double fVal = Double.parseDouble(fValStr);
		
		String sValStr =  JOptionPane.showInputDialog(null,
				"Enter second value");
		double sVal = Double.parseDouble(sValStr);
		
		double result = fVal + sVal;
		//System.out.println("the sum is " + result);
		JOptionPane.showMessageDialog(null, "The sum is " + result);
	}
}




