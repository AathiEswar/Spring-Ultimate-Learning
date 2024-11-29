package com.spring.advance.LifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Package{
    private Dependency dependency;

    public Package(Dependency dependency) {
        super();
        System.out.println("Dependency injected");
        this.dependency = dependency;
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Initializing After creation");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Cleaning Up Before Destroy");
    }
}

@Component
class Dependency{

}

@Configuration
@ComponentScan
public class LifeCycleAppRunner {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LifeCycleAppRunner.class)){
            System.out.println("Life Cycle app started");
        }
    }
}
