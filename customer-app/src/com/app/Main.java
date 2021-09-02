package com.app;

import java.util.Scanner;

import com.example.CustomerService;
import com.model.Customer;

public class Main {

	public static void main(String args[]) {
		CustomerService service=new CustomerService();
		Scanner scanner = new Scanner(System.in);
		Customer[] customers = new Customer[10];
		int choice = 0;

		do {
			System.out.println("1. Create customer.");
			System.out.println("2. Display all customer. ");
			System.out.println("0. Exit. ");
			System.out.print("enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Customer customer=service.createCustomer();
				customers[customer.getCustomerId()-1]=customer;
				System.out.println("customer created and added to array.");
				break;
			case 2:
				String countryCode=null;
				for(int i=0;i<customers.length;i++)
				{
					switch (customers[i].getAddress().getCountry()) {
					case "India":
						countryCode="+91";
						break;
					case "USA":
						countryCode="+1";
					
					default:
						System.out.println("Invalid choice.");
						break;
					}
					System.out.println("Customer Name: "+customers[i].getCustomerName()+"country code: "+countryCode
							+"mobile number: "+countryCode+customers[i].getAddress().getMobileNumber());
				}

			default:
				System.out.println("invalid choice.");
				break;
			}

		} while (choice!=0);
	}

}
