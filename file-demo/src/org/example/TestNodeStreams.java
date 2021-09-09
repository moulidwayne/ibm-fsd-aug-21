package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.example.factory.EmployeeFactory;
import org.example.factory.EmployeeFactoryImpl;
import org.example.model.Employee;

public class TestNodeStreams {

	public static void main(String args[]) throws IOException {
		FileReader reader=null;
		FileWriter writer=null;
		BufferedReader bufferedReader=null;
		BufferedWriter bufferedWriter=null;
		/*
		 * try { reader = new FileReader("input.txt");
		 * 
		 * writer = new FileWriter("output.txt");
		 * 
		 * char[] buffer = new char[128]; int charsRead; // read the first buffer
		 * charsRead = reader.read(buffer); while (charsRead != -1) { // write buffer to
		 * the output file
		 * 
		 * writer.write(buffer, 0, charsRead); // read the next buffer charsRead =
		 * reader.read(buffer);
		 * 
		 * } } catch (IOException ioe) { ioe.printStackTrace();
		 * 
		 * } finally {
		 * 
		 * reader.close(); writer.close(); }
		 */
		
		/*
		 * try { reader=new FileReader("input.txt"); bufferedReader=new
		 * BufferedReader(reader); writer=new FileWriter("output.txt");
		 * bufferedWriter=new BufferedWriter(writer); String line=null;
		 * line=bufferedReader.readLine(); while(line!=null) {
		 * bufferedWriter.write(line,0,line.length()); bufferedWriter.newLine();
		 * line=bufferedReader.readLine(); }
		 * 
		 * } catch (IOException ioe) { // TODO: handle exception ioe.printStackTrace();
		 * } finally { bufferedReader.close(); bufferedWriter.close(); reader.close();
		 * writer.close(); }
		 */
		EmployeeFactory factory=new EmployeeFactoryImpl();
		
		List<Employee> list=factory.displayAll();
		
		for(Employee e:list)
		{
			System.out.println(e);
		}
		
		
		
	}

}
