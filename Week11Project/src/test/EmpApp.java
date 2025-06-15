package test;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(4545,"Sam");
		//emp.setEmpId(4545);
		//emp.setEmpName("Sam");
		//System.out.println(emp.getEmpId()+ " " + emp.getEmpName());
		emp.display();
		Employee.aStaticMethod();
		
		SalariedEmployee sEmp = new SalariedEmployee();
		SalariedEmployee.aStaticMethod();
		sEmp.setEmpId(5555);
		sEmp.setEmpName("David");
		sEmp.setSalary(6767676);
//		System.out.println(sEmp.getEmpId() + " " + sEmp.getEmpName() 
//		+" " + sEmp.getSalary());
		sEmp.display();
		if(sEmp instanceof Employee)
			System.out.println("sEmp is of SalariedEmployee type");
		
		SalariedEmployee sEmp1 = new SalariedEmployee(2222,"Sarah",56567);
		sEmp1.empName = "Emily";
		sEmp1.display();
		
		
	}

}
