package org.example.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.example.Course;
import org.example.Teacher;
import org.example.factory.CourseFacoryImpl;
import org.example.factory.CourseFactory;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		CourseFactory factory=new CourseFacoryImpl();
		int choice = -1;
		Course course = null;
		Teacher teacher = null;
		do {
			course = new Course();
			
			System.out.println("1. create a new course.");
			System.out.println("2. Display all available courses.");
			System.out.println("0. Exit");
			System.out.print("your choice??  ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				teacher = new Teacher();
				System.out.print("course name: ");
				course.setCourseName(scanner.next());
				System.out.println("publisher name: ");
				course.setPublisherName(scanner.next());
				System.out.println("fees: ");
				course.setEnrollmentFees(scanner.nextDouble());
				List<Teacher> s=new ArrayList<Teacher>();
				System.out.println("Teacher's first name");
				teacher.setFirstName(scanner.next());
				System.out.println("Teacher's last name");
				teacher.setLastName(scanner.next());
				System.out.println("Teacher'semail:");
				teacher.setEmail(scanner.next());
				s.add(teacher);
				course.setTeacher(s);
				Course tempCourse=factory.createCourse(course);
				System.out.println("course added sucessfully..");
				System.out.println(tempCourse);
				break;

			case 2:
				Collection<Course> c=factory.displayAllCourses();
				System.out.println(c);
			case 0:
				System.out.println("bye");
			
			default:
				break;
			}
		} while (choice != 0);

	}

}
