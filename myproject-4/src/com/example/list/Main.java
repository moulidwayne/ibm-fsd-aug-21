package com.example.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;
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
		
		Stack<Integer> collection=new Stack<Integer>();
		collection.push(1);
		collection.push(2);
		collection.push(3);
		System.out.println(collection.size());
		for(int ii=1;ii<=3;ii++)
		{
			System.out.println(collection.pop());
		}
	
		Map<String, Employee> map=new HashMap<String, Employee>();
		map.put("A", new Employee(1, "a", "b", "a@b.com"));
		map.put("B", new Employee(2, "c", "d", "c@d.com"));
		map.put(UUID.randomUUID().toString(), new Employee(3, "e", "f", "e@f.com"));
		System.out.println(map);
		Set<String> s=map.keySet();
		System.out.println(s);
		Collection<Entry<String, Employee>> c=map.entrySet();
		System.out.println(c);
		Collection<Employee> c1= map.values();
		System.out.println(c1);
	}

}
