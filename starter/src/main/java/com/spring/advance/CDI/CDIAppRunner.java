package com.spring.advance.CDI;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
// alternative to @Component by Jakarta
@Named
class BusinessService{
    private DataService dataService;

    //@Autowired
    // alternative for @Autowired by Jakarta
    @Inject
    public DataService setDataService() {
        System.out.println("Setter getting injected");
        return dataService;
    }

    public BusinessService(DataService dataService) {
        System.out.println("Setter Injection Done");
        this.dataService = dataService;
    }
}

//@Component
@Named
class DataService{}
@Configuration
@ComponentScan
public class CDIAppRunner {
    public static void main(String[] args) {
       try(var context = new AnnotationConfigApplicationContext(CDIAppRunner.class)){
           System.out.println("CDI App Runner Started");

           System.out.println(context.getBean(BusinessService.class).setDataService());
       }
    }
}
