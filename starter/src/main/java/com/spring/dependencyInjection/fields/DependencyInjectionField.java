package com.spring.dependencyInjection.fields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClass{
    @Autowired
    Dependency1 dependency1;
    @Autowired
    Dependency2 dependency2;

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Dependencies :").append(dependency1).append(" , ").append(dependency2);
        return sb.toString();
    }
}
@Component
class Dependency1{}
@Component
class Dependency2{}

@Configuration
// used to scan components in any packages
@ComponentScan
public class DependencyInjectionField {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionField.class)){
            System.out.println("Spring Beans:");
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class));
        }
    }
}
