package com.spring.starter;

import com.spring.starter.game.ContraGame;
import com.spring.starter.game.GameRunner;
import com.spring.starter.game.MarioGame;
import com.spring.starter.game.PacmanGame;

public class AppRunnerBasic {
    public static void main(String[] args) {
        // object creations
        var contraGame = new ContraGame();
        var marioGame = new MarioGame();
        var pacmanGame = new PacmanGame();

        // Container creation and Dependency injection ( gamingConsole -> gameRunner )
        var gameRunner = new GameRunner(marioGame);
        var gameRunner2 = new GameRunner(contraGame);
        var gameRunner3 = new GameRunner(pacmanGame);

        // start the service
        gameRunner.run();
        gameRunner2.run();
        gameRunner3.run();
    }
}
