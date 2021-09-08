package org.example;

import java.util.LinkedList;
import java.util.List;

public class Course {
	private String courseName;
	private String publisherName;
	private double enrollmentFees;
	
	private List<Teacher> teacher;
	public Course() {
		super();
		teacher=new LinkedList<Teacher>();
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public double getEnrollmentFees() {
		return enrollmentFees;
	}
	public void setEnrollmentFees(double enrollmentFees) {
		this.enrollmentFees = enrollmentFees;
	}
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", publisherName=" + publisherName + ", enrollmentFees="
				+ enrollmentFees + ", teacher=" + teacher + "]";
	}

}
