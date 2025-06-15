package test;

public class Employee {
	private int empId;
	protected String empName;
	
	/*public Employee() {
		System.out.println("Parent class constructor");
		empId = 111;
		empName = "abc";
	}*/
	
	public Employee(int id,String n) {
		empId = id;
		empName = n;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public final void aFinalMethod() {
		System.out.println("a final method");
	}
	
	public static void aStaticMethod() {
		System.out.println("parent class static method");
		System.out.println("Organization name is ABC Traders");
	}
	
	public void display() {
		System.out.println(empId + " " + empName);
	}
	
	
	

}
