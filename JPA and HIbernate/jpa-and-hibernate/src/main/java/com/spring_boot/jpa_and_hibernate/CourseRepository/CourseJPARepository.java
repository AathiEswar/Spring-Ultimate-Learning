package com.spring_boot.jpa_and_hibernate.CourseRepository;

import com.spring_boot.jpa_and_hibernate.Course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {
    // Entity Manager for managing the bean entity
    @PersistenceContext // Manages the entity lifecycle
    private EntityManager entityManager;

    // all the mappings are done internally
    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class , id);
    }

    public void deleteById(long id){
        Course course = entityManager.find(Course.class , id);
        entityManager.remove(course);
    }
}
