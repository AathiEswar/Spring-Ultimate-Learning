package com.spring.dependencyInjection.setters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClassSetter {
    Dependency1Setter dependency1;
    Dependency2Setter dependency2;

    @Autowired
    public void setDependency1(Dependency1Setter dependency1) {
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2Setter dependency2) {
        this.dependency2 = dependency2;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Dependencies :").append(dependency1).append(" , ").append(dependency2);
        return sb.toString();
    }
}
@Component
class Dependency1Setter{}
@Component
class Dependency2Setter{}

@Configuration
// used to scan components in any packages
@ComponentScan
public class DependencyInjectionSetters {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionSetters.class)){
            System.out.println("Spring Beans:");
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClassSetter.class));
        }
    }
}
