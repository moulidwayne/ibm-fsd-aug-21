package shipping;

import shipping.reports.FuelNeedsReport;

public class ShippingMain {

	public static void main(String[] args) {

		FuelNeedsReport report = new FuelNeedsReport();
		report.getReport();
	}

}
