package com.jpa.JpaCrud.dao;

import com.jpa.JpaCrud.entity.Instructor;

public interface AppDao {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
}
