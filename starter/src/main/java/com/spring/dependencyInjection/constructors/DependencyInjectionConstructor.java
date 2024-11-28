package com.spring.dependencyInjection.constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClassConstructor {
    Dependency1Constructor dependency1;
    Dependency2Constructor dependency2;

    public BusinessClassConstructor(Dependency1Constructor dependency1, Dependency2Constructor dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Dependencies :").append(dependency1).append(" , ").append(dependency2);
        return sb.toString();
    }
}

@Component
class Dependency1Constructor {
}

@Component
class Dependency2Constructor {
}

@Configuration
// used to scan components in any packages
@ComponentScan
public class DependencyInjectionConstructor {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionConstructor.class)) {
            System.out.println("Spring Beans:");
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClassConstructor.class));
        }
    }
}
