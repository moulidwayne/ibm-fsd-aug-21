package org.example.factory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.example.Course;

public class CourseFacoryImpl implements CourseFactory{
private Map<String, Course> courses;
	

	public CourseFacoryImpl() {
	super();
	courses=new HashMap<String, Course>();
}

	@Override
	public Course createCourse(Course course) {
	String str[]=UUID.randomUUID().toString().split("-");
	courses.put(str[0], course);
	System.out.println(courses);
		return course;
	}

	@Override
	public Collection<Course> displayAllCourses() {
		
		return courses.values();
	}

}
