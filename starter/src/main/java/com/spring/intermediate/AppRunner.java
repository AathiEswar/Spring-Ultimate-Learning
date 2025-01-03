package com.spring.intermediate;

import com.spring.intermediate.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// used to scan components in any packages
@ComponentScan("com.spring.intermediate.game")
public class AppRunner {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AppRunner.class)){
            System.out.println("Spring Ioc Started Config");
            context.getBean(GameRunner.class).run();
        }
    }
}
