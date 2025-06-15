package practice;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	private static int empCount = 0;
	private final static String ORG_ID = "DR7878"; 
	
	public Employee(int id,String name, double s) {
		empId = id;
		this.name = name;
		salary = s;	
		empCount++;
	}
	
	public Employee() { // default constructor
		this(111,"abc",0.0); // calling a parameterized const
		/*empId = 111;
		name = "abc";
		salary = 0.0;*/		
	}
	
	public Employee(int id,String name) {
		this(id,name,0.0);
		/*empId = id;
		this.name = name;
		salary = 0.0;*/	
	}
	
	public void setEmpId(int id) {
		empId = id;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calculateGross() {
		double commission = 5000;
		return salary + commission;
	}
	
	//static method
	public static void aStaticMethod() {
		System.out.println("This is from a static method");
	}
	
	@Override
	public String toString() {
		String str = "ID: " + empId + " Name: " + name +
				" Gross pay: $" + calculateGross() + " number of employees are "
						+ empCount + " organiz ID: " + ORG_ID;
		return str;
	}
	
	
}




