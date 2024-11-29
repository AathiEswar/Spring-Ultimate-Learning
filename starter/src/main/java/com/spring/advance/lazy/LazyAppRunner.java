package com.spring.advance.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A{

}
@Component
// use to initialize only when it is being used
@Lazy
class B{
    // dependency
    public A classA;

    @Autowired
    public B(A classA) {
        System.out.println("Initialize B");
        this.classA = classA;
    }
}
@Configuration
@ComponentScan
public class LazyAppRunner {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyAppRunner.class)){

        }
    }
}
