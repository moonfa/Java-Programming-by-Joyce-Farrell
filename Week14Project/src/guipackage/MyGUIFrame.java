package guipackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class MyGUIFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtScore;
	private JLabel lblName;
	private JLabel lblScore;
	private JRadioButton rdbUndergrad;
	private JRadioButton rdbGrad;
	private JCheckBox chkIntern;
	private JComboBox cmbFaculty;
	private JComboBox cmbDept;
	private JList listSchool;
	private JButton btnShow;
	private JButton btnClose;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnLoad;
	private String save;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGUIFrame frame = new MyGUIFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public MyGUIFrame() throws IOException {
		drawComponent();
		eventHandling();		
	}	
	
	private void eventHandling() {		
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				double score = Double.parseDouble(txtScore.getText());
				String stuStatus = null;
				if(rdbUndergrad.isSelected()) {
					stuStatus = "undergrad";
				}else if(rdbGrad.isSelected()) {
					stuStatus = "grad";
				}
				String stat;
				if(chkIntern.isSelected()) {
					stat = "International";
				}else {
					stat = "Domestic";
				}
				String faculty = cmbFaculty.getSelectedItem().toString();
				String department = cmbDept.getSelectedItem().toString();
				String school = listSchool.getSelectedValue().toString();
				
				Student student = new Student(name, score, stuStatus);
				student.setStudStat(stat);
				String grade = student.calculateLetterGrade();
				double fee = student.calculateFee();
				
				save = name+" "+score+" "+stuStatus+" "+stat+" "+
						faculty+" "+department+" "+school;
				String message = "name: "+name+"\nscore: "+score+"\ngrade: "+grade+
						"\nstatus: "+stuStatus+"\ninternational: "+stat+"\nfee: "+fee+"\nby faulty: "+
						faculty+"\nin Dept: "+department+"\nin school: "+school;
				
				int option = JOptionPane.showConfirmDialog(null, message,"Save data?",JOptionPane.YES_NO_OPTION);
				if(option==JOptionPane.YES_OPTION) {
					try(PrintWriter pw = new PrintWriter(new FileWriter("stuscore.txt"))){
						pw.println(save);
						JOptionPane.showMessageDialog(null, "Data saved");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "Data not saved");
				}				
			}
		});
		
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	private void drawComponent() {
		setTitle("Student Score");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lblName = new JLabel("Enter student name");
		
		JLabel lblStudentForm = new JLabel("Student Form");
		
		lblScore = new JLabel("Enter Score");
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		txtScore = new JTextField();
		txtScore.setColumns(10);
		
		rdbUndergrad = new JRadioButton("Undergrad ST");
		buttonGroup.add(rdbUndergrad);
		
		rdbGrad = new JRadioButton("Grad ST");
		rdbGrad.setSelected(true);
		buttonGroup.add(rdbGrad);
		
		chkIntern = new JCheckBox("International");
		chkIntern.setSelected(true);
		
		cmbFaculty = new JComboBox();
		cmbFaculty.setModel(new DefaultComboBoxModel(new String[] {"Saeed", "Clemente", "Majalili", "Nelson"}));
		
		cmbDept = new JComboBox();
		//cmbDept.setModel(new DefaultComboBoxModel(new String[] {"CSIS", "BUSN", "ART", "MATH"}));
		
		String[] deptNames = {"CSIS","BUSN","MARK","ACCT","HR"};
		Arrays.sort(deptNames);
		
		for(int i=0;i<deptNames.length;i++)
			cmbDept.addItem(deptNames[i]);
		cmbDept.setModel(new DefaultComboBoxModel(new String[] {"HR", "CSIS", "ART", "MEDI"}));
		cmbDept.setSelectedIndex(2);
		
		listSchool = new JList();
		listSchool.setModel(new AbstractListModel() {
			String[] values = new String[] {"SFU", "Douglas", "UBC", "BCIT"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		btnShow = new JButton("Show & Save");		
		
		btnClose = new JButton("Close App");
		
		btnLoad = new JButton("Load");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName)
								.addComponent(lblScore))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtScore)
								.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbUndergrad)
								.addComponent(rdbGrad)
								.addComponent(chkIntern))
							.addGap(44)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(cmbDept, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbFaculty, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
							.addGap(44)
							.addComponent(listSchool, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addComponent(btnShow)
					.addGap(46)
					.addComponent(btnLoad, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
					.addComponent(btnClose)
					.addGap(25))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(174)
					.addComponent(lblStudentForm)
					.addContainerGap(182, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblStudentForm)
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblScore)
						.addComponent(txtScore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbUndergrad)
							.addGap(14)
							.addComponent(rdbGrad)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chkIntern))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(listSchool, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(cmbFaculty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cmbDept, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnClose)
								.addComponent(btnShow)
								.addComponent(btnLoad))))
					.addContainerGap(9, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
