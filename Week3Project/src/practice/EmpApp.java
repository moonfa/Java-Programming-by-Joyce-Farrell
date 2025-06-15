package practice;

import java.time.LocalDate;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(5, 6));
		LocalDate today = LocalDate.now();
		System.out.println("today is " + today);
		
		LocalDate birthday = LocalDate.of(2000, 11, 11);
		System.out.println(birthday);
		
		double dVal = 67676.66666;
		String str = String.format("The dval is $%.2f",dVal);
		System.out.println(str);
		String st = "DC";
		int iVal = 777;
		System.out.println(String.format("My school is %s "
				+ "and ID is %d", st,iVal));
		
		Employee.aStaticMethod();
		Employee emp1 = new Employee();
		System.out.println(emp1.getEmpId());
		emp1.setEmpId(5555);
		emp1.setName("David");
		System.out.println(emp1.getEmpId());
		System.out.println(emp1);
		System.out.println("Gross pay " + emp1.calculateGross());
		Employee emp2 = new Employee(6666,"Emily");
		//System.out.println(emp2);
		displayEmpInfo(emp2);
		
		Employee emp3 = new Employee(777,"Tim",978787.77777);
		//System.out.println(emp3);
		displayEmpInfo(emp3);
		
		Employee emp4 = creatEmpObject();
		displayEmpInfo(emp4);
		//emp1.aStaticMethod();
	}
	
	public static Employee creatEmpObject() {
		int id = 6767;
		String name = "Yun";
		double sal = 89898.89;
		Employee emp = new Employee(id,name,sal);
		return emp;
	}
	
	public static void displayEmpInfo(Employee emp) {
		System.out.println("Employee Info is this:");
		System.out.println(emp);
	}

}






