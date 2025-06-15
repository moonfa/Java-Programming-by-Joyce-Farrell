package Ch10Ex7;

import java.time.Year;
import java.util.Scanner;

public class ThrowUsedCarException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		UsedCar[] cars = new UsedCar[7];
		UsedCar car = null;
		int vin;
		String make;
		int yearInt;
		Year year;
		float mile;
		double price;
		
		for(int i=0; i<cars.length;i++) {
			try {
				System.out.println("Enter usedcar "+i);
				System.out.print("Enter VIN: ");
				vin = input.nextInt();
				car.setVIN(vin);
				
				System.out.print("Enter maker: ");
				make = input.nextLine();
				car.setMake(make);
				
				System.out.print("Enter year: ");
				yearInt = input.nextInt();
				year = Year.of(yearInt);
				car.setYear(year);
				
				System.out.print("Enter mile: ");
				mile = input.nextFloat();
				car.setMileage(mile);
				
				System.out.print("Enter price: ");
				price = input.nextDouble();
				car.setPrice(price);
				
			}catch(UsedCarException e) {
				System.out.println(e.getMessage());

			}catch(Exception ex) {
				System.out.println("an exception");
			}
			System.out.println(car);
			cars[i]=car;
		}
		for(UsedCar c: cars) {
			System.out.println(car);

		}
	}

}
