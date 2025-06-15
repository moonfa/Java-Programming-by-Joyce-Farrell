package test;

public class Student {
	private String name;
	private int id;
	
	public Student(String n,int id) {
		name = n;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}
}
