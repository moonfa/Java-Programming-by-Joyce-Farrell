package apackage;

public class Book {
	private int id;
	private String name;
	private String[] versions;
	
	public Book(int id,String n) {
		this.id = id;
		name = n;
		versions = new String[] {"v1","v2"};
	}
	
	public String getVersion(int i) {
		return versions[i];
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}
	
	
	
}
