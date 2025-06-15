package guipackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class GUIApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblName;
	private JLabel lblTitle;
	private JButton btnShowMsg;
	private JButton btnClose;
	private JTextField txtInputName;
	private JLabel lblScore;
	private JTextField txtInputScore;
	private JRadioButton rdBtnUndergrad;
	private JRadioButton rdBtnGrad;
	private final ButtonGroup btnGroup = new ButtonGroup();
	private JCheckBox chkBoxInter;
	private JComboBox cmbFaculty;
	private JComboBox cmbDept;
	private JList listSchools;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIApp frame = new GUIApp();
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
	public GUIApp() {
		drawComponents();
		eventHandling();
	}
	
	private void eventHandling() {
		btnShowMsg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtInputName.getText();
				double score = Double.parseDouble(txtInputScore.getText());
				
				String studStatus = "";
				if(rdBtnUndergrad.isSelected())
					studStatus = "Undergrad";
				else
					if(rdBtnGrad.isSelected())
						studStatus = "grad";
				
				String stat;
				if(chkBoxInter.isSelected())
					stat = "International";
				else
					stat ="Domestic";
				
				String faculty = cmbFaculty.getSelectedItem().toString();
				String dept = cmbDept.getSelectedItem().toString();
				String school = listSchools.getSelectedValue().toString();
				
				Student student = new Student(name,score,studStatus);
				student.setStudStat(stat);
				String grade = student.calculateLetterGrade();
				double fee = student.calculateFee();				
				
				JOptionPane.showMessageDialog(null, name + " got " + grade + 
						" is paying $" + fee + " is taking course with " +
						faculty + " with " + dept + " at " + school);
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	private void drawComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("My First GUI APP");
		setContentPane(contentPane);
		
		lblTitle = new JLabel("Student Form");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblName = new JLabel("Enter student name");
		
		btnShowMsg = new JButton("Show Msg");
		
		
		btnClose = new JButton("Close App");
		
		txtInputName = new JTextField();
		txtInputName.setColumns(10);
		
		lblScore = new JLabel("Enter Score");
		
		txtInputScore = new JTextField();
		txtInputScore.setColumns(10);
		
		rdBtnUndergrad = new JRadioButton("Undergrad ST");
		btnGroup.add(rdBtnUndergrad);
		rdBtnUndergrad.setSelected(true);
		
		rdBtnGrad = new JRadioButton("Grad ST");
		btnGroup.add(rdBtnGrad);
		
		chkBoxInter = new JCheckBox("International");
		chkBoxInter.setSelected(true);
		
		cmbFaculty = new JComboBox();
		cmbFaculty.setModel(new DefaultComboBoxModel(new String[] {"Ivan", "Mehwish", "Rupa", "Priya", "Anu"}));
		
		cmbDept = new JComboBox();
		String[] deptNames = {"CSIS","BUSN","MARK","ACCT","HR"};
		Arrays.sort(deptNames);
		
		for(int i=0;i<deptNames.length;i++)
			cmbDept.addItem(deptNames[i]);
		cmbDept.setSelectedIndex(2);
		
		listSchools = new JList();
		listSchools.setModel(new AbstractListModel() {
			String[] values = new String[] {"Douglas", "SFU", "UBC", "UFV", "UVic"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(181)
							.addComponent(lblTitle))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(25)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(rdBtnUndergrad)
										.addComponent(rdBtnGrad)
										.addComponent(chkBoxInter)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(87)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblScore)
										.addComponent(lblName))))
							.addPreferredGap(ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtInputScore, 172, 172, 172)
										.addComponent(txtInputName, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGap(55)
									.addComponent(cmbFaculty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cmbDept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(32)))))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(listSchools, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(157)
					.addComponent(btnShowMsg)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnClose)
					.addContainerGap(182, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTitle)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(txtInputName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblScore)
						.addComponent(txtInputScore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdBtnUndergrad)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdBtnGrad)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chkBoxInter))
						.addComponent(listSchools, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(cmbDept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cmbFaculty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnShowMsg)
						.addComponent(btnClose))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}











