package com.spring.dependencyInjection;

import com.spring.dependencyInjection.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
// used to scan components in any packages
@ComponentScan
public class AppRunner {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AppRunner.class)){
            System.out.println("Spring Ioc Started Config");
            context.getBean(GameRunner.class).run();
            System.out.println("Spring Beans:");
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
