package youDoIt;

public class TestDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogTriathlonParticipant dog1 = new DogTriathlonParticipant("Browser", 2, 85, 89, 0);
		dog1.display();
		
		DogTriathlonParticipant dog2 = new DogTriathlonParticipant("Rush", 3, 78, 72, 80);
		dog2.display();
		
		DogTriathlonParticipant dog3 = new DogTriathlonParticipant("Ginger", 3, 90, 86, 72);
		dog3.display();
		
		DogTriathlonParticipant dog4 = new DogTriathlonParticipant("Sam", 0, 0, 0, 0);
		dog4.display();

	}

}
