package org.example.service;

import org.example.dao.InstructorDao;
import org.example.dao.InstructorDaoImpl;
import org.example.entity.Instructor;

import java.util.List;

public class InstructorServiceImpl implements InstructorService{

    private InstructorDao instructorDao;

    {
        instructorDao=new InstructorDaoImpl();
    }

    @Override
    public Instructor createInstructor(Instructor instructor) {
        return instructorDao.createInstructor(instructor);
    }

    @Override
    public List<Instructor> displayAllInstructor() {
        return instructorDao.displayAllInstructor();
    }


    @Override
    public Instructor getInstructorById(Integer instructorId) {
        return instructorDao.getInstructorById(instructorId);
    }

    @Override
    public Instructor getInstructorByUniqueId(String uniqueId) {
        return instructorDao.getInstructorByUniqueId(uniqueId);
    }
}
