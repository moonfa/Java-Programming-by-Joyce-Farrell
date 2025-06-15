/**quiz1-e, written by Menghua
 * 
 */
package quiz1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class PropertyApp {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws PropertyValueException 
	 */
	public static void main(String[] args) throws IOException, PropertyValueException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String address;
		double price;
		double priceValidate = 0;
		
		int num = 3;
		House[] houses=new House[num];
		
		FileWriter fw= new FileWriter("House.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		
		//Input and validate objects
 		for(int i=0; i<num;i++) {
			House house = null;
			System.out.print("Enter house "+(i+1)+" address: ");
			address = input.nextLine();
			
			while(true) {
				try {
					System.out.print("Enter house "+(i+1)+" price: ");
					price = input.nextDouble();
					if(price>0) {
						priceValidate = price;
						
						break;
					}else {
						throw new PropertyValueException();
					}
				}catch(InputMismatchException ex) {
					System.out.println("Input invalid, only positive digit");
				}
				catch(PropertyValueException e){
					System.out.println("invalid input, price should be positive.");
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}finally {
					input.nextLine();
				}
				
			}
			house = new House(address,priceValidate);
			house.display();
			houses[i]=house;
			pw.println(house.toString());			
			
			System.out.println("House information is saved in the text file\n");
		}
 		System.out.println("Display all records: ");
 		//pw.flush();
 		pw.close();
 		readFile();
 		input.close();

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
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}	
		
	}

}
