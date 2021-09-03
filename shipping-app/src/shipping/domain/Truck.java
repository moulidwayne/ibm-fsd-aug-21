package shipping.domain;

public class Truck extends Vehicle{
	
	private int numberOfWheels;
	private int loadCapacityInTon;
	public Truck() {
		super();
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public int getLoadCapacityInTon() {
		return loadCapacityInTon;
	}
	public void setLoadCapacityInTon(int loadCapacityInTon) {
		this.loadCapacityInTon = loadCapacityInTon;
	}
	
	

}
