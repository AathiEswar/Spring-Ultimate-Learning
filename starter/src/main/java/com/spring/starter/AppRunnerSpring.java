package com.spring.starter;

import com.spring.starter.game.GameConsole;
import com.spring.starter.game.GameRunner;
import com.spring.starter.gameSpring.AppRunnerSpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunnerSpring {
    public static void main(String[] args) {
        // automatically closes all the resources at the end of lifecycle
        try(var context = new AnnotationConfigApplicationContext(AppRunnerSpringConfig.class)){
            context.getBean(GameRunner.class).run();

        }
    }
}
