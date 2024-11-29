package com.spring.advance.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Singleton{}

@Component
@Scope(value = "prototype")
class Prototype{}
@Configuration
@ComponentScan
public class ScopeAppRunner {
    public static void main(String[] args) {
       try(var context = new AnnotationConfigApplicationContext(ScopeAppRunner.class)){
           System.out.println("Scope App Runner Started");
           Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

           // returns same instance
           System.out.println(context.getBean(Singleton.class));
           System.out.println(context.getBean(Singleton.class));
           System.out.println(context.getBean(Singleton.class));

           // different instances
           System.out.println(context.getBean(Prototype.class));
           System.out.println(context.getBean(Prototype.class));
           System.out.println(context.getBean(Prototype.class));
       }
    }
}
