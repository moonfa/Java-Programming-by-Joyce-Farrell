package test;

public abstract class Animal {
	private String name;
	
	public abstract void speak();
	public abstract void anAbstractMethod();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
