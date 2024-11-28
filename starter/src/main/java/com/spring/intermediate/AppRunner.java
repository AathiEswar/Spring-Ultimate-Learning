package com.spring.intermediate;

import com.spring.intermediate.game.GameRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.intermediate.game.GameConsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// used to scan componenets in any packages
@ComponentScan("com.spring.intermediate.game")
public class AppRunner {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AppRunner.class)){
            System.out.println("Spring Ioc Started Config");
            context.getBean(GameRunner.class).run();
        }
    }
}
