package test;

public class Dog extends Animal{
	private String breed;
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("woof.....");
	}

	@Override
	public void anAbstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("an abstract method of dog class");
	}
	
	@Override
	public String toString() {
		return breed;
	}
	
	

}
