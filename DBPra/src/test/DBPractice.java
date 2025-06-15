package test;

import java.sql.*;
import java.util.Scanner;

public class DBPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn =null;
		Statement stat = null;
		ResultSet resultSet = null;
		//load the driver
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		//establishing the connection
		try {
			String database = "EmployeeDB.accdb";
			String url = "jdbc:ucanaccess://" + database;
			conn = DriverManager.getConnection(url);
			stat = conn.createStatement();
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter emp name: ");
			String eName = input.nextLine();
			
			String insertQuery = "INSERT INTO Employee "
					+ "(EName,Address,salary) values "
					+ "('"+eName+"','Maple Ridge',81000)";
			stat.executeUpdate(insertQuery);
			
			String updateQ = "UPDATE Employee set salary = 120000 "
					+ " where EName = 'Sam'";
			stat.executeUpdate(updateQ);
			
			String deleteQ = "DELETE From Employee where EName = 'Emily1'";
			stat.executeUpdate(deleteQ);
			
			String query = "SELECT * from Employee";
			//String query = "SELECT id,salary from Employee";
			resultSet = stat.executeQuery(query);
			int id;
			String name,address;
			double salary;
			while(resultSet.next()) {
				id = resultSet.getInt(1);				
				name = resultSet.getString(2);				
				address = resultSet.getString(3);				
				salary = resultSet.getDouble(4);
				
				System.out.println(id + " " + name + " " 
						+ address + " " + salary);
				//System.out.println(id + " "  + salary);
				//Employee emp = new Employee(id,name,address,salary);
				//System.out.println(emp.addCommToSal());
			}
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			if(conn != null) {
				try {
					resultSet.close();
					stat.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}		
		}		
	}
}
