package com.learncoding.spahibernet.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void inset(JPACourse course) {
        entityManager.merge(course);
    }

    public JPACourse findById(long id) {
        return entityManager.find(JPACourse.class,id);
    }

    public void deleteById (long id) {
        try {
            JPACourse course =   entityManager.find(JPACourse.class,id);
            entityManager.remove(course);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
