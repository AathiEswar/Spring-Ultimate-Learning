package com.spring_boot.jpa_and_hibernate;

import com.spring_boot.jpa_and_hibernate.CourseRepository.CourseJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Executes a bean at the start of the execution
@Component
public class CommandLineRunnerJDBC implements CommandLineRunner {

    // auto wire the repository through field
    @Autowired
    private CourseJDBCRepository repository;
    @Override
    public void run(String... args) throws Exception {
        // run the particular method
        repository.insert();
    }
}
