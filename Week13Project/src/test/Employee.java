package test;

public class Employee {
	private int id;
	private String name;
	private String address;
	private double salary;
	
	public Employee(int id,String n,String ad,double s) {
		this.id =id;
		name = n;
		address = ad;
		salary = s;
	}
	
	public double addCommToSal() {
		return salary + 5000;
	}

}
