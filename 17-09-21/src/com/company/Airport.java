package com.company;

public class Airport {
public static void main(String[] args) {
Airport metropolisAirport = new Airport();
Helicoptor copter = new Helicoptor("H-1",200,4);
System.out.println(copter.getDetails());
SeaPlane sPlane = new SeaPlane("S-1",230,2);
System.out.println(sPlane.getDetails());
metropolisAirport.givePermissionToLand(copter);

metropolisAirport.givePermissionToLand(sPlane);

}
private void givePermissionToLand(Flyer f) {
f.land();
}
}