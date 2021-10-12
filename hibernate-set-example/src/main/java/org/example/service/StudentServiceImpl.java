package org.example.service;

import org.example.dao.StudentDao;
import org.example.dao.StudentDaoImpl;
import org.example.model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private StudentDao studentDao;

    public StudentServiceImpl() {
        studentDao=new StudentDaoImpl();
    }

    @Override
    public Student createStudent(Student student) {
        return studentDao.createStudent(student);
    }

    @Override
    public List<Student> displayStudents() {
        return studentDao.displayStudents();
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public Student updateStudentById(Integer id) {
        return studentDao.updateStudentById(id);
    }

    @Override
    public void removeStudentById(Integer id) {
        studentDao.removeStudentById(id);
    }
}
