package com.spring_boot.jpa_and_hibernate;

import com.spring_boot.jpa_and_hibernate.Course.Course;
import com.spring_boot.jpa_and_hibernate.CourseRepository.CourseJDBCRepository;
import com.spring_boot.jpa_and_hibernate.CourseRepository.CourseJPARepository;
import com.spring_boot.jpa_and_hibernate.CourseRepository.CourseSpringJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Executes a bean at the start of the execution
@Component
public class CommandLineRunnerJDBC implements CommandLineRunner {

    // auto wire the repository through field
//    @Autowired
//    private CourseJDBCRepository repository;

//    @Autowired
//    private CourseJPARepository repository;

    @Autowired
    private CourseSpringJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        // run the particular method
        repository.save(new Course(5 , "Java" , "Aathi"));
        repository.save(new Course(6 , "JS" , "Aathi"));

        repository.deleteById(5l);

        System.out.println(" Finding Id : " + repository.findById(6l));
        System.out.println(" Finding All : " + repository.findAll());
        System.out.println(" Total Count : " + repository.count());

        System.out.println("Find by Author : " + repository.findByAuthor("Aathi"));
        System.out.println("Find by Name : " + repository.findByName("Java"));
    }
}
