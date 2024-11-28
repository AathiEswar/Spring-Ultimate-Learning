package com.spring.BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

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
