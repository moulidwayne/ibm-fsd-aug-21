package org.example.service;

import org.example.model.Student;

import java.util.List;

public interface StudentService {
    public Student createStudent(Student student);
    public List<Student> displayStudents();
    public Student getStudentById(Integer id);
    public Student updateStudentById(Integer id);
    public void removeStudentById(Integer id);
}
