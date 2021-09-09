package org.example.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.example.model.Employee;

public class EmployeeDao {
	
	public List<Employee> getEmployeesFromFile() throws IOException
	{
		String str[]=new String[3];
		List<Employee> list=new ArrayList<Employee>();
		FileReader reader=new FileReader("employees.txt");
		BufferedReader bufferedReader=new BufferedReader(reader);
		
		String line=bufferedReader.readLine();
		while(line!=null)
		{
		
			str=line.split(",");
			Employee employee=new Employee();
			employee.setEmployeeId(new Random().nextInt(1000));
			employee.setFirstName(str[0]);
			employee.setLastNAme(str[1]);
			employee.setEmail(str[2]);
			list.add(employee);
			line=bufferedReader.readLine();
			
		
		}
		return list;
	}

}
