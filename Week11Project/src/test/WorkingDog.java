package test;

public class WorkingDog extends Dog implements Worker{
	private int trainingHours;
	
	public int getTrainingHours() {
		return trainingHours;
	}

	public void setTrainingHours(int trainingHours) {
		this.trainingHours = trainingHours;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("The organization ID is " 
		+ ORG_ID + 
		"The training hours are " + trainingHours);
		speak();
	}

	@Override
	public void interfaceAbstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("this is another abstract method");
	}
	
}
