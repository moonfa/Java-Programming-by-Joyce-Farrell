/**quiz1-d, written by Menghua
 * 
 */
package quiz1;

/**
 * 
 */
public class House extends Property{
	
	private double insuranceCost;
	
	public House(String address, double price) throws PropertyValueException {
		super(address, price);
		calculateInsurance(price);
	}

	@Override
	public void calculateInsurance(double price) {
		insuranceCost = price*0.025;
	}

	@Override
	public String display() {
		
		return super.display()+" Calculated insurance: "+String.format("$%,.2f",insuranceCost);
	}
	

}
