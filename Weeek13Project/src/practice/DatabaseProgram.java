package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stat = null;
		ResultSet resultSet = null;
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}catch(ClassNotFoundException cnfex) {
			System.out.println("Problem in loading or " +"registering MS Access JDBC driver");
			cnfex.printStackTrace();
		}
		try {
			String database = "EmployeeDB.accdb";
			String url = "jdbc:ucanaccess://" +database;
			conn= DriverManager.getConnection(url);
			stat = conn.createStatement();
			
			Scanner input =new Scanner(System.in);
			System.out.println("Enter Emp neme: ");
			String eName =input.nextLine();
			
//			String updateQ="UPDATE Employee set salary = 138000 "
//					+" where EName = 'Sam'";
			
			String inserQuery = "INSERT INTO Employee (EName,Address,Salary) " +
					 "VALUES " + "('SIMON LI','New Wst',90000)";
			
			/*String inserQuery = "INSERT INTO Employee "+
						"(EName,Address,salary) values"
						+"('Emily','Maple Ridge',69000)";*/
			stat.executeUpdate(inserQuery);
			
			String query ="SELECT * from Employee";
			//String query ="SELECT id,salary from Employee";

			resultSet= stat.executeQuery(query);
			int id;
			String name, address;
			double salary;
			while(resultSet.next()) {
				id = resultSet.getInt(1);
				name =resultSet.getString(2);
				address = resultSet.getString(3);
				salary = resultSet.getDouble(4);
				System.out.println(id+" "+name+" "+address+" "+salary);

				//System.out.println(id+" "+salary);
			}
			
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			if(conn!=null) {
				try {
					resultSet.close();
					stat.close();
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
				
			}
		}

	}

}
