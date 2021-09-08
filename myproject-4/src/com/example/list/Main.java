package com.example.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import com.example.Employee;

public class Main {

	public static void main(String args[]) {
		Collection<Employee> employees = new Vector<Employee>();
		employees.add(new Employee(1, "a", "b", "a@b.com"));
		employees.add(new Employee(12, "b", "c", "b@c.com"));
		employees.add(new Employee(1, "d", "e", "d@e.com"));
		System.out.println(employees);
		Iterator<Employee> i=employees.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
