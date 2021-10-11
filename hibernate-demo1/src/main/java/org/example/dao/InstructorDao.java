package org.example.dao;

import org.example.entity.Instructor;

import java.util.List;

public interface InstructorDao {

    public Instructor createInstructor(Instructor instructor);
    public List<Instructor> displayAllInstructor();

    public Instructor getInstructorById(Integer instructorId);
    public Instructor getInstructorByUniqueId(String uniqueId);
}
