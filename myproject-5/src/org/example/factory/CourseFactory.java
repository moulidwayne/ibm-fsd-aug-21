package org.example.factory;

import java.util.Collection;

import org.example.Course;

public interface CourseFactory {
	
	public Course createCourse(Course course);
	public Collection<Course> displayAllCourses();

}
