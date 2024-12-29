package com.spring_boot.jpa_and_hibernate.CourseRepository;

import com.spring_boot.jpa_and_hibernate.Course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringJPARepository extends JpaRepository<Course, Long> {

    // Custom methods : Give proper naming convention , return type and arguments
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
