package usingClass;

public class Student {
	
	private String studentName;
	private double stuID;
	
	
	
	public Student(String studentName, double stuID) {
		this.studentName = studentName;
		this.stuID = stuID;
	}
	public Student(String studentName) {
		this.studentName = studentName;
	}
	public Student(double stuID) {
		this.stuID = stuID;
	}
	public Student() {
		this.studentName = "Tim";
		this.stuID = 999;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStuID() {
		return stuID;
	}
	public void setStuID(double stuID) {
		this.stuID = stuID;
	}
	
	
	
	

}
