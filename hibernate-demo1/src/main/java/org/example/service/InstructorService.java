package org.example.service;

import org.example.entity.Instructor;

import java.util.List;

public interface InstructorService {
    public Instructor createInstructor(Instructor instructor);
    public List<Instructor> displayAllInstructor();
}
