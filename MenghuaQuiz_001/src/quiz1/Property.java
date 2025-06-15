/**quiz 1-b, written by Menghua Wang
 * 
 */
package quiz1;

/**
 * 
 */
public abstract class Property {
	protected String address;
	protected double price;
	
	public Property(String address, double price) throws PropertyValueException {
		super();
		this.address = address;
		if(price>0) {
			this.price = price;
		}else {
			throw new PropertyValueException();
		}
		
	}
	//abstract method to cal insurance
	public abstract void calculateInsurance(double price);
	
	public String display() {
		return "Address: "+address+" Price: "+String.format("$%,.2f",price);
	}
	

}
