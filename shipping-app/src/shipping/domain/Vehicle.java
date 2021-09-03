package shipping.domain;

public class Vehicle implements VehicleInterface {
	
	private String registrationNumber;
	private String making;
	private int fuelCapacity;
	private TransmissionType transmissionType;
	private int enginationPowerInHP;

	public Vehicle() {
		super();
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getMaking() {
		return making;
	}

	public void setMaking(String making) {
		this.making = making;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public TransmissionType getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(TransmissionType transmissionType) {
		this.transmissionType = transmissionType;
	}

	public int getEnginationPowerInHP() {
		return enginationPowerInHP;
	}

	public void setEnginationPowerInHP(int enginationPowerInHP) {
		this.enginationPowerInHP = enginationPowerInHP;
	}

	@Override
	public double calculateFuelEfficiency(double distanceCoveredInMiles, double fuelConsumedInLtr) {
		
		return distanceCoveredInMiles/fuelConsumedInLtr;
	}

}
