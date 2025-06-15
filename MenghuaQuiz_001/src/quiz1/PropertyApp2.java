package quiz1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PropertyApp2 {

	public static void main(String[] args) throws IOException, PropertyValueException{
		// TODO Auto-generated method stub
		try {
			Scanner input = new Scanner(System.in);
			FileWriter fw= new FileWriter("House.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			
			final int NUM_HOUSES =3;
			House[] houses=new House[NUM_HOUSES];
			
			//input and validate
			for(int i=0; i<NUM_HOUSES;i++) {
				//House house = null;
				while(true) {
					try {
						System.out.print("Enter house "+(i+1)+" address: ");
						String address = input.nextLine();
						System.out.print("Enter house "+(i+1)+" price: ");
						double price = input.nextDouble();
						
						House house= new House(address,price);
						houses[i]= house;
						pw.println(house.display());
						System.out.println("House information is saved in the text file\n");
						input.nextLine();
						break;
					}catch(InputMismatchException ex) {
						System.out.println("Input invalid");
					}catch(PropertyValueException e){
						System.out.println("invalid input, price should be positive.");
					}catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
					input.nextLine();
				}								
			}
			pw.close();
			fw.close();
		}catch(IOException x) {
			System.out.println("File error");
		}
		
		System.out.println("Display all records: ");	
		readFile();
	}
	//read record and display
	public static void readFile() throws FileNotFoundException {
		try {
			File file =new File("House.txt");
			Scanner inputFile = new Scanner(file);
			while(inputFile.hasNext()) {
				String str = inputFile.nextLine();
				System.out.println(str);
			}
			inputFile.close();
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}	
	
	}	
}
				
			
			
