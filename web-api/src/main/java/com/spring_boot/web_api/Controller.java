package com.spring_boot.web_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

record  Course(int id , String name , String author){};
@RestController
public class Controller {

    @GetMapping(value = "/courses")
    public List<Course> getCourses(){
        return Arrays.asList(new Course(21 , "java" , "Aathi"));
    }

}
