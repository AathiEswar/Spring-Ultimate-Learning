package com.spring.advance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class A{

}
@Component
class B{
    // dependency
    public A classA;

    @Autowired
    public B(A classA) {
        this.classA = classA;
    }
}
@Configuration
@ComponentScan
public class AdvanceAppRunner {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AdvanceAppRunner.class)){

        }
    }
}
