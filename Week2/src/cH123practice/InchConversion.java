package cH123practice;

import javax.swing.JOptionPane;

public class InchConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inchValStr = JOptionPane.showInputDialog(null, "Enter inches value");
		double inchVal = Double.parseDouble(inchValStr);
		
		
		
		double feetVal = InchToFeet(inchVal);
		double yardVal = FeetToYard(feetVal);


	}
	/**
	 * method1 for conver inch to feet
	 */
	public static double InchToFeet(double inchVal) {
		double result = inchVal/12.0;
		JOptionPane.showMessageDialog(null,"The inches of " + inchVal +" is the feet of "+ result);
		return result;
	}
	
	
	/**
	 * method1 for conver inch to yard
	 */
	public static double FeetToYard(double feetVal) {
		double result = feetVal/3.0;
		JOptionPane.showMessageDialog(null,"The feet of " + feetVal +" is the yard of "+ result);
		return result;
	}
}
