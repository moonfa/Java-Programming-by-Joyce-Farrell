package test;

public class Cat extends Animal{
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Meaoooo");
	}

	@Override
	public void anAbstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is cat abstract method");
	}
	
	
}
