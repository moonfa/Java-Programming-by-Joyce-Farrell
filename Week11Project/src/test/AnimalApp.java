package test;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount(3456,6700);
		BankAccount ba2 = new BankAccount(7777,87000);
		
		if(ba1.equals(ba2))
			System.out.println("same account");
		else
			System.out.println("different account");
		
		WorkingDog wd = new WorkingDog();
		wd.setTrainingHours(20);
		wd.setName("BB");
		wd.setBreed("ABC");
		wd.work();
		
		Animal animal;
		animal = new Dog();
		animal.setName("Tonny");
		animal.speak();
		
		animal = new Cat();
		animal.setName("Oreo");
		animal.speak();
		
		Animal[] animalArray = new Animal[4];
		animalArray[0] = new Dog();
		animalArray[1] = new Cat();
		animalArray[2] = new Cat();
		animalArray[3] = new Dog();
		for(int i=0;i<animalArray.length;i++) {
			animalArray[i].speak();
			animalArray[i].anAbstractMethod();
		}
		
		
		//Animal animal = new Animal();
		/*Dog d = new Dog();
		d.setName("Tonny");
		d.setBreed("ABC");
		d.speak();
		
		Cat c = new Cat();
		c.setName("Kitkat");
		c.setColor("Brown");
		c.speak();*/
	}

}
