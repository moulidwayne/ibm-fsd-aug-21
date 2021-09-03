package shipping.reports;

import java.util.UUID;

import shipping.domain.Company;
import shipping.domain.TransmissionType;
import shipping.domain.Truck;

public class FuelNeedsReport {
	
	private Company company;

	public FuelNeedsReport() {
		company=new Company();
	}

	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public void getReport()
	{
		
		company.setCompanyID(UUID.randomUUID().toString());
		company.setCompanyName("OLA");
		
		Truck vehicle1=new Truck();
		vehicle1.setEnginationPowerInHP(5);
		vehicle1.setFuelCapacity(120);
		vehicle1.setLoadCapacityInTon(17);
		vehicle1.setMaking("TATA");
		vehicle1.setNumberOfWheels(16);
		vehicle1.setRegistrationNumber("R-1");
		vehicle1.setTransmissionType(TransmissionType.MANUAL);
		company.setVehicle(vehicle1);
		double result= vehicle1.calculateFuelEfficiency(140, 80);
		System.out.println("Dsplaying Report for Truck.....");
		System.out.println("Engination Power: "+company.getVehicle().getEnginationPowerInHP());
		System.out.println("Fuel Capacity: "+company.getVehicle().getFuelCapacity());
		System.out.println("Load Capacity: "+vehicle1.getLoadCapacityInTon());
		System.out.println("Make: "+vehicle1.getMaking());
		System.out.println("Number Of Wheels: "+vehicle1.getNumberOfWheels());
		System.out.println("Vehicle Registration Number: "+vehicle1.getRegistrationNumber());
		System.out.println("Fuel Efficiency: "+result);
		
	}

}
