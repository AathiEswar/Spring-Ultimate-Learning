package com.spring.dependencyInjection.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    // automatically inject the dependency that is preferred
    @Autowired
    // name of the qualifier to be injected
    @Qualifier("Pacman")
    GameConsole game ;
    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running the game" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
