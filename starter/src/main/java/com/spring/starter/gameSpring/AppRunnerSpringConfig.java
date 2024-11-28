package com.spring.starter.gameSpring;

import com.spring.starter.game.GameConsole;
import com.spring.starter.game.GameRunner;
import com.spring.starter.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppRunnerSpringConfig {

    @Bean
    public GameConsole gameConsoleSpring(){
        var pacMan = new PacmanGame();
        return pacMan;
    }

    @Bean
    public GameRunner gameRunner(GameConsole gameConsoleSpring){
        var gameRunner = new GameRunner(gameConsoleSpring);
        return gameRunner;
    }
}
