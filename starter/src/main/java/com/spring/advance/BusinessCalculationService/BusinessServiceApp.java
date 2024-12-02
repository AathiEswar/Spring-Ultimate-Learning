package com.spring.advance.BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Types of Component annotations
// @Repository - the component that works with databases
// @Services -  the component that works with business logic
// @Controller -  the component that works with web
@Configuration
@ComponentScan
public class BusinessServiceApp {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BusinessServiceApp.class)){
            System.out.println("Running Business Service");
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
