package test;

public class SalariedEmployee extends Employee{
	private double salary;
	
	public SalariedEmployee() {
		super(111,"abc");
		System.out.println("child class const");
		salary = 0;
	}
	
	public SalariedEmployee(int id,String n,double sal) {
		super(id,n);
		System.out.println("child class const");
		salary = sal;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void aStaticMethod() { //not overriding the parent class method
		Employee.aStaticMethod();
		System.out.println("Child class static method");
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("salary " + salary);
	}
		
}
