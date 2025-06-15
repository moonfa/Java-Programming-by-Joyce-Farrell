package test;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtSalary;
	private JTextField txtAddress;
	private JButton btnInsert;
	private JButton btnExit;
	private JButton btnLoad;
	private int id;
	private String name;
	private double salary;
	private double comm;
	private String address;
	
	String database = "EmployeeDB.accdb";
	String url = "jdbc:ucanaccess://" + database;
	Connection conn =null;
	Statement stat = null;
	ResultSet resultSet = null;
	private JTextArea txtLoad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		drawComponent();
		eventHandling();
	}
	
	private void eventHandling() {						
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = Integer.parseInt(txtId.getText());
				name = txtName.getText();
				salary = Double.parseDouble(txtSalary.getText());
				address = txtAddress.getText();
				System.out.println("id "+ id + " " + name + " " 
						+ address + " " + salary);
				insertData(id,name,salary,address);
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadData();
			}
		});
	}
	
	private void loadData() {
		txtLoad.setText("");
		//load the driver
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}			
		try {
			conn = DriverManager.getConnection(url);
			stat = conn.createStatement();			
			
			String query = "SELECT * from Employee";
			resultSet = stat.executeQuery(query);
			
			while(resultSet.next()) {
				id = resultSet.getInt(1);				
				name = resultSet.getString(2);				
				address = resultSet.getString(3);				
				salary = resultSet.getDouble(4);
				String record = id + " " + name + " "+ address + " " + salary;
				txtLoad.append(record+"\n");
				System.out.println(record);
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
	
	private void insertData(int id,String name,double salary,String address) {
		Connection conn =null;
		Statement stat = null;
		//ResultSet resultSet = null;
		String database = "EmployeeDB.accdb";
		String url = "jdbc:ucanaccess://" + database;
		
		//load the driver
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}	
		
		try {
			conn = DriverManager.getConnection(url);
			stat = conn.createStatement();			
			String insert = id+",'"+name+"','"+address+"',"+salary;
			String insertQuery = "INSERT INTO Employee "
					+ "(id,EName,Address,salary) values ("+insert+")";
			
			System.out.println("insert: "+insert);
			System.out.println("insertQuery: "+insertQuery);
			stat.executeUpdate(insertQuery);
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			if(conn != null) {
				try {
					stat.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}		
		}	
	}
	
	private void drawComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbId = new JLabel("Emp ID");
		lbId.setBounds(5, 10, 45, 16);
		contentPane.add(lbId);
		
		txtId = new JTextField();
		txtId.setBounds(55, 5, 130, 26);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lbName = new JLabel("Name");
		lbName.setBounds(199, 10, 36, 16);
		contentPane.add(lbName);
		
		txtName = new JTextField();
		txtName.setBounds(252, 5, 130, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lbSalary = new JLabel("Salary");
		lbSalary.setBounds(387, 10, 37, 16);
		contentPane.add(lbSalary);
		
		txtSalary = new JTextField();
		txtSalary.setBounds(199, 69, 130, 26);
		contentPane.add(txtSalary);
		txtSalary.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(199, 94, 130, 26);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		btnInsert = new JButton("Insert");
		btnInsert.setBounds(21, 146, 80, 29);
		contentPane.add(btnInsert);
		
		txtLoad = new JTextArea();
		txtLoad.setBounds(299, 74, 1, 16);
		contentPane.add(txtLoad);
		
		JLabel lbAddress = new JLabel("Address");
		lbAddress.setBounds(140, 99, 51, 16);
		contentPane.add(lbAddress);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(140, 146, 75, 29);
		contentPane.add(btnExit);
		
		btnLoad = new JButton("Load");
		btnLoad.setBounds(252, 146, 75, 29);
		contentPane.add(btnLoad);
	}
	
	

}
