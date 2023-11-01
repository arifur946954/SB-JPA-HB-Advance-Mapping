package com.jpa.JpaCrud.dao;

import com.jpa.JpaCrud.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class AppDaoImp implements AppDao{
    private EntityManager entityManager;
     @Autowired
    public AppDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor) {
         entityManager.persist(theInstructor);

    }

    @Override
    public Instructor findInstructorById(int theId) {
        return entityManager.find(Instructor.class ,theId);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int theId) {
      Instructor theInstructor=   entityManager.find(Instructor.class ,theId);
        entityManager.remove(theInstructor);
    }
}
