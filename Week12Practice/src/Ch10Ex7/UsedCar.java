package Ch10Ex7;

import java.time.Year;

public class UsedCar {
	private int VIN;
	private String make;
	private Year year;
	private float mileage;
	private double price;
	
	
	public int getVIN() {
		return VIN;
	}


	public void setVIN(int vIN) throws UsedCarException {
		if(vIN>999 &&vIN<10000){
			VIN = vIN;
			
		}else {
			throw new UsedCarException();
		}
		
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) throws UsedCarException {
		if(make.equalsIgnoreCase("FORD") ||
				make.equalsIgnoreCase("HONDA") ||make.equalsIgnoreCase("TOYOTA")||
				make.equalsIgnoreCase("CHRYSLER")||make.equalsIgnoreCase("OTHER")){
			
			this.make = make;
			
		}else {
			throw new UsedCarException();
		}
		this.make = make;
	}


	public Year getYear() {
		return year;
	}


	public void setYear(Year year) {
		this.year = year;
	}


	public float getMileage() {
		return mileage;
	}


	public void setMileage(float mileage) {
		this.mileage = mileage;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public UsedCar(int vIN, String make, Year year, float mileage, double price) throws UsedCarException {
		super();
		if((vIN>999 &&vIN<10000) && (make.equalsIgnoreCase("FORD") ||
				make.equalsIgnoreCase("HONDA") ||make.equalsIgnoreCase("TOYOTA")||
				make.equalsIgnoreCase("CHRYSLER")||make.equalsIgnoreCase("OTHER"))){
			VIN = vIN;
			this.make = make;
			this.year = year;
			this.mileage = mileage;
			this.price = price;
		}else {
			throw new UsedCarException();
		}
		
	}
	
	@Override
	public String toString() {
		return VIN +" "+make +" "+year+" "+mileage+" "+price;
	}
	

}
