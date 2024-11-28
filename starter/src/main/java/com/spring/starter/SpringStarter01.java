package com.spring.starter;

import com.spring.starter.starter01.Address;
import com.spring.starter.starter01.Person;
import com.spring.starter.starter01.Starter01Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

// POJO - Plain old Java Object
// Java Bean - no arg constructor , getters and setters , implements serializable
// Spring Bean - any object managed by Spring

// Spring IoC container(Bean/Application) - Creates , configures , assembles, and manages life cycle of all the components
/*
*  ------------------------------------------------------------
*  | JVM                                                       |
*  |    |-----------------------------------------------|      |
*  |    | Sprint IoC                                    |      |
*  |    |                                               |      |
*  |    |                                               |      |
*  |    |-----------------------------------------------|      |
*  |                                                           |
*  |-----------------------------------------------------------|
*
*
* */
public class SpringStarter01 {
    public static void main(String[] args){
        // 1 : Start a Spring Context
        // Ioc Container for Spring
        // helps for scanning and registering the beans (accepts @Configuration and @Component )
        try(var context = new AnnotationConfigApplicationContext(Starter01Configuration.class)){
            // 2 : Configure Spring @Configuration
            // ACCESS a bean
            // using its name
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("personRecord"));
            System.out.println(context.getBean("personMethodCall"));
            System.out.println(context.getBean("personParameters"));
            System.out.println(context.getBean("address1"));

            // using its type
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean(Person.class));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
