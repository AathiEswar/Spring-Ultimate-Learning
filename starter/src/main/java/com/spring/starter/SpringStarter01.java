package com.spring.starter;

import com.spring.starter.starter01.Address;
import com.spring.starter.starter01.Person;
import com.spring.starter.starter01.Starter01Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Spring IoC container - Creates , configures , assembles, and manages life cycle of all the components
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
        var context = new AnnotationConfigApplicationContext(Starter01Configuration.class);
        // 2 : Configure Spring @Configuration

        // ACCESS a bean
        // using its name
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address1"));

        // using its type
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class));
    }
}
